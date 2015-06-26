package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;





public class BlockAncientSeedContainer extends BlockBase implements ITileEntityProvider {
	public BlockAncientSeedContainer() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.ASContainer);
		this.setBlockTextureName(REF.NAME.BLOCK.ASContainer);
		this.setStepSound(Block.soundTypeStone);
		this.setLightLevel(0.6375F);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setLightOpacity(0);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockBounds(0.095F, 0F, 0.095F, 0.905F, 0.805F, 0.905F);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityAncientContainer();
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

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(ItemReg.itemMMSeed));
		return drops;
	}

	// @Override
	// public ItemStack getPickBlock(MovingObjectPosition target, World world,
	// int x, int y, int z,
	// EntityPlayer player) {
	// return null;
	// }

}
