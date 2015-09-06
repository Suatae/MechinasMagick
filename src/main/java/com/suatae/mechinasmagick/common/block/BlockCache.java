package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCache;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCache extends Block implements ITileEntityProvider {

	private int				maxMeta	= 4;
	private final String	name	= REF.NAME.BLOCK.icache;

	@SideOnly(Side.CLIENT)
	private IIcon[]			icons;

	public BlockCache() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.cache);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setLightOpacity(0);

	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	public boolean enableStats() {
		return true;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCache();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[maxMeta];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon(name + i);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < maxMeta; i++) {

			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

		if (metadata == 0) {
			// LVL 01
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d07, world.rand.nextInt(3) + 2, 2));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d08, world.rand.nextInt(2) + 2, 4));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d01));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d02));
			if (world.rand.nextFloat() < 0.75F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d03));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d04));
			if (world.rand.nextFloat() < 0.25F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d05));
			if (world.rand.nextFloat() < 0.25F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d06));
			if (world.rand.nextFloat() < 0.75F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d09));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL01.d10));
		}
		if (metadata == 1) {
			// LVL 01
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d01, world.rand.nextInt(5) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d02, world.rand.nextInt(3) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d03, world.rand.nextInt(8) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d04, world.rand.nextInt(1) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d05, world.rand.nextInt(3) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d06, world.rand.nextInt(5) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d07, world.rand.nextInt(3) + 2, 2));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d08, world.rand.nextInt(2) + 2, 4));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d09, world.rand.nextInt(10) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d10, world.rand.nextInt(10) + 0));
			// LVL 02
			if (world.rand.nextFloat() < 0.25F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D01));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D02));
			if (world.rand.nextFloat() < 0.50F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D03));
			if (world.rand.nextFloat() < 0.75F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D04));
			if (world.rand.nextFloat() < 0.20F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D05));
			if (world.rand.nextFloat() < 0.25F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D06));
			if (world.rand.nextFloat() < 0.15F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL02.D07));
		}
		if (metadata == 2) {
			// LVL 01
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d01, world.rand.nextInt(6) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d02, world.rand.nextInt(4) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d03, world.rand.nextInt(8) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d04, world.rand.nextInt(2) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d05, world.rand.nextInt(4) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d06, world.rand.nextInt(6) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d07, world.rand.nextInt(5) + 2, 2));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d08, world.rand.nextInt(4) + 2, 4));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d09, world.rand.nextInt(8) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d10, world.rand.nextInt(8) + 0));
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
		}
		if (metadata == 3) {
			// LVL 01
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d01, world.rand.nextInt(7) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d02, world.rand.nextInt(5) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d03, world.rand.nextInt(7) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d04, world.rand.nextInt(3) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d05, world.rand.nextInt(5) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d06, world.rand.nextInt(7) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d07, world.rand.nextInt(8) + 2, 2));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d08, world.rand.nextInt(6) + 2, 4));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d09, world.rand.nextInt(7) + 0));
			drops.add(new ItemStack(REF.CACHEDROP.LVL01.d10, world.rand.nextInt(7) + 0));
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
			if (world.rand.nextFloat() < 0.15F)
				drops.add(new ItemStack(REF.CACHEDROP.LVL05.D01));
		}
		return drops;
	}
}
