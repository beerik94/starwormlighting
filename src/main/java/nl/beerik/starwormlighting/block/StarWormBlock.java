package nl.beerik.starwormlighting.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.beerik.starwormlighting.StarWormLighting;

public class StarWormBlock extends Block {

	public StarWormBlock(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(5.0F);
		this.setCreativeTab(StarWormLighting.TAB);
		this.setLightLevel(1.0F);
	}

}
