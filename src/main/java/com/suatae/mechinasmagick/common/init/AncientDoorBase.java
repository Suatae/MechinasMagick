package com.suatae.mechinasmagick.common.init;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;





public class AncientDoorBase extends BlockBase {

	public AncientDoorBase() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockUnbreakable();
		this.setTickRandomly(true);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setBlockBounds(0.06F, 0, 0, 0.94F, 1.0F, 1.0F);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public void onBlockClicked(World world, int X, int Y, int Z, EntityPlayer Player) {
		world.func_147480_a(X, Y, Z, true);
	};

	@Override
	public boolean onBlockActivated(World world, int X, int Y, int Z, EntityPlayer player,
			int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		return world.func_147480_a(X, Y, Z, true);
	}

	// @Override
	// public ItemStack getPickBlock(MovingObjectPosition target, World world,
	// int x, int y, int z,
	// EntityPlayer player) {
	// return null;
	// }

}
