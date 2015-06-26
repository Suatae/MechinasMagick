package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;





public class BlockCatalyst extends BlockBase implements ITileEntityProvider {

	public BlockCatalyst() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.CATALYST);
		this.setBlockTextureName(REF.NAME.BLOCK.CATALYST);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCatalyst();
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
