package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.CropBase;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCrystalCrop;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCrystalCrop extends CropBase implements ITileEntityProvider {

	public BlockCrystalCrop() {
		super(Material.rock, 14);
		this.setBlockName(REF.NAME.BLOCK.CRYSTAL);
		this.setBlockTextureName(REF.NAME.BLOCK.CRYSTAL00);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setLightLevel(0.5F);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setBlockBounds(0.0F, 0F, 0.0F, 1F, 0.7F, 1F);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCrystalCrop();
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		super.onNeighborBlockChange(world, x, y, z, block);
		this.canBlockStay(world, x, y, z);
	}

	private boolean func_150107_m(World world, int x, int y, int z) {
		if (World.doesBlockHaveSolidTopSurface(world, x, y, z)) {
			return true;
		}
		else {
			return false;
		}
	}

	// @Override
	// @SideOnly(Side.CLIENT)
	// public void randomDisplayTick(World world, int X, int Y, int Z, Random
	// ran) {
	// super.randomDisplayTick(world, X, Y, Z, ran);
	// double d0 = X + ran.nextFloat();
	// double d1 = Y + 0.5F;
	// double d2 = Z + ran.nextFloat();
	// double d3 = 1.0D; // Color R
	// double d4 = 0.0D; // Color G
	// double d5 = 0.0D; // Color B
	//
	// double d6 = X + 0.0F + (6.0F * ran.nextFloat());
	// double d6m = X + 0.0F + (-6.0F * ran.nextFloat());
	// double d7 = Y + 0.0F + (2.0F * ran.nextFloat());
	// double d8 = Z + 0.0F + (6.0F * ran.nextFloat());
	// double d8m = Z + 0.0F + (-6.0F * ran.nextFloat());
	// double d9 = Y + 0.0F + (-2.0F * ran.nextFloat());
	//
	// double d10 = 5.0F + (ran.nextFloat());
	// double d11 = Y + 0.9F;
	// double d12 = 4.8F;
	// double d13 = 0.0D; // Velocity
	// double d14 = 0.0D; // Velocity
	// double d15 = 0.0D; // Velocity
	//
	// /*
	// * if (world.getBlock(X, Y + 1, Z) == REF.BLOCK.air) {
	// *
	// *
	// * }
	// */
	// if (getPlantMetadata(world, X, Y, Z) == 10) {
	// world.spawnParticle("mobSpell", d0, d1, d2, d3, d4, d5);
	// }
	//
	// if (getPlantMetadata(world, X, Y, Z) >= 6) {
	// world.spawnParticle("townaura", d6, d7, d8, d3, d4, d5);
	// world.spawnParticle("townaura", d6, d9, d8, d3, d4, d5);
	// world.spawnParticle("townaura", d6m, d7, d8m, d3, d4, d5);
	// world.spawnParticle("townaura", d6m, d9, d8m, d3, d4, d5);
	// world.spawnParticle("townaura", d6, d7, d8m, d3, d4, d5);
	// world.spawnParticle("townaura", d6, d9, d8m, d3, d4, d5);
	// world.spawnParticle("townaura", d6m, d7, d8, d3, d4, d5);
	// world.spawnParticle("townaura", d6m, d9, d8, d3, d4, d5);
	// }
	//
	// // world.spawnParticle("enchantmenttable", x + d10, d11, z + d12, d13,
	// // d14, d15);
	// // world.spawnParticle("enchantmenttable", x + d12, d11, z + d10, d13,
	// // d14, d15);
	//
	// };

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if (metadata == maxGrowthStage) {

			drops.add(new ItemStack(this, 1, 0));
			drops.add(new ItemStack(ItemReg.itemCrystal, 2, 0));

		}
		if (metadata <= maxGrowthStage - 1) {

			drops.add(new ItemStack(this, 1, 0));

		}

		return drops;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[1] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[2] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[3] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[4] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[5] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[6] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[7] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[8] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[9] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[10] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[11] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[12] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[13] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
		iIcon[14] = parIIconRegister.registerIcon(REF.NAME.BLOCK.CRYSTAL00);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}
}
