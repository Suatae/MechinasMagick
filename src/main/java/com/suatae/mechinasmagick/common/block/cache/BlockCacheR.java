package com.suatae.mechinasmagick.common.block.cache;

import java.util.ArrayList;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.CacheBase;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheRare;





public class BlockCacheR extends CacheBase implements ITileEntityProvider {

	public BlockCacheR() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.C_NAME_R);
		this.setBlockTextureName(REF.NAME.BLOCK.C_NAME_C);
		this.setHardness(6.0f);
		this.setLightOpacity(0);
		this.setHarvestLevel("pickaxe", 1);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCacheRare();
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		// LVL 01
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D01, world.rand.nextInt(6) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D02, world.rand.nextInt(4) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D03, world.rand.nextInt(8) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D04, world.rand.nextInt(2) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D05, world.rand.nextInt(4) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D06, world.rand.nextInt(6) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D07, world.rand.nextInt(5) + 2, 2));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D08, world.rand.nextInt(4) + 2, 4));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D09, world.rand.nextInt(8) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D10, world.rand.nextInt(8) + 0));
		// LVL 02
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D02, world.rand.nextInt(2) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D03, world.rand.nextInt(3) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D04, world.rand.nextInt(8) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D05, world.rand.nextInt(2) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D06, world.rand.nextInt(2) + 0));
		drops.add(new ItemStack(REF.CACHEDROP.LVL02.D07, world.rand.nextInt(1) + 0));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL02.D01));
		// LVL 03
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL03.D01));
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL03.D02));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL03.D03));
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL03.D04));
		if (world.rand.nextFloat() < 0.20F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL03.D05));
		return drops;
	}
}
