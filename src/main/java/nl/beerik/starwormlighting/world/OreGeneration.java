package nl.beerik.starwormlighting.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import nl.beerik.starwormlighting.init.SWLBlocks;

public class OreGeneration {
	
	private static final int VeinSize = 7;
	private static final int VeinPerChunk = 2;
	
	public static void setupOreGeneration() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
					new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SWLBlocks.STAR_WORM_COBBLE.get().getDefaultState(), VeinSize))
						.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(VeinPerChunk, 16, 0, 64))));
		}
	}
}
