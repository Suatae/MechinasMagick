package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;





public class BlockOreE extends BlockBase implements ITileEntityProvider {

	public BlockOreE() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.OREe);
		this.setBlockTextureName(REF.NAME.BLOCK.OREe);
		this.setStepSound(Block.soundTypePiston);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityOreE();
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
