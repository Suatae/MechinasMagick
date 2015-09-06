package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCrystalBlock extends BlockBase {

	public BlockCrystalBlock() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.CRYSTALblock);
		this.setBlockTextureName(REF.NAME.BLOCK.CRYSTALblock);
		this.setStepSound(Block.soundTypeGlass);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setLightOpacity(255);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess access, int x, int y, int z, int side) {
		Block block = access.getBlock(x, y, z);

		if (this == BlockReg.blockCrystalBlock) {
			if (access.getBlockMetadata(x, y, z) != access.getBlockMetadata(x
					- Facing.offsetsXForSide[side], y - Facing.offsetsYForSide[side], z
					- Facing.offsetsZForSide[side])) {
				return true;
			}

			if (block == this) {
				return false;
			}
		}

		return super.shouldSideBeRendered(access, x, y, z, side);
	}
}
