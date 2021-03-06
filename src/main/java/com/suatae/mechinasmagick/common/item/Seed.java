package com.suatae.mechinasmagick.common.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;





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
			int meta = world.getBlockMetadata(X, Y, Z);

			if (!(block != BlockReg.blockCasing) && (meta == 3)) {
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 4, 2);
				Player.inventory.consumeInventoryItem(this);
			}

			if (!(block != BlockReg.blockCasing) && (meta == 0)) {
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 1, 2);
				Player.inventory.consumeInventoryItem(this);
			}
			return true;
		}
		else
			return false;
	}
}
