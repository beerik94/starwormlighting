package nl.beerik.starwormlighting.config;

import java.io.File;

import javax.annotation.Nullable;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.beerik.starwormlighting.StarWormLighting;

public class SWLConfig {
	private Configuration config;
	private SWLConfig originalClientVersion;
	
	// World Generation
	public int veinSize;
	public int veinPerChunk;
	
	private static final String WORLDGEN = "worldgen";
	
	public SWLConfig(@Nullable SWLConfig originalClientVersion, File configFile) {
		this(originalClientVersion, new Configuration(configFile));
	}
	
	public SWLConfig(@Nullable SWLConfig originalClientVersion, Configuration config) {
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
		if (event.getModID().equals(StarWormLighting.MODID)) {
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
