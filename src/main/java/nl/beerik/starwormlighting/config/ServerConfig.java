package nl.beerik.starwormlighting.config;

import net.minecraftforge.common.ForgeConfigSpec;
import nl.beerik.starwormlighting.StarWormLighting;

final class ServerConfig {
	final ForgeConfigSpec.IntValue veinSize;
	final ForgeConfigSpec.IntValue veinPerChunk;

	ServerConfig(final ForgeConfigSpec.Builder builder) {
		builder.push("worldgen");
		veinSize = builder
				.comment("The size of star worm cobble veins")
				.translation(StarWormLighting.MODID + ".config.veinSize")
				.defineInRange("veinSize", 7, 0, Integer.MAX_VALUE);
		veinPerChunk = builder
				.comment("The amount of star worm cobble veins per chunk")
				.translation(StarWormLighting.MODID + ".config.veinPerChunk")
				.defineInRange("veinPerChunk", 2, 0, Integer.MAX_VALUE);
		builder.pop();
	}
}
