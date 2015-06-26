package com.suatae.mechinasmagick.common.item.ironseed;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.core.lib.REF.BLOCK.SEED;
import com.suatae.mechinasmagick.common.init.SeedBaseV2;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class IronSeedPrimed extends SeedBaseV2 {

	public IronSeedPrimed() {
		super(REF.BLOCK.SEED.IRON.PLANT, SEED.SOIL, REF.BLOCK.SEED.IRON.CAP,
				REF.BLOCK.SEED.IRON.ACTIVATOR);
		this.setUnlocalizedName(REF.NAME.ITEM.SEEDIP);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "-" + EnumChatFormatting.GRAY + "Iron "
				+ EnumChatFormatting.GREEN + "Encased");
		list.add(EnumChatFormatting.BLUE + "-Cured");
		list.add(EnumChatFormatting.LIGHT_PURPLE + "-Primed");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
}
