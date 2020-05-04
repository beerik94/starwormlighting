package nl.beerik.easylighting.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.beerik.easylighting.EasyLighting;

public class StarWormBlock extends Block {

	public StarWormBlock(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(EasyLighting.TAB);
		this.setLightLevel(1.0F);
	}

}
