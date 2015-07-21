package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.CropBase;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockGoldCrop extends CropBase implements ITileEntityProvider {

	public BlockGoldCrop() {
		super(Material.rock, 10);
		this.setBlockName(REF.NAME.BLOCK.GOLD);
		this.setBlockTextureName(REF.NAME.BLOCK.GOLD00);
		this.setLightLevel(1.0F);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setBlockBounds(0.3F, 0F, 0.3F, 0.7F, 1F, 0.7F);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGoldCrop();
	}

	@Override
	protected boolean canPlaceBlockOn(Block Block) {
		return Block == REF.BLOCK.SEED.SOIL;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int X, int Y, int Z, Random ran) {
		super.randomDisplayTick(world, X, Y, Z, ran);
		double d0 = X + ran.nextFloat();
		double d1 = Y + 0.5F;
		double d2 = Z + ran.nextFloat();
		double d3 = 1.0D; // Color R
		double d4 = 0.0D; // Color G
		double d5 = 0.0D; // Color B

		double d6 = X + 0.0F + (6.0F * ran.nextFloat());
		double d6m = X + 0.0F + (-6.0F * ran.nextFloat());
		double d7 = Y + 0.0F + (2.0F * ran.nextFloat());
		double d8 = Z + 0.0F + (6.0F * ran.nextFloat());
		double d8m = Z + 0.0F + (-6.0F * ran.nextFloat());
		double d9 = Y + 0.0F + (-2.0F * ran.nextFloat());

		double d10 = 5.0F + (ran.nextFloat());
		double d11 = Y + 0.9F;
		double d12 = 4.8F;
		double d13 = 0.0D; // Velocity
		double d14 = 0.0D; // Velocity
		double d15 = 0.0D; // Velocity

		/*
		 * if (world.getBlock(X, Y + 1, Z) == REF.BLOCK.air) {
		 * 
		 * 
		 * }
		 */
		if (getPlantMetadata(world, X, Y, Z) == 10) {
			world.spawnParticle("mobSpell", d0, d1, d2, d3, d4, d5);
		}

		if (getPlantMetadata(world, X, Y, Z) >= 6) {
			world.spawnParticle("townaura", d6, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8, d3, d4, d5);
		}

		// world.spawnParticle("enchantmenttable", x + d10, d11, z + d12, d13,
		// d14, d15);
		// world.spawnParticle("enchantmenttable", x + d12, d11, z + d10, d13,
		// d14, d15);

	};

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if (metadata == maxGrowthStage) {

			drops.add(new ItemStack(this.SEED(), 1, 0));
			drops.add(new ItemStack(this.FRUIT(), 2, 0));

		}
		if (metadata <= maxGrowthStage - 1) {

			drops.add(new ItemStack(this.PRIMED_SEED(), 1, 0));

		}

		return drops;
	}

	protected Item SEED() {
		return ItemReg.itemSeed;
	}

	protected Item PRIMED_SEED() {
		return ItemReg.itemPrimedGold;
	}

	protected Item FRUIT() {
		return ItemReg.itemAncientFruitGold;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[1] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[2] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[3] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[4] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[5] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[6] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[7] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[8] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[9] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
		iIcon[10] = parIIconRegister.registerIcon(REF.NAME.BLOCK.GOLD00);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}
}
