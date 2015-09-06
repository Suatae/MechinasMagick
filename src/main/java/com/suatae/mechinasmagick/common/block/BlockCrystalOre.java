package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;





public class BlockCrystalOre extends BlockBase implements ITileEntityProvider {

	public BlockCrystalOre() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.crystalORE);
		this.setBlockTextureName(REF.NAME.BLOCK.crystalORE);
		this.setStepSound(Block.soundTypePiston);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityOreE();
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

		drops.add(new ItemStack(BlockReg.blockCrystalCrop, 1, 0));
		return drops;
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
