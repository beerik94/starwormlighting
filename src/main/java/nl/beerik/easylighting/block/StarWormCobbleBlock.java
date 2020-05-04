package nl.beerik.easylighting.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.beerik.easylighting.EasyLighting;

public class StarWormCobbleBlock extends Block {
	
	public StarWormCobbleBlock() {
		super(Material.ROCK);
		
		this.setLightLevel(0.5F);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setCreativeTab(EasyLighting.TAB);
	}
}
