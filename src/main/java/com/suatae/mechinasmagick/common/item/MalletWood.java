package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ToolMalletBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.common.init.registry.ItemReg;





public class MalletWood extends ToolMalletBase {

	public MalletWood() {
		super(ItemReg.MMWood);
		this.setUnlocalizedName(REF.NAME.ITEM.WMALLET);
		this.setMaxDamage(ToolMalletBase.Wooddurability);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {

		ItemStack stick = new ItemStack(Items.stick, 1 + world.rand.nextInt(5));

		if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {

			// Main Center
			Block block = world.getBlock(X, Y, Z);
			Block north = world.getBlock(X, Y, Z + 1);
			Block south = world.getBlock(X, Y, Z - 1);
			Block east = world.getBlock(X + 1, Y, Z);
			Block west = world.getBlock(X - 1, Y, Z);

			// RedStone Corners
			Block northw = world.getBlock(X - 1, Y, Z + 1);
			Block northe = world.getBlock(X + 1, Y, Z + 1);
			Block southw = world.getBlock(X - 1, Y, Z - 1);
			Block southe = world.getBlock(X + 1, Y, Z - 1);

			// Redstone Cross
			Block north1 = world.getBlock(X, Y, Z + 2);
			Block south1 = world.getBlock(X, Y, Z - 2);
			Block east1 = world.getBlock(X + 2, Y, Z);
			Block west1 = world.getBlock(X - 2, Y, Z);

			// Redstone Cross NorthSouth Corners
			Block north1w = world.getBlock(X - 1, Y, Z + 2);
			Block north1e = world.getBlock(X + 1, Y, Z + 2);
			Block south1w = world.getBlock(X - 1, Y, Z - 2);
			Block south1e = world.getBlock(X + 1, Y, Z - 2);

			// Redstone Cross EastWest Corners
			Block east1n = world.getBlock(X + 2, Y, Z + 1);
			Block east1s = world.getBlock(X + 2, Y, Z - 1);
			Block west1n = world.getBlock(X - 2, Y, Z + 1);
			Block west1s = world.getBlock(X - 2, Y, Z - 1);

			// Center -y
			Block blockNEGy = world.getBlock(X, Y - 1, Z);
			Block northNEGy = world.getBlock(X, Y - 1, Z + 1);
			Block southNEGy = world.getBlock(X, Y - 1, Z - 1);
			Block eastNEGy = world.getBlock(X + 1, Y - 1, Z);
			Block westNEGy = world.getBlock(X - 1, Y - 1, Z);

			// Corners -y
			Block northwNEGy = world.getBlock(X - 1, Y - 1, Z + 1);
			Block northeNEGy = world.getBlock(X + 1, Y - 1, Z + 1);
			Block southwNEGy = world.getBlock(X - 1, Y - 1, Z - 1);
			Block southeNEGy = world.getBlock(X + 1, Y - 1, Z - 1);

			// Cross -y
			Block north1NEGy = world.getBlock(X, Y - 1, Z + 2);
			Block south1NEGy = world.getBlock(X, Y - 1, Z - 2);
			Block east1NEGy = world.getBlock(X + 2, Y - 1, Z);
			Block west1NEGy = world.getBlock(X - 2, Y - 1, Z);

			// Cross NorthSouth -y
			Block north1wNEGy = world.getBlock(X - 1, Y - 1, Z + 2);
			Block north1eNEGy = world.getBlock(X + 1, Y - 1, Z + 2);
			Block south1wNEGy = world.getBlock(X - 1, Y - 1, Z - 2);
			Block south1eNEGy = world.getBlock(X + 1, Y - 1, Z - 2);

			// Cross EastWest -y
			Block east1nNEGy = world.getBlock(X + 2, Y - 1, Z + 1);
			Block east1sNEGy = world.getBlock(X + 2, Y - 1, Z - 1);
			Block west1nNEGy = world.getBlock(X - 2, Y - 1, Z + 1);
			Block west1sNEGy = world.getBlock(X - 2, Y - 1, Z - 1);

			int meta = world.getBlockMetadata(X, Y, Z);

			if (!(block != REF.BLOCK.lavaS)) {
				world.func_147480_a(X, Y, Z, false);
				world.setBlock(X, Y, Z, REF.BLOCK.lava);
				world.createExplosion(Player, X, Y, Z, 2f, false);
				itemstack.attemptDamageItem(par7, null);
				if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;
			}
			// Log
			if (block == Blocks.log || block == Blocks.log2) {

				if (!world.isRemote) {
					world.func_147480_a(X, Y, Z, false);
					world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
				}

				itemstack.attemptDamageItem(par7, null);
				return true;
			}
			// Gold
			if (!(block != BlockReg.blockCrystalBlock) && !(north != Blocks.gold_block)
					&& !(south != Blocks.gold_block) && !(east != Blocks.gold_block)
					&& !(west != Blocks.gold_block) && !(northw != Blocks.redstone_wire)
					&& !(northe != Blocks.redstone_wire) && !(southw != Blocks.redstone_wire)
					&& !(southe != Blocks.redstone_wire)

					&& !(north1 != Blocks.redstone_wire) && !(south1 != Blocks.redstone_wire)
					&& !(east1 != Blocks.redstone_wire) && !(west1 != Blocks.redstone_wire)

					&& !(north1w != Blocks.redstone_wire) && !(north1e != Blocks.redstone_wire)
					&& !(south1w != Blocks.redstone_wire) && !(south1e != Blocks.redstone_wire)

					&& !(east1n != Blocks.redstone_wire) && !(east1s != Blocks.redstone_wire)
					&& !(west1n != Blocks.redstone_wire) && !(west1s != Blocks.redstone_wire)

					&& !(blockNEGy != BlockReg.blockCatalyst) && (northNEGy != Blocks.air)
					&& (southNEGy != Blocks.air) && (eastNEGy != Blocks.air)
					&& (westNEGy != Blocks.air)

					&& (northwNEGy != Blocks.air) && (northeNEGy != Blocks.air)
					&& (southwNEGy != Blocks.air) && (southeNEGy != Blocks.air)

					&& (north1NEGy != Blocks.air) && (south1NEGy != Blocks.air)
					&& (east1NEGy != Blocks.air) && (west1NEGy != Blocks.air)

					&& (north1wNEGy != Blocks.air) && (north1eNEGy != Blocks.air)
					&& (south1wNEGy != Blocks.air) && (south1eNEGy != Blocks.air)

					&& (east1nNEGy != Blocks.air) && (east1sNEGy != Blocks.air)
					&& (west1nNEGy != Blocks.air) && (west1sNEGy != Blocks.air)) {
				world.func_147480_a(X, Y, Z + 1, false);
				world.func_147480_a(X, Y, Z - 1, false);
				world.func_147480_a(X + 1, Y, Z, false);
				world.func_147480_a(X - 1, Y, Z, false);
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 3, 2);
				world.createExplosion(Player, X, Y, Z, 5f, false);
				itemstack.attemptDamageItem(par7, null);
				if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;

			}

			// Iron
			if (!(block != BlockReg.blockCrystalBlock) && !(north != Blocks.iron_block)
					&& !(south != Blocks.iron_block) && !(east != Blocks.iron_block)
					&& !(west != Blocks.iron_block) && !(northw != Blocks.redstone_wire)
					&& !(northe != Blocks.redstone_wire) && !(southw != Blocks.redstone_wire)
					&& !(southe != Blocks.redstone_wire)

					&& !(north1 != Blocks.redstone_wire) && !(south1 != Blocks.redstone_wire)
					&& !(east1 != Blocks.redstone_wire) && !(west1 != Blocks.redstone_wire)

					&& !(north1w != Blocks.redstone_wire) && !(north1e != Blocks.redstone_wire)
					&& !(south1w != Blocks.redstone_wire) && !(south1e != Blocks.redstone_wire)

					&& !(east1n != Blocks.redstone_wire) && !(east1s != Blocks.redstone_wire)
					&& !(west1n != Blocks.redstone_wire) && !(west1s != Blocks.redstone_wire)

					&& !(blockNEGy != BlockReg.blockCatalyst) && (northNEGy != Blocks.air)
					&& (southNEGy != Blocks.air) && (eastNEGy != Blocks.air)
					&& (westNEGy != Blocks.air)

					&& (northwNEGy != Blocks.air) && (northeNEGy != Blocks.air)
					&& (southwNEGy != Blocks.air) && (southeNEGy != Blocks.air)

					&& (north1NEGy != Blocks.air) && (south1NEGy != Blocks.air)
					&& (east1NEGy != Blocks.air) && (west1NEGy != Blocks.air)

					&& (north1wNEGy != Blocks.air) && (north1eNEGy != Blocks.air)
					&& (south1wNEGy != Blocks.air) && (south1eNEGy != Blocks.air)

					&& (east1nNEGy != Blocks.air) && (east1sNEGy != Blocks.air)
					&& (west1nNEGy != Blocks.air) && (west1sNEGy != Blocks.air)) {
				world.func_147480_a(X, Y, Z + 1, false);
				world.func_147480_a(X, Y, Z - 1, false);
				world.func_147480_a(X + 1, Y, Z, false);
				world.func_147480_a(X - 1, Y, Z, false);
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 0, 2);
				world.createExplosion(Player, X, Y, Z, 5f, false);
				itemstack.attemptDamageItem(par7, null);
				if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;
			}

			// Gold

			if (!(block != BlockReg.blockCasing) && (meta == 4) && !(north != Blocks.fire)
					&& !(south != Blocks.fire) && !(east != Blocks.fire) && !(west != Blocks.fire)
					&& !(northw != Blocks.redstone_wire) && !(northe != Blocks.redstone_wire)
					&& !(southw != Blocks.redstone_wire) && !(southe != Blocks.redstone_wire)

					&& !(north1 != Blocks.redstone_wire) && !(south1 != Blocks.redstone_wire)
					&& !(east1 != Blocks.redstone_wire) && !(west1 != Blocks.redstone_wire)

					&& !(north1w != Blocks.redstone_wire) && !(north1e != Blocks.redstone_wire)
					&& !(south1w != Blocks.redstone_wire) && !(south1e != Blocks.redstone_wire)

					&& !(east1n != Blocks.redstone_wire) && !(east1s != Blocks.redstone_wire)
					&& !(west1n != Blocks.redstone_wire) && !(west1s != Blocks.redstone_wire)

					&& !(blockNEGy != BlockReg.blockCatalyst) && (northNEGy != Blocks.air)
					&& (southNEGy != Blocks.air) && (eastNEGy != Blocks.air)
					&& (westNEGy != Blocks.air)

					&& (northwNEGy != Blocks.air) && (northeNEGy != Blocks.air)
					&& (southwNEGy != Blocks.air) && (southeNEGy != Blocks.air)

					&& (north1NEGy != Blocks.air) && (south1NEGy != Blocks.air)
					&& (east1NEGy != Blocks.air) && (west1NEGy != Blocks.air)

					&& (north1wNEGy != Blocks.air) && (north1eNEGy != Blocks.air)
					&& (south1wNEGy != Blocks.air) && (south1eNEGy != Blocks.air)

					&& (east1nNEGy != Blocks.air) && (east1sNEGy != Blocks.air)
					&& (west1nNEGy != Blocks.air) && (west1sNEGy != Blocks.air)) {
				world.func_147480_a(X, Y, Z + 1, false);
				world.func_147480_a(X, Y, Z - 1, false);
				world.func_147480_a(X + 1, Y, Z, false);
				world.func_147480_a(X - 1, Y, Z, false);
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 5, 2);
				itemstack.attemptDamageItem(par7, null);
				world.createExplosion(Player, X, Y, Z, 5f, false);
				if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;
			}

			// Iron
			if (!(block != BlockReg.blockCasing) && (meta == 1) && !(north != Blocks.fire)
					&& !(south != Blocks.fire) && !(east != Blocks.fire) && !(west != Blocks.fire)
					&& !(northw != Blocks.redstone_wire) && !(northe != Blocks.redstone_wire)
					&& !(southw != Blocks.redstone_wire) && !(southe != Blocks.redstone_wire)

					&& !(north1 != Blocks.redstone_wire) && !(south1 != Blocks.redstone_wire)
					&& !(east1 != Blocks.redstone_wire) && !(west1 != Blocks.redstone_wire)

					&& !(north1w != Blocks.redstone_wire) && !(north1e != Blocks.redstone_wire)
					&& !(south1w != Blocks.redstone_wire) && !(south1e != Blocks.redstone_wire)

					&& !(east1n != Blocks.redstone_wire) && !(east1s != Blocks.redstone_wire)
					&& !(west1n != Blocks.redstone_wire) && !(west1s != Blocks.redstone_wire)

					&& !(blockNEGy != BlockReg.blockCatalyst) && (northNEGy != Blocks.air)
					&& (southNEGy != Blocks.air) && (eastNEGy != Blocks.air)
					&& (westNEGy != Blocks.air)

					&& (northwNEGy != Blocks.air) && (northeNEGy != Blocks.air)
					&& (southwNEGy != Blocks.air) && (southeNEGy != Blocks.air)

					&& (north1NEGy != Blocks.air) && (south1NEGy != Blocks.air)
					&& (east1NEGy != Blocks.air) && (west1NEGy != Blocks.air)

					&& (north1wNEGy != Blocks.air) && (north1eNEGy != Blocks.air)
					&& (south1wNEGy != Blocks.air) && (south1eNEGy != Blocks.air)

					&& (east1nNEGy != Blocks.air) && (east1sNEGy != Blocks.air)
					&& (west1nNEGy != Blocks.air) && (west1sNEGy != Blocks.air)) {
				world.func_147480_a(X, Y, Z + 1, false);
				world.func_147480_a(X, Y, Z - 1, false);
				world.func_147480_a(X + 1, Y, Z, false);
				world.func_147480_a(X - 1, Y, Z, false);
				world.setBlock(X, Y, Z, BlockReg.blockCasing, 2, 2);
				itemstack.attemptDamageItem(par7, null);
				world.createExplosion(Player, X, Y, Z, 5f, false);
				if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;
			}
			return false;
		}

		if (itemstack.getItemDamage() == ToolMalletBase.Wooddurability + 1) {
			Player.inventory.consumeInventoryItem(this);

			// FIX for EnchantmentDurability.negateDamage

		}

		return true;
	}

}
