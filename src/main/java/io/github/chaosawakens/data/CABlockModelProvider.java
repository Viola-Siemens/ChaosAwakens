package io.github.chaosawakens.data;

import io.github.chaosawakens.ChaosAwakens;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * @author invalid2
 */
public class CABlockModelProvider extends BlockModelProvider {
	
	/**
	 * @param generator
	 * @param modid
	 * @param existingFileHelper
	 */
	public CABlockModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		// TODO Automate the data generators
		this.cubeAll("fossilised_ent", chaosRL("fossilised_ent"));
		this.cubeAll("fossilised_hercules_beetle", chaosRL("fossilised_hercules_beetle"));
		this.cubeAll("fossilised_ruby_bug", chaosRL("fossilised_ruby_bug"));
		this.cubeAll("fossilised_emerald_gator", chaosRL("fossilised_emerald_gator"));
		this.cubeAll("fossilised_wtf", chaosRL("fossilised_wtf"));
		this.cubeAll("fossilised_scorpion", chaosRL("fossilised_scorpion"));
		this.cubeAll("fossilised_wasp", chaosRL("fossilised_wasp"));
		this.cubeAll("fossilised_piraporu", chaosRL("fossilised_piraporu"));
		this.cubeAll("fossilised_apple_cow", chaosRL("fossilised_apple_cow"));
		this.cubeAll("fossilised_golden_apple_cow", chaosRL("fossilised_golden_apple_cow"));
		this.cubeAll("fossilised_carrot_pig", chaosRL("fossilised_carrot_pig"));
		this.cubeAll("fossilised_golden_carrot_pig", chaosRL("fossilised_golden_carrot_pig"));

		this.cubeAll("fossilised_bee", chaosRL("fossilised_bee"));
		this.cubeAll("fossilised_cave_spider", chaosRL("fossilised_cave_spider"));
		this.cubeAll("fossilised_chicken", chaosRL("fossilised_chicken"));
		this.cubeAll("fossilised_cod", chaosRL("fossilised_cod"));
		this.cubeAll("fossilised_cow", chaosRL("fossilised_cow"));
		this.cubeAll("fossilised_drowned", chaosRL("fossilised_drowned"));
		this.cubeAll("fossilised_fox", chaosRL("fossilised_fox"));
		this.cubeAll("fossilised_husk", chaosRL("fossilised_husk"));
//		this.cubeBottomTop("fossilised_husk", chaosRL("fossilised_husk"), mcRL("sandstone_bottom"), mcRL("sandstone_top"));
		this.cubeAll("fossilised_pig", chaosRL("fossilised_pig"));
		this.cubeAll("fossilised_pufferfish", chaosRL("fossilised_pufferfish"));
		this.cubeAll("fossilised_rabbit", chaosRL("fossilised_rabbit"));
		this.cubeAll("fossilised_salmon", chaosRL("fossilised_salmon"));
		this.cubeAll("fossilised_sheep", chaosRL("fossilised_sheep"));
		this.cubeAll("fossilised_slime", chaosRL("fossilised_slime"));
		this.cubeAll("fossilised_spider", chaosRL("fossilised_spider"));
		this.cubeAll("fossilised_zombie", chaosRL("fossilised_zombie"));

		this.cubeAll("ruby_ore", chaosRL("ruby_ore"));
		this.cubeAll("netherrack_ruby_ore", chaosRL("netherrack_ruby_ore"));
		this.cubeAll("blackstone_ruby_ore", chaosRL("blackstone_ruby_ore"));

		this.cubeColumn("apple_log", chaosRL("apple_log"), chaosRL("apple_log_top"));
		this.cubeColumnHorizontal("apple_log", chaosRL("apple_log"), chaosRL("apple_log_top"));
		this.cubeColumn("stripped_apple_log", chaosRL("stripped_apple_log"), chaosRL("stripped_apple_log_top"));
		this.cubeColumnHorizontal("stripped_apple_log", chaosRL("stripped_apple_log"), chaosRL("stripped_apple_log_top"));
		this.cubeColumn("cherry_log", chaosRL("cherry_log"), chaosRL("cherry_log_top"));
		this.cubeColumnHorizontal("cherry_log", chaosRL("cherry_log"), chaosRL("cherry_log_top"));
		this.cubeColumn("stripped_cherry_log", chaosRL("stripped_cherry_log"), chaosRL("stripped_cherry_log_top"));
		this.cubeColumnHorizontal("stripped_cherry_log", chaosRL("stripped_cherry_log"), chaosRL("stripped_cherry_log_top"));
		this.cubeColumn("peach_log", chaosRL("peach_log"), chaosRL("peach_log_top"));
		this.cubeColumnHorizontal("peach_log", chaosRL("peach_log"), chaosRL("peach_log_top"));
		this.cubeColumn("stripped_peach_log", chaosRL("stripped_peach_log"), chaosRL("stripped_peach_log_top"));
		this.cubeColumnHorizontal("stripped_peach_log", chaosRL("stripped_peach_log"), chaosRL("stripped_peach_log_top"));
		this.cubeColumn("duplication_log", chaosRL("duplication_log"), chaosRL("duplication_log_top"));
		this.cubeColumnHorizontal("duplication_log", chaosRL("duplication_log"), chaosRL("duplication_log_top"));
		this.cubeColumn("stripped_duplication_log", chaosRL("stripped_duplication_log"), chaosRL("stripped_duplication_log_top"));
		this.cubeColumnHorizontal("stripped_duplication_log", chaosRL("stripped_duplication_log"), chaosRL("stripped_duplication_log_top"));
		this.cubeColumn("dead_duplication_log", chaosRL("dead_duplication_log"), chaosRL("dead_duplication_log_top"));
		this.cubeColumnHorizontal("dead_duplication_log", chaosRL("dead_duplication_log"), chaosRL("dead_duplication_log_top"));
		this.cubeColumn("skywood_log", chaosRL("skywood_log"), chaosRL("skywood_log_top"));
		this.cubeColumnHorizontal("skywood_log", chaosRL("skywood_log"), chaosRL("skywood_log_top"));
		this.cubeColumn("stripped_skywood_log", chaosRL("stripped_skywood_log"), chaosRL("stripped_skywood_log_top"));
		this.cubeColumnHorizontal("stripped_skywood_log", chaosRL("stripped_skywood_log"), chaosRL("stripped_skywood_log_top"));
		this.cubeAll("apple_planks", chaosRL("apple_planks"));
		this.cubeAll("apple_leaves", chaosRL("apple_leaves"));
		this.cubeAll("apple_leaves_ripe", chaosRL("apple_leaves_ripe"));
		this.cross("apple_sapling", chaosRL("apple_sapling"));
		this.cubeAll("cherry_planks", chaosRL("cherry_planks"));
		this.cubeAll("cherry_leaves", chaosRL("cherry_leaves"));
		this.cubeAll("cherry_leaves_ripe", chaosRL("cherry_leaves_ripe"));
		this.cross("cherry_sapling", chaosRL("cherry_sapling"));
		this.cubeAll("peach_planks", chaosRL("peach_planks"));
		this.cubeAll("peach_leaves", chaosRL("peach_leaves"));
		this.cubeAll("peach_leaves_ripe", chaosRL("peach_leaves_ripe"));
		this.cross("peach_sapling", chaosRL("peach_sapling"));
		this.cubeAll("duplication_planks", chaosRL("duplication_planks"));
		this.cubeAll("duplication_leaves", chaosRL("duplication_leaves"));
		this.cubeAll("skywood_planks", chaosRL("skywood_planks"));
//		this.cubeAll("skywood_leaves", chaosRL("skywood_leaves"));

		this.stairs("apple_stairs", chaosRL("apple_planks"), chaosRL("apple_planks"), chaosRL("apple_planks"));
		this.stairsInner("apple_stairs", chaosRL("apple_planks"), chaosRL("apple_planks"), chaosRL("apple_planks"));
		this.stairsOuter("apple_stairs", chaosRL("apple_planks"), chaosRL("apple_planks"), chaosRL("apple_planks"));
		this.stairs("cherry_stairs", chaosRL("cherry_planks"), chaosRL("cherry_planks"), chaosRL("cherry_planks"));
		this.stairsInner("cherry_stairs", chaosRL("cherry_planks"), chaosRL("cherry_planks"), chaosRL("cherry_planks"));
		this.stairsOuter("cherry_stairs", chaosRL("cherry_planks"), chaosRL("cherry_planks"), chaosRL("cherry_planks"));
		this.stairs("peach_stairs", chaosRL("peach_planks"), chaosRL("peach_planks"), chaosRL("peach_planks"));
		this.stairsInner("peach_stairs", chaosRL("peach_planks"), chaosRL("peach_planks"), chaosRL("peach_planks"));
		this.stairsOuter("peach_stairs", chaosRL("peach_planks"), chaosRL("peach_planks"), chaosRL("peach_planks"));
		this.stairs("duplication_stairs", chaosRL("duplication_planks"), chaosRL("duplication_planks"), chaosRL("duplication_planks"));
		this.stairsInner("duplication_stairs", chaosRL("duplication_planks"), chaosRL("duplication_planks"), chaosRL("duplication_planks"));
		this.stairsOuter("duplication_stairs", chaosRL("duplication_planks"), chaosRL("duplication_planks"), chaosRL("duplication_planks"));
		this.stairs("skywood_stairs", chaosRL("skywood_planks"), chaosRL("skywood_planks"), chaosRL("skywood_planks"));
		this.stairsInner("skywood_stairs", chaosRL("skywood_planks"), chaosRL("skywood_planks"), chaosRL("skywood_planks"));
		this.stairsOuter("skywood_stairs", chaosRL("skywood_planks"), chaosRL("skywood_planks"), chaosRL("skywood_planks"));

		this.slab("apple_slab", chaosRL("apple_planks"), chaosRL("apple_planks"), chaosRL("apple_planks"));
		this.slabTop("apple_slab", chaosRL("apple_planks"), chaosRL("apple_planks"), chaosRL("apple_planks"));
		this.slab("cherry_slab", chaosRL("cherry_planks"), chaosRL("cherry_planks"), chaosRL("cherry_planks"));
		this.slabTop("cherry_slab", chaosRL("cherry_planks"), chaosRL("cherry_planks"), chaosRL("cherry_planks"));
		this.slab("peach_slab", chaosRL("peach_planks"), chaosRL("peach_planks"), chaosRL("peach_planks"));
		this.slabTop("peach_slab", chaosRL("peach_planks"), chaosRL("peach_planks"), chaosRL("peach_planks"));
		this.slab("duplication_slab", chaosRL("duplication_planks"), chaosRL("duplication_planks"), chaosRL("duplication_planks"));
		this.slabTop("duplication_slab", chaosRL("duplication_planks"), chaosRL("duplication_planks"), chaosRL("duplication_planks"));
		this.slab("skywood_slab", chaosRL("skywood_planks"), chaosRL("skywood_planks"), chaosRL("skywood_planks"));
		this.slabTop("skywood_slab", chaosRL("skywood_planks"), chaosRL("skywood_planks"), chaosRL("skywood_planks"));

		this.fenceGate("apple_slab", chaosRL("apple_planks"));
		this.fenceGateOpen("apple_slab", chaosRL("apple_planks"));
		this.fenceGateWall("apple_slab", chaosRL("apple_planks"));
		this.fenceGateWallOpen("apple_slab", chaosRL("apple_planks"));
		this.fencePost("apple_slab", chaosRL("apple_planks"));
		this.fenceInventory("apple_slab", chaosRL("apple_planks"));
		this.fenceSide("apple_slab", chaosRL("apple_planks"));
		this.fenceGate("cherry_slab", chaosRL("cherry_planks"));
		this.fenceGateOpen("cherry_slab", chaosRL("cherry_planks"));
		this.fenceGateWall("cherry_slab", chaosRL("cherry_planks"));
		this.fenceGateWallOpen("cherry_slab", chaosRL("cherry_planks"));
		this.fencePost("cherry_slab", chaosRL("cherry_planks"));
		this.fenceInventory("cherry_slab", chaosRL("cherry_planks"));
		this.fenceSide("cherry_slab", chaosRL("cherry_planks"));
		this.fenceGate("peach_slab", chaosRL("peach_planks"));
		this.fenceGateOpen("peach_slab", chaosRL("peach_planks"));
		this.fenceGateWall("peach_slab", chaosRL("peach_planks"));
		this.fenceGateWallOpen("peach_slab", chaosRL("peach_planks"));
		this.fencePost("peach_slab", chaosRL("peach_planks"));
		this.fenceInventory("peach_slab", chaosRL("peach_planks"));
		this.fenceSide("peach_slab", chaosRL("peach_planks"));
		this.fenceGate("duplication_slab", chaosRL("duplication_planks"));
		this.fenceGateOpen("duplication_slab", chaosRL("duplication_planks"));
		this.fenceGateWall("duplication_slab", chaosRL("duplication_planks"));
		this.fenceGateWallOpen("duplication_slab", chaosRL("duplication_planks"));
		this.fencePost("duplication_slab", chaosRL("duplication_planks"));
		this.fenceInventory("duplication_slab", chaosRL("duplication_planks"));
		this.fenceSide("duplication_slab", chaosRL("duplication_planks"));
		this.fenceGate("skywood_slab", chaosRL("skywood_planks"));
		this.fenceGateOpen("skywood_slab", chaosRL("skywood_planks"));
		this.fenceGateWall("skywood_slab", chaosRL("skywood_planks"));
		this.fenceGateWallOpen("skywood_slab", chaosRL("skywood_planks"));
		this.fencePost("skywood_slab", chaosRL("skywood_planks"));
		this.fenceInventory("skywood_slab", chaosRL("skywood_planks"));
		this.fenceSide("skywood_slab", chaosRL("skywood_planks"));

		this.cubeAll("mining_lamp", chaosRL("mining_lamp"));
	}

	private ResourceLocation chaosRL(String texture) {
		return new ResourceLocation(ChaosAwakens.MODID, BLOCK_FOLDER + "/" + texture);
	}

	private ResourceLocation mcRL(String texture) {
		return new ResourceLocation("minecraft", BLOCK_FOLDER + "/" + texture);
	}
	
	@Override
	public BlockModelBuilder cubeAll(String name, ResourceLocation texture) {
		return singleTexture(name, mcLoc(BLOCK_FOLDER + "/cube_all"), "all", texture);
	}
	
	@Override
	public BlockModelBuilder cubeColumn(String name, ResourceLocation side, ResourceLocation end) {
		ChaosAwakens.debug("DATAGEN", side.getPath());
		return withExistingParent(name, BLOCK_FOLDER).texture("side", side).texture("end", end);
	}
	
	@Override
	public BlockModelBuilder cubeColumnHorizontal(String name, ResourceLocation side, ResourceLocation end) {
		return withExistingParent(name, BLOCK_FOLDER).texture("side", side).texture("end", end);
	}
}