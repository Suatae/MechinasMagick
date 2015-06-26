package com.suatae.mechinasmagick.common.block.cache;

import java.util.ArrayList;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.CacheBase;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheCommon;





public class BlockCacheC extends CacheBase implements ITileEntityProvider {

	public BlockCacheC() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.C_NAME_C);
		this.setBlockTextureName(REF.NAME.BLOCK.C_NAME_C);
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightOpacity(0);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCacheCommon();
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		// LVL 01
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D07, world.rand.nextInt(3) + 2, 2));
		drops.add(new ItemStack(REF.CACHEDROP.LVL01.D08, world.rand.nextInt(2) + 2, 4));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D01));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D02));
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D03));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D04));
		if (world.rand.nextFloat() < 0.25F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D05));
		if (world.rand.nextFloat() < 0.25F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D06));
		if (world.rand.nextFloat() < 0.75F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D09));
		if (world.rand.nextFloat() < 0.50F)
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.D10));
		return drops;
	}
}
