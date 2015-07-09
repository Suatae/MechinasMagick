package com.suatae.mechinasmagick.common.block.goldcasing;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityCasing;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCasing extends Block implements ITileEntityProvider {

	private int				maxMeta	= 6;
	private final String	name	= REF.NAME.BLOCK.Casing;

	@SideOnly(Side.CLIENT)
	private IIcon[]			icons;

	public BlockCasing() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.Casing);
		this.setBlockTextureName(REF.NAME.BLOCK.Casing);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockBounds(0.35F, 0.05F, 0.35F, 0.65F, 0.60F, 0.65F);
		// this.setBlockUnbreakable();
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCasing();
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// @Override
	// public ItemStack getPickBlock(MovingObjectPosition target, World world,
	// int x, int y, int z,
	// EntityPlayer player) {
	// return null;
	// }

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

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public void onBlockClicked(World world, int X, int Y, int Z, EntityPlayer Player) {
		Item star = Items.nether_star;
		Item seedGold = ItemReg.itemPrimedGold;
		Item seedIron = ItemReg.itemPrimedIron;

		if (world.getBlockMetadata(X, Y, Z) == 2) {
			if (Player.inventory.hasItem(star)) {
				world.setBlock(X, Y, Z, Blocks.air);
				Player.inventory.consumeInventoryItem(star);
				Player.inventory.addItemStackToInventory(new ItemStack(seedIron));
				world.createExplosion(Player, X, Y, Z, 1f, true);
				Player.addPotionEffect(new PotionEffect(15, 20 * 20, 2));
			}
		}

		if (world.getBlockMetadata(X, Y, Z) == 5) {
			if (Player.inventory.hasItem(star)) {
				world.setBlock(X, Y, Z, Blocks.air);
				Player.inventory.consumeInventoryItem(star);
				Player.inventory.addItemStackToInventory(new ItemStack(seedGold));
				world.createExplosion(Player, X, Y, Z, 1f, true);
				Player.addPotionEffect(new PotionEffect(15, 20 * 20, 2));
			}
		}
	}

}
