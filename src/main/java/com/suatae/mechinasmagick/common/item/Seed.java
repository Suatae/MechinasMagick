package com.suatae.mechinasmagick.common.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class Seed extends ItemBase {

	public Seed() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.SEED);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {

		if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {

			Block block = world.getBlock(X, Y, Z);

			if (!(block != BlockReg.blockGoldCasing)) {
				world.setBlock(X, Y, Z, BlockReg.blockGoldCasingSeeded);
				Player.inventory.consumeInventoryItem(this);
			}

			if (!(block != BlockReg.blockIronCasing)) {
				world.setBlock(X, Y, Z, BlockReg.blockIronCasingSeeded);
				Player.inventory.consumeInventoryItem(this);
			}
			return true;
		}
		else
			return false;
	}
}
