package nl.beerik.starwormlighting.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import nl.beerik.starwormlighting.config.SWLConfig;
import nl.beerik.starwormlighting.init.SWLBlocks;

public class OreGeneration {
	public static void setupOreGeneration() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
					new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SWLBlocks.STAR_WORM_COBBLE.get().getDefaultState(), SWLConfig.CobbleVeinSize))
						.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(SWLConfig.CobbleVeinPerChunk, 16, 0, 64))));
			/*biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
					new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SWLBlocks.STAR_WORM_AMETHYST_ORE.get().getDefaultState(), SWLConfig.AmethystVeinSize))
						.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(SWLConfig.AmethystVeinPerChunk, 16, 0, 64))));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
					new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SWLBlocks.STAR_WORM_CANTAZARITE_ORE.get().getDefaultState(), SWLConfig.CantazariteVeinSize))
						.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(SWLConfig.CantazariteVeinPerChunk, 16, 0, 64))));
						*/
		}
	}
}
