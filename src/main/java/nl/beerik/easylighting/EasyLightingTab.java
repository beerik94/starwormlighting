package nl.beerik.easylighting;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nl.beerik.easylighting.init.ELItems;

public class EasyLightingTab extends CreativeTabs {

	public EasyLightingTab() {
		super(EasyLighting.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ELItems.STAR_WORM);
	}
}
