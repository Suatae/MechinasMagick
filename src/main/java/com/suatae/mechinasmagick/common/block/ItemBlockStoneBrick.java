package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class ItemBlockStoneBrick extends ItemBlock {

	public ItemBlockStoneBrick(Block block) {
		super(block);
		setHasSubtypes(true);

	}

	@Override
	public int getMetadata(int meta) {

		return meta;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return String.format("tile.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
