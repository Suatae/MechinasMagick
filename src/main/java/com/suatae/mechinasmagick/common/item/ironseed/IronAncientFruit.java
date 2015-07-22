package com.suatae.mechinasmagick.common.item.ironseed;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.FruitBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class IronAncientFruit extends FruitBase {

	public IronAncientFruit() {
		super(20, 5.5F, 17, 1000, 10, 100, 21, 1200, 14, 100, 12, 1200, 6, 100, 11, 1200, 2, 100,
				5, 1200, 4, 100);
		this.setAlwaysEdible();
		this.setUnlocalizedName(REF.NAME.ITEM.FRUITI);
		maxStackSize = 8;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.BLUE + "-Hunger");
		list.add(EnumChatFormatting.BLUE + "-Health Boost");
		list.add(EnumChatFormatting.BLUE + "-Strength");
		list.add(EnumChatFormatting.BLUE + "-Resistance III");
		list.add(EnumChatFormatting.BLUE + "-Fire Resistance");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
}
