package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockBase extends Block {
	public BlockBase(Material mat) {
		super(mat);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(
				this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	// @Override
	// public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_,
	// int p_149668_2_,
	// int p_149668_3_, int p_149668_4_) {
	// return null;
	// }
	//
	// @Override
	// public boolean isOpaqueCube() {
	// return false;
	// }
	//
	// @Override
	// public boolean renderAsNormalBlock() {
	// return false;
	// }

	// @Override
	// @SideOnly(Side.CLIENT)
	// public boolean addDestroyEffects(World world, int x, int y, int z, int
	// meta,
	// EffectRenderer effectRenderer) {
	// return true;
	// }
}
