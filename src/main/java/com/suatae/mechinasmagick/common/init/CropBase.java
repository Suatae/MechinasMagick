package com.suatae.mechinasmagick.common.init;

import java.util.Random;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class CropBase extends BlockBush implements IGrowable {
	protected int		maxGrowthStage	= 10;

	@SideOnly(Side.CLIENT)
	protected IIcon[]	iIcon;

	public CropBase(Material mat) {

		super(mat);
		this.setTickRandomly(true);
		this.setHardness(0.0F);
		this.setStepSound(soundTypeGrass);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.disableStats();

	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int Side, int GrowthStage) {
		return iIcon[GrowthStage];
	}

	public void incrementGrowStage(World World, Random Rand, int X, int Y, int Z) {
		int growStage = World.getBlockMetadata(X, Y, Z)
				+ MathHelper.getRandomIntegerInRange(Rand, 2, 5);

		if (growStage > maxGrowthStage) {
			growStage = maxGrowthStage;
		}

		World.setBlockMetadataWithNotify(X, Y, Z, growStage, 2);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random Rand, int Fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean func_149851_a(World World, int X, int Y, int Z, boolean p_149851_5_) {
		return World.getBlockMetadata(X, Y, Z) != maxGrowthStage;
	}

	@Override
	public boolean func_149852_a(World p_149852_1_, Random Rand, int p_149852_3_, int p_149852_4_,
			int p_149852_5_) {
		return true;
	}

	@Override
	public void func_149853_b(World World, Random Rand, int X, int Y, int Z) {
		incrementGrowStage(World, Rand, X, Y, Z);
	}

	@Override
	public void updateTick(World World, int X, int Y, int Z, Random Rand) {
		super.updateTick(World, X, Y, Z, Rand);
		int growStage = World.getBlockMetadata(X, Y, Z) + 1;

		if (growStage > maxGrowthStage) {
			growStage = maxGrowthStage;
		}

		World.setBlockMetadataWithNotify(X, Y, Z, growStage, 2);
	}

}
