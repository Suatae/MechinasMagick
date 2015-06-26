package com.suatae.mechinasmagick.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockLavaStone extends BlockBase {

	protected static Random	ran	= new Random();

	public BlockLavaStone() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.LAVA);
		this.setBlockTextureName(REF.NAME.BLOCK.LAVA);
		this.setLightLevel(1.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(15.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setResistance(2000.0F);
		this.setTickRandomly(true);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	public boolean enableStats() {
		return false;
	}

	/*
	 * public void randomDisplayTick(World world, int x, int y, int z, Random
	 * random) { double d0 = (double)((float)x + (5.0F + ran.nextFloat() *
	 * 6.0F)/16.0F); double d1 = (double)((float)y + 0.9125F); double d2 =
	 * (double)((float)z + (5.0F + ran.nextFloat() * 6.0F)/16.0F); double d3 =
	 * 0.0D; // vel x double d4 = 0.0D; // vel y double d5 = 0.0D; // vel z
	 * 
	 * world.spawnParticle("lava", d0, d1, d2, d3, d4, d5);
	 * 
	 * };
	 */

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public void onEntityWalking(World world, int X, int Y, int Z, Entity entity) {
		double d0 = X + (5.0F + ran.nextFloat() * 6.0F) / 16.0F;
		double d1 = Y + 0.9125F;
		double d2 = Z + (5.0F + ran.nextFloat() * 6.0F) / 16.0F;
		double d3 = 0.0D; // vel x
		double d4 = 0.0D; // vel y
		double d5 = 0.0D; // vel z
		// world.setBlock(X, Y, Z, Blocks.lava);

		if (entity instanceof EntityLivingBase) {
			// ((EntityLivingBase) entity).addPotionEffect(new
			// PotionEffect(Potion.hunger.getId(), 60000, 20));
			((EntityLivingBase) entity).setFire(5);
			world.spawnParticle("lava", d0, d1, d2, d3, d4, d5);
		}
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}
}
