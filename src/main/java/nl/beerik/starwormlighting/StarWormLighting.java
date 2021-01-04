package nl.beerik.starwormlighting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import nl.beerik.starwormlighting.config.ConfigHolder;
import nl.beerik.starwormlighting.config.SWLConfig;
import nl.beerik.starwormlighting.init.SWLBlocks;
import nl.beerik.starwormlighting.init.SWLItems;
import nl.beerik.starwormlighting.world.OreGeneration;

@Mod(StarWormLighting.MODID)
public class StarWormLighting {
	
	public static final String MODID = "starwormlighting";
	
	public static final Logger LOGGER = LogManager.getLogger(StarWormLighting.MODID);
	
	public static final ItemGroup GROUP = new StarWormLightingItemGroup(MODID, () -> new ItemStack(SWLItems.STAR_WORM.get()));
	
	public SWLConfig config;
	
	public StarWormLighting() {
		
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
		
		SWLBlocks.BLOCKS.register(modEventBus);
		SWLItems.ITEMS.register(modEventBus);
		
		// Register config
		//modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigHolder.CLIENT_SPEC);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.registerOres();
	}
}
