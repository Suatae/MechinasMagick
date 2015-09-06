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

		ItemStack stick = new ItemStack(Items.stick, world.rand.nextInt(2) + world.rand.nextInt(5));

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
				Block a = world.getBlock(X + 1, Y, Z);
				Block b = world.getBlock(X - 1, Y, Z);
				Block c = world.getBlock(X, Y, Z + 1);
				Block d = world.getBlock(X, Y, Z - 1);
				Block e = world.getBlock(X + 1, Y, Z + 1);
				Block f = world.getBlock(X - 1, Y, Z - 1);
				Block g = world.getBlock(X + 1, Y, Z - 1);
				Block h = world.getBlock(X - 1, Y, Z + 1);
				if (a == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 1, Y, Z, false);
					world.setBlock(X + 1, Y, Z, REF.BLOCK.lava);
				}
				if (b == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 1, Y, Z, false);
					world.setBlock(X - 1, Y, Z, REF.BLOCK.lava);
				}
				if (c == REF.BLOCK.lavaS) {
					world.func_147480_a(X, Y, Z + 1, false);
					world.setBlock(X, Y, Z + 1, REF.BLOCK.lava);
				}
				if (d == REF.BLOCK.lavaS) {
					world.func_147480_a(X, Y, Z - 1, false);
					world.setBlock(X, Y, Z - 1, REF.BLOCK.lava);
				}
				if (e == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 1, Y, Z + 1, false);
					world.setBlock(X + 1, Y, Z + 1, REF.BLOCK.lava);
				}
				if (f == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 1, Y, Z - 1, false);
					world.setBlock(X - 1, Y, Z - 1, REF.BLOCK.lava);
				}
				if (g == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 1, Y, Z - 1, false);
					world.setBlock(X + 1, Y, Z - 1, REF.BLOCK.lava);
				}
				if (h == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 1, Y, Z + 1, false);
					world.setBlock(X - 1, Y, Z + 1, REF.BLOCK.lava);
				}

				if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				itemstack.attemptDamageItem(par7, null);
				return true;
			}
			// Log
			if (block == Blocks.log || block == Blocks.log2) {
				if (!world.isRemote) {
					world.func_147480_a(X, Y, Z, false);
					world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
				}
				Block a = world.getBlock(X + 1, Y, Z);
				Block b = world.getBlock(X - 1, Y, Z);
				Block c = world.getBlock(X, Y, Z + 1);
				Block d = world.getBlock(X, Y, Z - 1);
				Block e = world.getBlock(X + 1, Y, Z + 1);
				Block f = world.getBlock(X - 1, Y, Z - 1);
				Block g = world.getBlock(X + 1, Y, Z - 1);
				Block h = world.getBlock(X - 1, Y, Z + 1);

				Block blockp1 = world.getBlock(X, Y + 1, Z);
				Block ap1 = world.getBlock(X + 1, Y + 1, Z);
				Block bp1 = world.getBlock(X - 1, Y + 1, Z);
				Block cp1 = world.getBlock(X, Y + 1, Z + 1);
				Block dp1 = world.getBlock(X, Y + 1, Z - 1);
				Block ep1 = world.getBlock(X + 1, Y + 1, Z + 1);
				Block fp1 = world.getBlock(X - 1, Y + 1, Z - 1);
				Block gp1 = world.getBlock(X + 1, Y + 1, Z - 1);
				Block hp1 = world.getBlock(X - 1, Y + 1, Z + 1);

				Block blockn1 = world.getBlock(X, Y - 1, Z);
				Block an1 = world.getBlock(X + 1, Y - 1, Z);
				Block bn1 = world.getBlock(X - 1, Y - 1, Z);
				Block cn1 = world.getBlock(X, Y - 1, Z + 1);
				Block dn1 = world.getBlock(X, Y - 1, Z - 1);
				Block en1 = world.getBlock(X + 1, Y - 1, Z + 1);
				Block fn1 = world.getBlock(X - 1, Y - 1, Z - 1);
				Block gn1 = world.getBlock(X + 1, Y - 1, Z - 1);
				Block hn1 = world.getBlock(X - 1, Y - 1, Z + 1);
				if (a == Blocks.log || a == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b == Blocks.log || b == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c == Blocks.log || c == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d == Blocks.log || d == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e == Blocks.log || e == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (f == Blocks.log || f == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (g == Blocks.log || g == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (h == Blocks.log || h == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y+
				if (blockp1 == Blocks.log || blockp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (ap1 == Blocks.log || ap1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (bp1 == Blocks.log || bp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (cp1 == Blocks.log || cp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (dp1 == Blocks.log || dp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (ep1 == Blocks.log || ep1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (fp1 == Blocks.log || fp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (gp1 == Blocks.log || gp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (hp1 == Blocks.log || hp1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y-
				if (blockn1 == Blocks.log || blockn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (an1 == Blocks.log || an1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (bn1 == Blocks.log || bn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (cn1 == Blocks.log || cn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (dn1 == Blocks.log || dn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (en1 == Blocks.log || en1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (fn1 == Blocks.log || fn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (gn1 == Blocks.log || gn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (hn1 == Blocks.log || hn1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Stonedurability) {
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
