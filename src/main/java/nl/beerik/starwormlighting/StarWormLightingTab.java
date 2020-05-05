package nl.beerik.starwormlighting;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nl.beerik.starwormlighting.init.SWLItems;

public class StarWormLightingTab extends CreativeTabs {

	public StarWormLightingTab() {
		super(StarWormLighting.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(SWLItems.STAR_WORM);
	}
}
