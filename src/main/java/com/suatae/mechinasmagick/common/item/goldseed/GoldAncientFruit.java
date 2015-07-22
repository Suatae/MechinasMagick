package com.suatae.mechinasmagick.common.item.goldseed;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.FruitBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class GoldAncientFruit extends FruitBase {

	public GoldAncientFruit() {
		super(0, 0.0F, 18, 1000, 5, 100, 16, 1200, 4, 100, 3, 1200, 5, 100, 1, 1200, 2, 100, 8,
				1200, 1, 100);
		this.setAlwaysEdible();
		this.setUnlocalizedName(REF.NAME.ITEM.FRUITG);
		maxStackSize = 8;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.BLUE + "-Speed III");
		list.add(EnumChatFormatting.BLUE + "-Weakness");
		list.add(EnumChatFormatting.BLUE + "-Haste");
		list.add(EnumChatFormatting.BLUE + "-Jump Boost II");
		list.add(EnumChatFormatting.BLUE + "-Night Vision");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
}
