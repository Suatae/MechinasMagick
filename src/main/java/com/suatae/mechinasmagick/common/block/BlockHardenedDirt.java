package com.suatae.mechinasmagick.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockHardenedDirt extends BlockBase {

	public BlockHardenedDirt() {
		super(Material.ground);
		this.setBlockName(REF.NAME.BLOCK.DIRT);
		this.setBlockTextureName(REF.NAME.BLOCK.DIRT);
		this.setStepSound(Block.soundTypeGrass);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);

	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

}
