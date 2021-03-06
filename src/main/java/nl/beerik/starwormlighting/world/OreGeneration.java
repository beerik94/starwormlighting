package nl.beerik.starwormlighting.world;

import java.util.ArrayList;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import nl.beerik.starwormlighting.StarWormLighting;
import nl.beerik.starwormlighting.config.SWLConfig;
import nl.beerik.starwormlighting.init.SWLBlocks;

@Mod.EventBusSubscriber
public class OreGeneration {
	
	private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
  //private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
  //private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();
	
	public static void registerOres() {
    //Overworld Ore Register
    overworldOres.add(register("star_worm_cobble", Feature.ORE.withConfiguration(new OreFeatureConfig(
            OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, SWLBlocks.STAR_WORM_COBBLE.get().getDefaultState(), SWLConfig.CobbleVeinSize)) //Vein Size
            .range(64).square() //Spawn height start
            .func_242731_b(SWLConfig.CobbleVeinPerChunk))); //Chunk spawn frequency
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
  public static void gen(BiomeLoadingEvent event) {
      BiomeGenerationSettingsBuilder generation = event.getGeneration();
      if(event.getCategory().equals(Biome.Category.NETHER)){
          //
      }
      if(event.getCategory().equals(Biome.Category.THEEND)){
          //
      }
      for(ConfiguredFeature<?, ?> ore : overworldOres){
          if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
      }
  }
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
    return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, StarWormLighting.MODID + ":" + name, configuredFeature);
	}
}
