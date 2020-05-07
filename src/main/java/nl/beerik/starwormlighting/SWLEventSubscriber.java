package nl.beerik.starwormlighting;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import nl.beerik.starwormlighting.init.SWLBlocks;

@EventBusSubscriber(modid = StarWormLighting.MODID, bus = EventBusSubscriber.Bus.MOD)
public class SWLEventSubscriber {

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		SWLBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
			.forEach(block -> {
				final Item.Properties properties = new Item.Properties().group(StarWormLighting.GROUP);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(block.getRegistryName());
				registry.register(blockItem);
			});
	}
}
