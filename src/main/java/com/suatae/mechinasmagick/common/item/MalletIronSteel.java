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
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.init.ToolMalletBase;





public class MalletIronSteel extends ToolMalletBase {
	public MalletIronSteel() {
		super(ItemReg.MMIronSteel);
		this.setUnlocalizedName(REF.NAME.ITEM.ISMallet);
		this.setMaxDamage(ToolMalletBase.Ironsteeldurability);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {

		ItemStack stick = new ItemStack(Items.stick, world.rand.nextInt(3) + world.rand.nextInt(5));

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

				Block a1 = world.getBlock(X, Y, Z + 2);
				Block a2 = world.getBlock(X, Y, Z - 2);
				Block a3 = world.getBlock(X + 2, Y, Z);
				Block a4 = world.getBlock(X - 2, Y, Z);
				if (a1 == REF.BLOCK.lavaS) {
					world.func_147480_a(X, Y, Z + 2, false);
					world.setBlock(X, Y, Z + 2, REF.BLOCK.lava);
				}
				if (a2 == REF.BLOCK.lavaS) {
					world.func_147480_a(X, Y, Z - 2, false);
					world.setBlock(X, Y, Z - 2, REF.BLOCK.lava);
				}
				if (a3 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 2, Y, Z, false);
					world.setBlock(X + 2, Y, Z, REF.BLOCK.lava);
				}
				if (a4 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 2, Y, Z, false);
					world.setBlock(X - 2, Y, Z, REF.BLOCK.lava);
				}

				Block b1 = world.getBlock(X - 2, Y, Z + 1);
				Block b2 = world.getBlock(X - 2, Y, Z + 2);
				Block b3 = world.getBlock(X - 1, Y, Z + 2);

				if (b1 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 2, Y, Z + 1, false);
					world.setBlock(X - 2, Y, Z + 1, REF.BLOCK.lava);
				}
				if (b2 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 2, Y, Z + 2, false);
					world.setBlock(X - 2, Y, Z + 2, REF.BLOCK.lava);
				}
				if (b3 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 1, Y, Z + 2, false);
					world.setBlock(X - 1, Y, Z + 2, REF.BLOCK.lava);
				}

				Block c1 = world.getBlock(X + 1, Y, Z + 2);
				Block c2 = world.getBlock(X + 2, Y, Z + 2);
				Block c3 = world.getBlock(X + 2, Y, Z + 1);

				if (c1 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 1, Y, Z + 2, false);
					world.setBlock(X + 1, Y, Z + 2, REF.BLOCK.lava);
				}
				if (c2 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 2, Y, Z + 2, false);
					world.setBlock(X + 2, Y, Z + 2, REF.BLOCK.lava);
				}
				if (c3 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 2, Y, Z + 1, false);
					world.setBlock(X + 2, Y, Z + 1, REF.BLOCK.lava);
				}

				Block d1 = world.getBlock(X + 2, Y, Z - 1);
				Block d2 = world.getBlock(X + 2, Y, Z - 2);
				Block d3 = world.getBlock(X + 1, Y, Z - 2);

				if (d1 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 2, Y, Z - 1, false);
					world.setBlock(X + 2, Y, Z - 1, REF.BLOCK.lava);
				}
				if (d2 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 2, Y, Z - 2, false);
					world.setBlock(X + 2, Y, Z - 2, REF.BLOCK.lava);
				}
				if (d3 == REF.BLOCK.lavaS) {
					world.func_147480_a(X + 1, Y, Z - 2, false);
					world.setBlock(X + 1, Y, Z - 2, REF.BLOCK.lava);
				}

				Block e1 = world.getBlock(X - 1, Y, Z - 2);
				Block e2 = world.getBlock(X - 2, Y, Z - 2);
				Block e3 = world.getBlock(X - 2, Y, Z - 1);

				if (e1 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 1, Y, Z - 2, false);
					world.setBlock(X - 1, Y, Z - 2, REF.BLOCK.lava);
				}
				if (e2 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 2, Y, Z - 2, false);
					world.setBlock(X - 2, Y, Z - 2, REF.BLOCK.lava);
				}
				if (e3 == REF.BLOCK.lavaS) {
					world.func_147480_a(X - 2, Y, Z - 1, false);
					world.setBlock(X - 2, Y, Z - 1, REF.BLOCK.lava);
				}

				if (itemstack.getItemDamage() <= ToolMalletBase.Ironsteeldurability) {
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
				Block a1 = world.getBlock(X, Y, Z + 2);
				Block a2 = world.getBlock(X, Y, Z - 2);
				Block a3 = world.getBlock(X + 2, Y, Z);
				Block a4 = world.getBlock(X - 2, Y, Z);
				Block b1 = world.getBlock(X - 2, Y, Z + 1);
				Block b2 = world.getBlock(X - 2, Y, Z + 2);
				Block b3 = world.getBlock(X - 1, Y, Z + 2);
				Block c1 = world.getBlock(X + 1, Y, Z + 2);
				Block c2 = world.getBlock(X + 2, Y, Z + 2);
				Block c3 = world.getBlock(X + 2, Y, Z + 1);
				Block d1 = world.getBlock(X + 2, Y, Z - 1);
				Block d2 = world.getBlock(X + 2, Y, Z - 2);
				Block d3 = world.getBlock(X + 1, Y, Z - 2);
				Block e1 = world.getBlock(X - 1, Y, Z - 2);
				Block e2 = world.getBlock(X - 2, Y, Z - 2);
				Block e3 = world.getBlock(X - 2, Y, Z - 1);

				// Y+1
				Block blockp1 = world.getBlock(X, Y + 1, Z);
				Block ap1 = world.getBlock(X + 1, Y + 1, Z);
				Block bp1 = world.getBlock(X - 1, Y + 1, Z);
				Block cp1 = world.getBlock(X, Y + 1, Z + 1);
				Block dp1 = world.getBlock(X, Y + 1, Z - 1);
				Block ep1 = world.getBlock(X + 1, Y + 1, Z + 1);
				Block fp1 = world.getBlock(X - 1, Y + 1, Z - 1);
				Block gp1 = world.getBlock(X + 1, Y + 1, Z - 1);
				Block hp1 = world.getBlock(X - 1, Y + 1, Z + 1);
				Block a1p1 = world.getBlock(X, Y + 1, Z + 2);
				Block a2p1 = world.getBlock(X, Y + 1, Z - 2);
				Block a3p1 = world.getBlock(X + 2, Y + 1, Z);
				Block a4p1 = world.getBlock(X - 2, Y + 1, Z);
				Block b1p1 = world.getBlock(X - 2, Y + 1, Z + 1);
				Block b2p1 = world.getBlock(X - 2, Y + 1, Z + 2);
				Block b3p1 = world.getBlock(X - 1, Y + 1, Z + 2);
				Block c1p1 = world.getBlock(X + 1, Y + 1, Z + 2);
				Block c2p1 = world.getBlock(X + 2, Y + 1, Z + 2);
				Block c3p1 = world.getBlock(X + 2, Y + 1, Z + 1);
				Block d1p1 = world.getBlock(X + 2, Y + 1, Z - 1);
				Block d2p1 = world.getBlock(X + 2, Y + 1, Z - 2);
				Block d3p1 = world.getBlock(X + 1, Y + 1, Z - 2);
				Block e1p1 = world.getBlock(X - 1, Y + 1, Z - 2);
				Block e2p1 = world.getBlock(X - 2, Y + 1, Z - 2);
				Block e3p1 = world.getBlock(X - 2, Y + 1, Z - 1);

				// Y+2
				Block blockp2 = world.getBlock(X, Y + 2, Z);
				Block ap2 = world.getBlock(X + 1, Y + 2, Z);
				Block bp2 = world.getBlock(X - 1, Y + 2, Z);
				Block cp2 = world.getBlock(X, Y + 2, Z + 1);
				Block dp2 = world.getBlock(X, Y + 2, Z - 1);
				Block ep2 = world.getBlock(X + 1, Y + 2, Z + 1);
				Block fp2 = world.getBlock(X - 1, Y + 2, Z - 1);
				Block gp2 = world.getBlock(X + 1, Y + 2, Z - 1);
				Block hp2 = world.getBlock(X - 1, Y + 2, Z + 1);
				Block a1p2 = world.getBlock(X, Y + 2, Z + 2);
				Block a2p2 = world.getBlock(X, Y + 2, Z - 2);
				Block a3p2 = world.getBlock(X + 2, Y + 2, Z);
				Block a4p2 = world.getBlock(X - 2, Y + 2, Z);
				Block b1p2 = world.getBlock(X - 2, Y + 2, Z + 1);
				Block b2p2 = world.getBlock(X - 2, Y + 2, Z + 2);
				Block b3p2 = world.getBlock(X - 1, Y + 2, Z + 2);
				Block c1p2 = world.getBlock(X + 1, Y + 2, Z + 2);
				Block c2p2 = world.getBlock(X + 2, Y + 2, Z + 2);
				Block c3p2 = world.getBlock(X + 2, Y + 2, Z + 1);
				Block d1p2 = world.getBlock(X + 2, Y + 2, Z - 1);
				Block d2p2 = world.getBlock(X + 2, Y + 2, Z - 2);
				Block d3p2 = world.getBlock(X + 1, Y + 2, Z - 2);
				Block e1p2 = world.getBlock(X - 1, Y + 2, Z - 2);
				Block e2p2 = world.getBlock(X - 2, Y + 2, Z - 2);
				Block e3p2 = world.getBlock(X - 2, Y + 2, Z - 1);

				// Y-1
				Block blockn1 = world.getBlock(X, Y - 1, Z);
				Block an1 = world.getBlock(X + 1, Y - 1, Z);
				Block bn1 = world.getBlock(X - 1, Y - 1, Z);
				Block cn1 = world.getBlock(X, Y - 1, Z + 1);
				Block dn1 = world.getBlock(X, Y - 1, Z - 1);
				Block en1 = world.getBlock(X + 1, Y - 1, Z + 1);
				Block fn1 = world.getBlock(X - 1, Y - 1, Z - 1);
				Block gn1 = world.getBlock(X + 1, Y - 1, Z - 1);
				Block hn1 = world.getBlock(X - 1, Y - 1, Z + 1);
				Block a1n1 = world.getBlock(X, Y - 1, Z + 2);
				Block a2n1 = world.getBlock(X, Y - 1, Z - 2);
				Block a3n1 = world.getBlock(X + 2, Y - 1, Z);
				Block a4n1 = world.getBlock(X - 2, Y - 1, Z);
				Block b1n1 = world.getBlock(X - 2, Y - 1, Z + 1);
				Block b2n1 = world.getBlock(X - 2, Y - 1, Z + 2);
				Block b3n1 = world.getBlock(X - 1, Y - 1, Z + 2);
				Block c1n1 = world.getBlock(X + 1, Y - 1, Z + 2);
				Block c2n1 = world.getBlock(X + 2, Y - 1, Z + 2);
				Block c3n1 = world.getBlock(X + 2, Y - 1, Z + 1);
				Block d1n1 = world.getBlock(X + 2, Y - 1, Z - 1);
				Block d2n1 = world.getBlock(X + 2, Y - 1, Z - 2);
				Block d3n1 = world.getBlock(X + 1, Y - 1, Z - 2);
				Block e1n1 = world.getBlock(X - 1, Y - 1, Z - 2);
				Block e2n1 = world.getBlock(X - 2, Y - 1, Z - 2);
				Block e3n1 = world.getBlock(X - 2, Y - 1, Z - 1);

				// Y-2
				Block blockn2 = world.getBlock(X, Y - 2, Z);
				Block an2 = world.getBlock(X + 1, Y - 2, Z);
				Block bn2 = world.getBlock(X - 1, Y - 2, Z);
				Block cn2 = world.getBlock(X, Y - 2, Z + 1);
				Block dn2 = world.getBlock(X, Y - 2, Z - 1);
				Block en2 = world.getBlock(X + 1, Y - 2, Z + 1);
				Block fn2 = world.getBlock(X - 1, Y - 2, Z - 1);
				Block gn2 = world.getBlock(X + 1, Y - 2, Z - 1);
				Block hn2 = world.getBlock(X - 1, Y - 2, Z + 1);
				Block a1n2 = world.getBlock(X, Y - 2, Z + 2);
				Block a2n2 = world.getBlock(X, Y - 2, Z - 2);
				Block a3n2 = world.getBlock(X + 2, Y - 2, Z);
				Block a4n2 = world.getBlock(X - 2, Y - 2, Z);
				Block b1n2 = world.getBlock(X - 2, Y - 2, Z + 1);
				Block b2n2 = world.getBlock(X - 2, Y - 2, Z + 2);
				Block b3n2 = world.getBlock(X - 1, Y - 2, Z + 2);
				Block c1n2 = world.getBlock(X + 1, Y - 2, Z + 2);
				Block c2n2 = world.getBlock(X + 2, Y - 2, Z + 2);
				Block c3n2 = world.getBlock(X + 2, Y - 2, Z + 1);
				Block d1n2 = world.getBlock(X + 2, Y - 2, Z - 1);
				Block d2n2 = world.getBlock(X + 2, Y - 2, Z - 2);
				Block d3n2 = world.getBlock(X + 1, Y - 2, Z - 2);
				Block e1n2 = world.getBlock(X - 1, Y - 2, Z - 2);
				Block e2n2 = world.getBlock(X - 2, Y - 2, Z - 2);
				Block e3n2 = world.getBlock(X - 2, Y - 2, Z - 1);
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
				if (a1 == Blocks.log || a1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a2 == Blocks.log || a2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a3 == Blocks.log || a3 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a4 == Blocks.log || a4 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b1 == Blocks.log || b1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b2 == Blocks.log || b2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b3 == Blocks.log || b3 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c1 == Blocks.log || c1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c2 == Blocks.log || c2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c3 == Blocks.log || c3 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d1 == Blocks.log || d1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d2 == Blocks.log || d2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d3 == Blocks.log || d3 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e1 == Blocks.log || e1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e2 == Blocks.log || e2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e3 == Blocks.log || e3 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y+1
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
				if (a1p1 == Blocks.log || a1p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a2p1 == Blocks.log || a2p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a3p1 == Blocks.log || a3p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a4p1 == Blocks.log || a4p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b1p1 == Blocks.log || b1p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b2p1 == Blocks.log || b2p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b3p1 == Blocks.log || b3p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c1p1 == Blocks.log || c1p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c2p1 == Blocks.log || c2p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c3p1 == Blocks.log || c3p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d1p1 == Blocks.log || d1p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d2p1 == Blocks.log || d2p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d3p1 == Blocks.log || d3p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e1p1 == Blocks.log || e1p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e2p1 == Blocks.log || e2p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e3p1 == Blocks.log || e3p1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y+2
				if (blockp2 == Blocks.log || blockp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (ap2 == Blocks.log || ap2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (bp2 == Blocks.log || bp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (cp2 == Blocks.log || cp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (dp2 == Blocks.log || dp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (ep2 == Blocks.log || ep2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (fp2 == Blocks.log || fp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (gp2 == Blocks.log || gp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (hp2 == Blocks.log || hp2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a1p2 == Blocks.log || a1p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a2p2 == Blocks.log || a2p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y + 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a3p2 == Blocks.log || a3p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a4p2 == Blocks.log || a4p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b1p2 == Blocks.log || b1p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b2p2 == Blocks.log || b2p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b3p2 == Blocks.log || b3p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c1p2 == Blocks.log || c1p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c2p2 == Blocks.log || c2p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c3p2 == Blocks.log || c3p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d1p2 == Blocks.log || d1p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d2p2 == Blocks.log || d2p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y + 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d3p2 == Blocks.log || d3p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y + 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e1p2 == Blocks.log || e1p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y + 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e2p2 == Blocks.log || e2p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e3p2 == Blocks.log || e3p2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y + 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y-1
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
				if (a1n1 == Blocks.log || a1n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a2n1 == Blocks.log || a2n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a3n1 == Blocks.log || a3n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a4n1 == Blocks.log || a4n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 1, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b1n1 == Blocks.log || b1n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b2n1 == Blocks.log || b2n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b3n1 == Blocks.log || b3n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c1n1 == Blocks.log || c1n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c2n1 == Blocks.log || c2n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 1, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c3n1 == Blocks.log || c3n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 1, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d1n1 == Blocks.log || d1n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d2n1 == Blocks.log || d2n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d3n1 == Blocks.log || d3n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e1n1 == Blocks.log || e1n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e2n1 == Blocks.log || e2n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 1, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e3n1 == Blocks.log || e3n1 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 1, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}

				// Y-2
				if (blockn2 == Blocks.log || blockn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (an2 == Blocks.log || an2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (bn2 == Blocks.log || bn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (cn2 == Blocks.log || cn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (dn2 == Blocks.log || dn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (en2 == Blocks.log || en2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (fn2 == Blocks.log || fn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (gn2 == Blocks.log || gn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (hn2 == Blocks.log || hn2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a1n2 == Blocks.log || a1n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a2n2 == Blocks.log || a2n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X, Y - 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a3n2 == Blocks.log || a3n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (a4n2 == Blocks.log || a4n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 2, Z, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b1n2 == Blocks.log || b1n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b2n2 == Blocks.log || b2n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (b3n2 == Blocks.log || b3n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c1n2 == Blocks.log || c1n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c2n2 == Blocks.log || c2n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 2, Z + 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (c3n2 == Blocks.log || c3n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 2, Z + 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d1n2 == Blocks.log || d1n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 2, Z - 1, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d2n2 == Blocks.log || d2n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 2, Y - 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (d3n2 == Blocks.log || d3n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X + 1, Y - 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e1n2 == Blocks.log || e1n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 1, Y - 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e2n2 == Blocks.log || e2n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 2, Z - 2, false);
						world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, stick));
					}
				}
				if (e3n2 == Blocks.log || e3n2 == Blocks.log2) {
					if (!world.isRemote) {
						world.func_147480_a(X - 2, Y - 2, Z - 1, false);
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Ironsteeldurability) {
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Ironsteeldurability) {
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Ironsteeldurability) {
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
				if (itemstack.getItemDamage() <= ToolMalletBase.Ironsteeldurability) {
					world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
				}
				return true;
			}
			return false;
		}

		if (itemstack.getItemDamage() == ToolMalletBase.Ironsteeldurability + 1) {
			Player.inventory.consumeInventoryItem(this);

			// FIX for EnchantmentDurability.negateDamage

		}

		return true;
	}

}