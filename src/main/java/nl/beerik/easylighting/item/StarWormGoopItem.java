package nl.beerik.easylighting.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nl.beerik.easylighting.EasyLighting;

public class StarWormGoopItem extends Item {

	public StarWormGoopItem() {
		this.setMaxStackSize(64);
		this.setCreativeTab(EasyLighting.TAB);
	}
	
	/**
   * Called when a Block is right-clicked with this Item
   */
  public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
  {
  	if (!worldIn.isRemote)
  	{
  		
  	}
    return EnumActionResult.PASS;
  }
}
