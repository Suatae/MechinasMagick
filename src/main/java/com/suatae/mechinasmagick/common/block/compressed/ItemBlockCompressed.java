package com.suatae.mechinasmagick.common.block.compressed;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;





public class ItemBlockCompressed extends ItemBlock {
	String	l1;

	public ItemBlockCompressed(Block block) {
		super(block);
		setHasSubtypes(true);

	}

	@Override
	public int getMetadata(int meta) {

		return meta;
	}

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4) {

		if (itemstack.getItem() == Item.getItemFromBlock(BlockReg.blockCobble)) {
			switch (itemstack.getItemDamage()) {
				case 0:
					l1 = "9 Cobblestone";
					break;
				case 1:
					l1 = "81 Cobblestone";
					break;
				case 2:
					l1 = "729 Cobblestone";
					break;
				case 3:
					l1 = "6,561 Cobblestone";
					break;
				case 4:
					l1 = "59,049 Cobblestone";
					break;
				case 5:
					l1 = "531,441 Cobblestone";
					break;
				case 6:
					l1 = "4,782,969 Cobblestone";
					break;
				case 7:
					l1 = "43,046,721 Cobblestone";
					break;
				default:
					l1 = "9 Cobblestone";

			}

		}

		if (itemstack.getItem() == Item.getItemFromBlock(BlockReg.blockDirt)) {
			switch (itemstack.getItemDamage()) {
				case 0:
					l1 = "9 Dirt";
					break;
				case 1:
					l1 = "81 Dirt";
					break;
				case 2:
					l1 = "729 Dirt";
					break;
				case 3:
					l1 = "6,561 Dirt";
					break;
				case 4:
					l1 = "59,049 Dirt";
					break;
				case 5:
					l1 = "531,441 Dirt";
					break;
				case 6:
					l1 = "4,782,969 Dirt";
					break;
				case 7:
					l1 = "43,046,721 Dirt";
					break;
				default:
					l1 = "9 Dirt";

			}

		}

		if (itemstack.getItem() == Item.getItemFromBlock(BlockReg.blockSand)) {
			switch (itemstack.getItemDamage()) {
				case 0:
					l1 = "9 Sand";
					break;
				case 1:
					l1 = "81 Sand";
					break;
				case 2:
					l1 = "729 Sand";
					break;
				case 3:
					l1 = "6,561 Sand";
					break;
				case 4:
					l1 = "59,049 Sand";
					break;
				case 5:
					l1 = "531,441 Sand";
					break;
				case 6:
					l1 = "4,782,969 Sand";
					break;
				case 7:
					l1 = "43,046,721 Sand";
					break;
				default:
					l1 = "9 Sand";

			}

		}

		if (itemstack.getItem() == Item.getItemFromBlock(BlockReg.blockGravel)) {
			switch (itemstack.getItemDamage()) {
				case 0:
					l1 = "9 Gravel";
					break;
				case 1:
					l1 = "81 Gravel";
					break;
				case 2:
					l1 = "729 Gravel";
					break;
				case 3:
					l1 = "6,561 Gravel";
					break;
				case 4:
					l1 = "59,049 Gravel";
					break;
				case 5:
					l1 = "531,441 Gravel";
					break;
				case 6:
					l1 = "4,782,969 Gravel";
					break;
				case 7:
					l1 = "43,046,721 Gravel";
					break;
				default:
					l1 = "9 Gravel";

			}

		}
		list.add(EnumChatFormatting.BLUE + l1);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {

		String name;
		switch (itemstack.getItemDamage()) {

			case 0:
				name = "_0";
				break;
			case 1:
				name = "_1";
				break;
			case 2:
				name = "_2";
				break;
			case 3:
				name = "_3";
				break;
			case 4:
				name = "_4";
				break;
			case 5:
				name = "_5";
				break;
			case 6:
				name = "_6";
				break;
			case 7:
				name = "_7";
				break;
			default:
				name = "_0";
		}
		return String.format("tile.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()) + name);
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
