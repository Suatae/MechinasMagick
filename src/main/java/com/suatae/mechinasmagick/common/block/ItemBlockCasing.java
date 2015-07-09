package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class ItemBlockCasing extends ItemBlock {

	public ItemBlockCasing(Block block) {
		super(block);
		setHasSubtypes(true);

	}

	@Override
	public int getMetadata(int par1) {

		return par1;
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
