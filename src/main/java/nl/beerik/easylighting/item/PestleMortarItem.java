package nl.beerik.easylighting.item;

import net.minecraft.item.Item;
import nl.beerik.easylighting.EasyLighting;

public class PestleMortarItem extends Item {
	
	public PestleMortarItem() {
		this.setMaxStackSize(1);
		this.setMaxDamage(128);
		this.setCreativeTab(EasyLighting.TAB);
	}
}
