package com.suatae.mechinasmagick.common.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockStoneBrick extends Block {

	private int				maxMeta	= 3;
	private final String	name	= REF.NAME.BLOCK.MSTONEBRICK;
	private final String	namei	= REF.NAME.BLOCK.MiSTONEBRICK;

	@SideOnly(Side.CLIENT)
	private IIcon[]			icons;

	public BlockStoneBrick() {
		super(Material.rock);
		this.setBlockName(name);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[maxMeta];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon(namei + i);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return icons[par2];
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < maxMeta; i++) {

			list.add(new ItemStack(item, 1, i));
		}
	}

}
