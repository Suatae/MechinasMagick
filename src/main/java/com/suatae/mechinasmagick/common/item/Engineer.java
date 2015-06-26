package com.suatae.mechinasmagick.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class Engineer extends ItemBase {
	public Engineer() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.ENGINEER);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		Player.inventory.consumeInventoryItem(this);
		return true;
	}
}
