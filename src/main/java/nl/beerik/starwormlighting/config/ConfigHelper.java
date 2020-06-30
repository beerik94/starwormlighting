package nl.beerik.starwormlighting.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {
	public static void bakeClient(final ModConfig config) {
		//
	}

	public static void bakeServer(final ModConfig config) {
		SWLConfig.CobbleVeinSize = ConfigHolder.SERVER.cobbleVeinSize.get();
		SWLConfig.CobbleVeinPerChunk = ConfigHolder.SERVER.cobbleVeinPerChunk.get();
		
		SWLConfig.AmethystVeinSize = ConfigHolder.SERVER.amethystVeinSize.get();
		SWLConfig.AmethystVeinPerChunk = ConfigHolder.SERVER.amethystVeinPerChunk.get();
		
		SWLConfig.CantazariteVeinSize = ConfigHolder.SERVER.cantazariteVeinSize.get();
		SWLConfig.CantazariteVeinPerChunk = ConfigHolder.SERVER.cantazariteVeinPerChunk.get();
	}
}
