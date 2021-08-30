package io.github.chaosawakens.api;

import net.minecraft.block.PortalInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

import javax.annotation.Nullable;
import java.util.function.Function;

/**
 * @author invalid2
 */
public class HeightmapTeleporter implements ITeleporter {

    @Nullable
    public PortalInfo getPortalInfo(Entity entity, ServerWorld targetWorld, Function<ServerWorld, PortalInfo> defaultPortalInfo) {
        //ChaosAwakens.debug("TELEPORTER", entity+" "+targetWorld);
        WorldBorder border = targetWorld.getWorldBorder();
        double coordDiff = DimensionType.getTeleportationScale(entity.level.dimensionType(), targetWorld.dimensionType());

        //You know how walking a block on the nether equals to X in the overworld, this is checking for it
        Vector3d newPosVector = new Vector3d(
                MathHelper.clamp(entity.getX() * coordDiff * 1.0, Math.max(-2.9999872E7D, border.getMinX() + 16.0D), Math.min(2.9999872E7D, border.getMaxX() - 16.0D)),
                entity.getY(),
                MathHelper.clamp(entity.getZ() * coordDiff * 1.0, Math.max(-2.9999872E7D, border.getMinZ() + 16.0D), Math.min(2.9999872E7D, border.getMaxZ() - 16.0D)));


        BlockPos entityPos = entity.blockPosition();
        //Load target chunk
        targetWorld.getChunk(new BlockPos(newPosVector));

        //Get a valid Y pos for the targeted block
        BlockPos targetPos;
        do {
            targetPos = new BlockPos(newPosVector.x(), targetWorld.getHeight(Heightmap.Type.WORLD_SURFACE, (int) newPosVector.x(), (int) newPosVector.z()), newPosVector.z());
        } while (targetPos.getY() == 0);

        return new PortalInfo(new Vector3d(newPosVector.x(), targetPos.getY(), newPosVector.z()), new Vector3d(0, 0, 0), entity.yRot, entity.xRot);
    }

    @Override
    public boolean isVanilla() {
        return false;
    }

    @Override
    public boolean playTeleportSound(ServerPlayerEntity player, ServerWorld sourceWorld, ServerWorld destWorld) {
        return false;
    }
}
