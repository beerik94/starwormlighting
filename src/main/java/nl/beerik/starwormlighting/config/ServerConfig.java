package nl.beerik.starwormlighting.config;

import net.minecraftforge.common.ForgeConfigSpec;
import nl.beerik.starwormlighting.StarWormLighting;

final class ServerConfig {
	final ForgeConfigSpec.IntValue cobbleVeinSize;
	final ForgeConfigSpec.IntValue cobbleVeinPerChunk;
	
	final ForgeConfigSpec.IntValue amethystVeinSize;
	final ForgeConfigSpec.IntValue amethystVeinPerChunk;
	
	final ForgeConfigSpec.IntValue cantazariteVeinSize;
	final ForgeConfigSpec.IntValue cantazariteVeinPerChunk;

	ServerConfig(final ForgeConfigSpec.Builder builder) {
		builder.push("worldgen");
		cobbleVeinSize = builder
				.comment("The size of star worm cobble veins")
				.translation(StarWormLighting.MODID + ".config.cobbleVeinSize")
				.defineInRange("cobbleVeinSize", 7, 0, Integer.MAX_VALUE);
		cobbleVeinPerChunk = builder
				.comment("The amount of star worm cobble veins per chunk")
				.translation(StarWormLighting.MODID + ".config.cobbleVeinPerChunk")
				.defineInRange("cobbleVeinPerChunk", 2, 0, Integer.MAX_VALUE);
		amethystVeinSize = builder
				.comment("The size of star worm amethyst veins")
				.translation(StarWormLighting.MODID + ".config.amethystVeinSize")
				.defineInRange("amethystVeinSize", 7, 0, Integer.MAX_VALUE);
		amethystVeinPerChunk = builder
				.comment("The amount of star worm amethyst veins per chunk")
				.translation(StarWormLighting.MODID + ".config.amethystVeinPerChunk")
				.defineInRange("amethystVeinPerChunk", 2, 0, Integer.MAX_VALUE);
		cantazariteVeinSize = builder
				.comment("The size of star worm cantazarite veins")
				.translation(StarWormLighting.MODID + ".config.cantazariteVeinSize")
				.defineInRange("cantazariteVeinSize", 7, 0, Integer.MAX_VALUE);
		cantazariteVeinPerChunk = builder
				.comment("The amount of star worm cantazarite veins per chunk")
				.translation(StarWormLighting.MODID + ".config.cantazariteVeinPerChunk")
				.defineInRange("cantazariteVeinPerChunk", 2, 0, Integer.MAX_VALUE);
		builder.pop();
	}
}
