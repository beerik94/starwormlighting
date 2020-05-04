package nl.beerik.easylighting.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import nl.beerik.easylighting.EasyLighting;

public class RegistryUtil {
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(EasyLighting.MODID, name).setTranslationKey(EasyLighting.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(EasyLighting.MODID, name).setTranslationKey(EasyLighting.MODID + "." + name);
		return block;
	}
}
