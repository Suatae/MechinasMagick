package com.suatae.mechinasmagick.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockVoid extends BlockBase {

	public BlockVoid() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.VOID);
		this.setBlockTextureName(REF.NAME.BLOCK.VOID);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);

	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

}
