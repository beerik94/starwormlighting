package nl.beerik.starwormlighting.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import nl.beerik.starwormlighting.StarWormLighting;

public class RegistryUtil {
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(StarWormLighting.MODID, name).setTranslationKey(StarWormLighting.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(StarWormLighting.MODID, name).setTranslationKey(StarWormLighting.MODID + "." + name);
		return block;
	}
}
