package com.suatae.mechinasmagick.client.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.common.init.registry.ItemReg;





public class MechinasTabs {

	public static final CreativeTabs	MechinasMagick_TAB		= new CreativeTabs(REF.MOD_ID) {
																	@Override
																	public Item getTabIconItem() {
																		return ItemReg.ironsteelMallet;
																	}
																};

	public static final CreativeTabs	MechinasMagick_TABblocks	= new CreativeTabs(REF.MOD_ID
																		+ "Blocks") {
																	@Override
																	public Item getTabIconItem() {
																		return Item
																				.getItemFromBlock(BlockReg.blockCatalyst);
																	}
																};
}
