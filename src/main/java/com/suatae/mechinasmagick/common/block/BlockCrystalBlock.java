package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockCrystalBlock extends BlockBase {

	public BlockCrystalBlock() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.CRYSTALblock);
		this.setBlockTextureName(REF.NAME.BLOCK.CRYSTALblock);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}
