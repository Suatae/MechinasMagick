package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;





public class BlockMachineCore extends BlockBase {

	public BlockMachineCore() {
		super(Material.iron);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}
