package nl.beerik.starwormlighting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.beerik.starwormlighting.config.SWLConfig;
import nl.beerik.starwormlighting.world.gen.WorldGenerator;

@Mod(modid = StarWormLighting.MODID, name = StarWormLighting.NAME, version = StarWormLighting.VERSION, acceptedMinecraftVersions = StarWormLighting.MC_VERSION)
public class StarWormLighting {
	
	public static final String MODID = "starwormlighting";
	public static final String NAME = "Star Worm Lighting";
	public static final String VERSION = "@VERSION@";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(StarWormLighting.MODID);
	
	public static final CreativeTabs TAB = new StarWormLightingTab();
	
	@Instance
	public static StarWormLighting INSTANCE;
	
	public SWLConfig config;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new SWLConfig(null, event.getSuggestedConfigurationFile());
		
		GameRegistry.registerWorldGenerator(new WorldGenerator(), 3);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//
	}
}
