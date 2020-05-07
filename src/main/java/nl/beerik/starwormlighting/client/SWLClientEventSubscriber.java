package nl.beerik.starwormlighting.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import nl.beerik.starwormlighting.StarWormLighting;

@EventBusSubscriber(modid = StarWormLighting.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SWLClientEventSubscriber {
	
	private static final Logger LOGGER = LogManager.getLogger(StarWormLighting.MODID + " Client Mod Event Subscriber");
	
}
