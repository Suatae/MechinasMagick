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





public class MalletStone extends ToolMalletBase {
	public MalletStone() {
		super(ItemReg.MMStone);
		this.setUnlocalizedName(REF.NAME.ITEM.SMallet);
		this.setMaxDamage(ToolMalletBase.Stonedurability);
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
					Block a = world.getBlock(X + 1, Y, Z);
					Block b = world.getBlock(X - 1, Y, Z);
					Block c = world.getBlock(X, Y, Z + 1);
					Block d = world.getBlock(X, Y, Z - 1);
					Block e = world.getBlock(X + 1, Y, Z + 1);
					Block f = world.getBlock(X - 1, Y, Z - 1);
					Block g = world.getBlock(X + 1, Y, Z - 1);
					Block h = world.getBlock(X - 1, Y, Z + 1);
					if (a == BlockReg.blockLavaStone) {
						world.func_147480_a(X + 1, Y, Z, false);
						world.setBlock(X + 1, Y, Z, REF.BLOCK.lava);
					}
					if (b == BlockReg.blockLavaStone) {
						world.func_147480_a(X - 1, Y, Z, false);
						world.setBlock(X - 1, Y, Z, REF.BLOCK.lava);
					}
					if (c == BlockReg.blockLavaStone) {
						world.func_147480_a(X, Y, Z + 1, false);
						world.setBlock(X, Y, Z + 1, REF.BLOCK.lava);
					}
					if (d == BlockReg.blockLavaStone) {
						world.func_147480_a(X, Y, Z - 1, false);
						world.setBlock(X, Y, Z - 1, REF.BLOCK.lava);
					}
					if (e == BlockReg.blockLavaStone) {
						world.func_147480_a(X + 1, Y, Z + 1, false);
						world.setBlock(X + 1, Y, Z + 1, REF.BLOCK.lava);
					}
					if (f == BlockReg.blockLavaStone) {
						world.func_147480_a(X - 1, Y, Z - 1, false);
						world.setBlock(X - 1, Y, Z - 1, REF.BLOCK.lava);
					}
					if (g == BlockReg.blockLavaStone) {
						world.func_147480_a(X + 1, Y, Z - 1, false);
						world.setBlock(X + 1, Y, Z - 1, REF.BLOCK.lava);
					}
					if (h == BlockReg.blockLavaStone) {
						world.func_147480_a(X - 1, Y, Z + 1, false);
						world.setBlock(X - 1, Y, Z + 1, REF.BLOCK.lava);
					}

					if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
					if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
					if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
					if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
					if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
					}
					return true;
				}
				return false;
			}

		if (itemstack.getItemDamage() == ToolMalletBase.Stonedurability + 1) {
			Player.inventory.consumeInventoryItem(this);

			// FIX for EnchantmentDurability.negateDamage

		}

		return true;
	}

}
