package nl.beerik.starwormlighting.item;

import net.minecraft.item.Item;
import nl.beerik.starwormlighting.StarWormLighting;

public class PestleMortarItem extends Item {
	
	public PestleMortarItem() {
		this.setMaxStackSize(1);
		this.setMaxDamage(128);
		this.setCreativeTab(StarWormLighting.TAB);
	}
}
