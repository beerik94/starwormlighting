package nl.beerik.easylighting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EasyLighting.MODID, name = EasyLighting.NAME, version = EasyLighting.VERSION, acceptedMinecraftVersions = EasyLighting.MC_VERSION)
public class EasyLighting {
	
	public static final String MODID = "easylighting";
	public static final String NAME = "Easy Lighting";
	public static final String VERSION = "@VERSION@";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(EasyLighting.MODID);
	
	public static final CreativeTabs TAB = new EasyLightingTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//
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
