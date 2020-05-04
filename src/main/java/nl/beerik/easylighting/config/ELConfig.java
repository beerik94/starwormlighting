package nl.beerik.easylighting.config;

import java.io.File;

import javax.annotation.Nullable;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.beerik.easylighting.EasyLighting;

public class ELConfig {
	private Configuration config;
	private ELConfig originalClientVersion;
	
	// World Generation
	public int veinSize;
	public int veinPerChunk;
	
	private static final String WORLDGEN = "worldgen";
	
	public ELConfig(@Nullable ELConfig originalClientVersion, File configFile) {
		this(originalClientVersion, new Configuration(configFile));
	}
	
	public ELConfig(@Nullable ELConfig originalClientVersion, Configuration config) {
		this.originalClientVersion = originalClientVersion;
		this.config = config;
		
		MinecraftForge.EVENT_BUS.register(this);
		
		this.loadConfig();
	}
	
	public Configuration getConfig() {
		return config;
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(EasyLighting.MODID)) {
			loadConfig();
		}
	}
	
	private void loadConfig() {
		veinSize = config.getInt("veinSize", WORLDGEN, 7, 1, 64, "VeinSize Star Worm Cobblestone");
		veinPerChunk = config.getInt("veinPerChunk", WORLDGEN, 2, 0, 64, "VeinPerChunk Star Worm Cobblestone");
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}
