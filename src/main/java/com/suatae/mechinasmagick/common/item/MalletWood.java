package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.init.ToolMalletBase;





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
		if (par7 != 1) {
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {

				Block block = world.getBlock(X, Y, Z);

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
				// Gold
				Block Gold = world.getBlock(X, Y, Z);
				Block GoldN = world.getBlock(X, Y, Z + 1);
				Block GoldS = world.getBlock(X, Y, Z - 1);
				Block GoldE = world.getBlock(X + 1, Y, Z);
				Block GoldW = world.getBlock(X - 1, Y, Z);
				if (!(Gold != Blocks.gold_block) && !(GoldN != Blocks.gold_block)
						&& !(GoldS != Blocks.gold_block) && !(GoldE != Blocks.gold_block)
						&& !(GoldW != Blocks.gold_block)) {
					world.func_147480_a(X, Y, Z + 1, false);
					world.func_147480_a(X, Y, Z - 1, false);
					world.func_147480_a(X + 1, Y, Z, false);
					world.func_147480_a(X - 1, Y, Z, false);
					world.setBlock(X, Y, Z, BlockReg.blockGoldCasing);
					world.createExplosion(Player, X, Y, Z, 5f, false);
					itemstack.attemptDamageItem(par7, null);
					if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
					}
					return true;

				}

				// Iron
				Block Iron = world.getBlock(X, Y, Z);
				Block IronN = world.getBlock(X, Y, Z + 1);
				Block IronS = world.getBlock(X, Y, Z - 1);
				Block IronE = world.getBlock(X + 1, Y, Z);
				Block IronW = world.getBlock(X - 1, Y, Z);
				if (!(Iron != Blocks.iron_block) && !(IronN != Blocks.iron_block)
						&& !(IronS != Blocks.iron_block) && !(IronE != Blocks.iron_block)
						&& !(IronW != Blocks.iron_block)) {
					world.func_147480_a(X, Y, Z + 1, false);
					world.func_147480_a(X, Y, Z - 1, false);
					world.func_147480_a(X + 1, Y, Z, false);
					world.func_147480_a(X - 1, Y, Z, false);
					world.setBlock(X, Y, Z, BlockReg.blockIronCasing);
					world.createExplosion(Player, X, Y, Z, 5f, false);
					itemstack.attemptDamageItem(par7, null);
					if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
					}
					return true;
				}

				// Gold
				Block gcasing = world.getBlock(X, Y, Z);
				Block fire1 = world.getBlock(X, Y, Z + 1);
				Block fire2 = world.getBlock(X, Y, Z - 1);
				Block fire3 = world.getBlock(X + 1, Y, Z);
				Block fire4 = world.getBlock(X - 1, Y, Z);
				if (!(gcasing != BlockReg.blockGoldCasingSeeded) && !(fire1 != Blocks.fire)
						&& !(fire2 != Blocks.fire) && !(fire3 != Blocks.fire)
						&& !(fire4 != Blocks.fire)) {
					world.func_147480_a(X, Y, Z + 1, false);
					world.func_147480_a(X, Y, Z - 1, false);
					world.func_147480_a(X + 1, Y, Z, false);
					world.func_147480_a(X - 1, Y, Z, false);
					world.setBlock(X, Y, Z, BlockReg.blockGoldCasingFinal);
					itemstack.attemptDamageItem(par7, null);
					world.createExplosion(Player, X, Y, Z, 5f, false);
					if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
					}
					return true;
				}

				// Iron
				Block icasing = world.getBlock(X, Y, Z);
				if (!(icasing != BlockReg.blockIronCasingSeeded) && !(fire1 != Blocks.fire)
						&& !(fire2 != Blocks.fire) && !(fire3 != Blocks.fire)
						&& !(fire4 != Blocks.fire)) {
					world.setBlock(X, Y, Z + 1, Blocks.air);
					world.setBlock(X, Y, Z - 1, Blocks.air);
					world.setBlock(X - 1, Y, Z, Blocks.air);
					world.setBlock(X + 1, Y, Z, Blocks.air);
					world.setBlock(X, Y, Z, BlockReg.blockIronCasingFinal);
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
