package nl.beerik.starwormlighting.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import nl.beerik.starwormlighting.StarWormLighting;
import nl.beerik.starwormlighting.item.PestleMortarItem;

public final class SWLItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StarWormLighting.MODID);
	
	public static final RegistryObject<Item> STAR_WORM = ITEMS.register("star_worm", () -> new Item(new Item.Properties().group(StarWormLighting.GROUP)));
	public static final RegistryObject<Item> STAR_WORM_GOOP = ITEMS.register("star_worm_goop", () -> new Item(new Item.Properties().group(StarWormLighting.GROUP)));
	public static final RegistryObject<Item> PESTLE_MORTAR = ITEMS.register("pestle_mortar", () -> new PestleMortarItem(new Item.Properties().maxStackSize(1).maxDamage(128).group(StarWormLighting.GROUP)));

	//public static final RegistryObject<Item> CANTAZARITE = ITEMS.register("cantazarite", () -> new Item(new Item.Properties().group(StarWormLighting.GROUP)));
	//public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst_crystal", () -> new Item(new Item.Properties().group(StarWormLighting.GROUP)));
}