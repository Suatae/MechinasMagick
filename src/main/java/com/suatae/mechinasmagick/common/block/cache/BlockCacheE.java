package com.suatae.mechinasmagick.common.block.cache;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.CacheBase;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheElite;





public class BlockCacheE extends CacheBase implements ITileEntityProvider {
	protected static Random	ran	= new Random();

	public BlockCacheE() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.C_NAME_E);
		this.setBlockTextureName(REF.NAME.BLOCK.C_NAME_C);
		this.setHardness(8.0f);
		this.setLightOpacity(0);
		this.setHarvestLevel("pickaxe", 1);
		this.setTickRandomly(true);
		this.blockParticleGravity = 1.0F;

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCacheElite();
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		// LVL 01
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D01, world.rand.nextInt(7) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D02, world.rand.nextInt(5) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D03, world.rand.nextInt(7) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D04, world.rand.nextInt(3) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D05, world.rand.nextInt(5) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D06, world.rand.nextInt(7) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D07, world.rand.nextInt(8) + 2, 2));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D08, world.rand.nextInt(6) + 2, 4));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D09, world.rand.nextInt(7) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D10, world.rand.nextInt(7) + 0));
		// LVL 02
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D02, world.rand.nextInt(6) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D03, world.rand.nextInt(3) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D04, world.rand.nextInt(9) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D05, world.rand.nextInt(5) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D06, world.rand.nextInt(5) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D07, world.rand.nextInt(1) + 0));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL02.D01));
		// LVL 03
		drops.add(new ItemStack(REF.CACHEDROP.LVL03.D01, world.rand.nextInt(4) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL03.D02, world.rand.nextInt(2) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL03.D03, world.rand.nextInt(3) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL03.D04, world.rand.nextInt(9) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL03.D05, world.rand.nextInt(1) + 0));
		// LVL 04
		drops.add(new ItemStack(REF.CACHEDROP.LVL04.D03, world.rand.nextInt(5) + 0));
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL04.D01));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL04.D02));
		// LVL 05
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL05.D01));
		return drops;
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		double d0 = x + (5.0F + ran.nextFloat() * 6.0F) / 16.0F;
		double d1 = y + 0.9125F;
		double d2 = z + (5.0F + ran.nextFloat() * 6.0F) / 16.0F;
		double d3 = 0.0D; // vel x
		double d4 = 29.0D; // vel y
		double d5 = 100.0D; // vel z

		world.spawnParticle("mobSpell", d0, d1, d2, d3, d4, d5);
	};
}
