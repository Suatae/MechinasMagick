package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class SeedBaseV2 extends ItemBase implements IPlantable {
	private final Block	theBlockPlant;
	private final Block	soil;
	private final Block	activator;
	private final Block	cap;

	private Block		air	= Blocks.air;

	public SeedBaseV2(Block BlockPlant, Block SoilBlock, Block Cap, Block Activator) {
		super();
		theBlockPlant = BlockPlant;
		soil = SoilBlock;
		cap = Cap;
		activator = Activator;
	}

	@Override
	public boolean onItemUse(ItemStack ItemStack, EntityPlayer Player, World World, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 0) {
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y - 1, Z, par7, ItemStack)) {
				Block block = World.getBlock(X, Y - 1, Z);
				if (!(block != REF.BLOCK.air)) {

					// Layer 0 Row middle
					Block soil = World.getBlock(X, Y, Z);
					Block L1xm = World.getBlock(X - 1, Y, Z);
					Block L2xm = World.getBlock(X - 2, Y, Z);
					Block L3xm = World.getBlock(X - 3, Y, Z);
					Block L4xm = World.getBlock(X - 4, Y, Z);
					Block L1xp = World.getBlock(X + 1, Y, Z);
					Block L2xp = World.getBlock(X + 2, Y, Z);
					Block L3xp = World.getBlock(X + 3, Y, Z);
					Block L4xp = World.getBlock(X + 4, Y, Z);

					// Layer 0 Row z1
					Block zp1x4m = World.getBlock(X - 4, Y, Z + 1);
					Block zp1x3m = World.getBlock(X - 3, Y, Z + 1);
					Block zp1x2m = World.getBlock(X - 2, Y, Z + 1);
					Block zp1x1m = World.getBlock(X - 1, Y, Z + 1);
					Block zp1x = World.getBlock(X, Y, Z + 1);
					Block zp1x1p = World.getBlock(X + 1, Y, Z + 1);
					Block zp1x2p = World.getBlock(X + 2, Y, Z + 1);
					Block zp1x3p = World.getBlock(X + 3, Y, Z + 1);
					Block zp1x4p = World.getBlock(X + 4, Y, Z + 1);

					// Layer 0 Row z2
					Block zp2x4m = World.getBlock(X - 4, Y, Z + 2);
					Block zp2x3m = World.getBlock(X - 3, Y, Z + 2);
					Block zp2x2m = World.getBlock(X - 2, Y, Z + 2);
					Block zp2x1m = World.getBlock(X - 1, Y, Z + 2);
					Block zp2x = World.getBlock(X, Y, Z + 2);
					Block zp2x1p = World.getBlock(X + 1, Y, Z + 2);
					Block zp2x2p = World.getBlock(X + 2, Y, Z + 2);
					Block zp2x3p = World.getBlock(X + 3, Y, Z + 2);
					Block zp2x4p = World.getBlock(X + 4, Y, Z + 2);

					// Layer 0 Row z3
					Block zp3x4m = World.getBlock(X - 4, Y, Z + 3);
					Block zp3x3m = World.getBlock(X - 3, Y, Z + 3);
					Block zp3x2m = World.getBlock(X - 2, Y, Z + 3);
					Block zp3x1m = World.getBlock(X - 1, Y, Z + 3);
					Block zp3x = World.getBlock(X, Y, Z + 3);
					Block zp3x1p = World.getBlock(X + 1, Y, Z + 3);
					Block zp3x2p = World.getBlock(X + 2, Y, Z + 3);
					Block zp3x3p = World.getBlock(X + 3, Y, Z + 3);
					Block zp3x4p = World.getBlock(X + 4, Y, Z + 3);

					// Layer 0 Row z4
					Block zp4x4m = World.getBlock(X - 4, Y, Z + 4);
					Block zp4x3m = World.getBlock(X - 3, Y, Z + 4);
					Block zp4x2m = World.getBlock(X - 2, Y, Z + 4);
					Block zp4x1m = World.getBlock(X - 1, Y, Z + 4);
					Block zp4x = World.getBlock(X, Y, Z + 4);
					Block zp4x1p = World.getBlock(X + 1, Y, Z + 4);
					Block zp4x2p = World.getBlock(X + 2, Y, Z + 4);
					Block zp4x3p = World.getBlock(X + 3, Y, Z + 4);
					Block zp4x4p = World.getBlock(X + 4, Y, Z + 4);

					// Layer 0 Row z-1
					Block zn1x4m = World.getBlock(X - 4, Y, Z - 1);
					Block zn1x3m = World.getBlock(X - 3, Y, Z - 1);
					Block zn1x2m = World.getBlock(X - 2, Y, Z - 1);
					Block zn1x1m = World.getBlock(X - 1, Y, Z - 1);
					Block zn1x = World.getBlock(X, Y, Z - 1);
					Block zn1x1p = World.getBlock(X + 1, Y, Z - 1);
					Block zn1x2p = World.getBlock(X + 2, Y, Z - 1);
					Block zn1x3p = World.getBlock(X + 3, Y, Z - 1);
					Block zn1x4p = World.getBlock(X + 4, Y, Z - 1);

					// Layer 0 Row z-2
					Block zn2x4m = World.getBlock(X - 4, Y, Z - 2);
					Block zn2x3m = World.getBlock(X - 3, Y, Z - 2);
					Block zn2x2m = World.getBlock(X - 2, Y, Z - 2);
					Block zn2x1m = World.getBlock(X - 1, Y, Z - 2);
					Block zn2x = World.getBlock(X, Y, Z - 2);
					Block zn2x1p = World.getBlock(X + 1, Y, Z - 2);
					Block zn2x2p = World.getBlock(X + 2, Y, Z - 2);
					Block zn2x3p = World.getBlock(X + 3, Y, Z - 2);
					Block zn2x4p = World.getBlock(X + 4, Y, Z - 2);

					// Layer 0 Row z-3
					Block zn3x4m = World.getBlock(X - 4, Y, Z - 3);
					Block zn3x3m = World.getBlock(X - 3, Y, Z - 3);
					Block zn3x2m = World.getBlock(X - 2, Y, Z - 3);
					Block zn3x1m = World.getBlock(X - 1, Y, Z - 3);
					Block zn3x = World.getBlock(X, Y, Z - 3);
					Block zn3x1p = World.getBlock(X + 1, Y, Z - 3);
					Block zn3x2p = World.getBlock(X + 2, Y, Z - 3);
					Block zn3x3p = World.getBlock(X + 3, Y, Z - 3);
					Block zn3x4p = World.getBlock(X + 4, Y, Z - 3);

					// Layer 0 Row z-4
					Block zn4x4m = World.getBlock(X - 4, Y, Z - 4);
					Block zn4x3m = World.getBlock(X - 3, Y, Z - 4);
					Block zn4x2m = World.getBlock(X - 2, Y, Z - 4);
					Block zn4x1m = World.getBlock(X - 1, Y, Z - 4);
					Block zn4x = World.getBlock(X, Y, Z - 4);
					Block zn4x1p = World.getBlock(X + 1, Y, Z - 4);
					Block zn4x2p = World.getBlock(X + 2, Y, Z - 4);
					Block zn4x3p = World.getBlock(X + 3, Y, Z - 4);
					Block zn4x4p = World.getBlock(X + 4, Y, Z - 4);

					// Layer y1 Ring
					Block y1zn4x4m = World.getBlock(X - 4, Y + 1, Z - 4);
					Block y1zn4x3m = World.getBlock(X - 3, Y + 1, Z - 4);
					Block y1zn4x2m = World.getBlock(X - 2, Y + 1, Z - 4);
					Block y1zn4x1m = World.getBlock(X - 1, Y + 1, Z - 4);
					Block y1zn4x = World.getBlock(X, Y + 1, Z - 4);
					Block y1zn4x1p = World.getBlock(X + 1, Y + 1, Z - 4);
					Block y1zn4x2p = World.getBlock(X + 2, Y + 1, Z - 4);
					Block y1zn4x3p = World.getBlock(X + 3, Y + 1, Z - 4);
					Block y1zn4x4p = World.getBlock(X + 4, Y + 1, Z - 4);

					Block y1zp4x4m = World.getBlock(X - 4, Y + 1, Z + 4);
					Block y1zp4x3m = World.getBlock(X - 3, Y + 1, Z + 4);
					Block y1zp4x2m = World.getBlock(X - 2, Y + 1, Z + 4);
					Block y1zp4x1m = World.getBlock(X - 1, Y + 1, Z + 4);
					Block y1zp4x = World.getBlock(X, Y + 1, Z + 4);
					Block y1zp4x1p = World.getBlock(X + 1, Y + 1, Z + 4);
					Block y1zp4x2p = World.getBlock(X + 2, Y + 1, Z + 4);
					Block y1zp4x3p = World.getBlock(X + 3, Y + 1, Z + 4);
					Block y1zp4x4p = World.getBlock(X + 4, Y + 1, Z + 4);

					Block y1zm3x4m = World.getBlock(X - 4, Y + 1, Z - 3);
					Block y1zm2x4m = World.getBlock(X - 4, Y + 1, Z - 2);
					Block y1zm1x4m = World.getBlock(X - 4, Y + 1, Z - 1);
					Block y1zx4m = World.getBlock(X - 4, Y + 1, Z);
					Block y1zp1x4m = World.getBlock(X - 4, Y + 1, Z + 1);
					Block y1zp2x4m = World.getBlock(X - 4, Y + 1, Z + 2);
					Block y1zp3x4m = World.getBlock(X - 4, Y + 1, Z + 3);

					Block y1zm3x4p = World.getBlock(X + 4, Y + 1, Z - 3);
					Block y1zm2x4p = World.getBlock(X + 4, Y + 1, Z - 2);
					Block y1zm1x4p = World.getBlock(X + 4, Y + 1, Z - 1);
					Block y1zx4p = World.getBlock(X + 4, Y + 1, Z);
					Block y1zp1x4p = World.getBlock(X + 4, Y + 1, Z + 1);
					Block y1zp2x4p = World.getBlock(X + 4, Y + 1, Z + 2);
					Block y1zp3x4p = World.getBlock(X + 4, Y + 1, Z + 3);

					// Layer y1+2 center
					Block y1zx = World.getBlock(X, Y + 1, Z);
					Block y2zx = World.getBlock(X, Y + 2, Z);
					Block y2zp4xp4 = World.getBlock(X + 4, Y + 2, Z + 4);
					Block y2zp4xm4 = World.getBlock(X + 4, Y + 2, Z - 4);
					Block y2zm4xp4 = World.getBlock(X - 4, Y + 2, Z + 4);
					Block y2zm4xm4 = World.getBlock(X - 4, Y + 2, Z - 4);

					Block y1z1px = World.getBlock(X, Y + 1, Z + 1);
					Block y1z1px1p = World.getBlock(X + 1, Y + 1, Z + 1);
					Block y1z1px1m = World.getBlock(X - 1, Y + 1, Z + 1);
					Block y1z1mx = World.getBlock(X, Y + 1, Z - 1);
					Block y1z1mx1p = World.getBlock(X + 1, Y + 1, Z - 1);
					Block y1z1mx1m = World.getBlock(X - 1, Y + 1, Z - 1);
					Block y1x1p = World.getBlock(X + 1, Y + 1, Z);
					Block y1x1m = World.getBlock(X - 1, Y + 1, Z);

					// Layer y1 buffer
					Block bufferZp3Xp3 = World.getBlock(X + 3, Y + 1, Z + 3);
					Block bufferZp3Xp2 = World.getBlock(X + 2, Y + 1, Z + 3);
					Block bufferZp3Xp1 = World.getBlock(X + 1, Y + 1, Z + 3);
					Block bufferZp3 = World.getBlock(X, Y + 1, Z + 3);
					Block bufferZp3Xn1 = World.getBlock(X - 1, Y + 1, Z + 3);
					Block bufferZp3Xn2 = World.getBlock(X - 2, Y + 1, Z + 3);
					Block bufferZp3Xn3 = World.getBlock(X - 3, Y + 1, Z + 3);

					Block bufferZp2Xp3 = World.getBlock(X + 3, Y + 1, Z + 2);
					Block bufferZp2Xp2 = World.getBlock(X + 2, Y + 1, Z + 2);
					Block bufferZp2Xp1 = World.getBlock(X + 1, Y + 1, Z + 2);
					Block bufferZp2 = World.getBlock(X, Y + 1, Z + 2);
					Block bufferZp2Xn1 = World.getBlock(X - 1, Y + 1, Z + 2);
					Block bufferZp2Xn2 = World.getBlock(X - 2, Y + 1, Z + 2);
					Block bufferZp2Xn3 = World.getBlock(X - 3, Y + 1, Z + 2);

					Block y1z1px3p = World.getBlock(X + 3, Y + 1, Z + 1);
					Block y1z1px2p = World.getBlock(X + 2, Y + 1, Z + 1);
					Block y1z1px2m = World.getBlock(X - 2, Y + 1, Z + 1);
					Block y1z1px3m = World.getBlock(X - 3, Y + 1, Z + 1);

					Block y1zx3p = World.getBlock(X + 3, Y + 1, Z);
					Block y1zx2p = World.getBlock(X + 2, Y + 1, Z);
					Block y1zx2m = World.getBlock(X - 2, Y + 1, Z);
					Block y1zx3m = World.getBlock(X - 3, Y + 1, Z);

					Block y1z1mx3p = World.getBlock(X + 3, Y + 1, Z - 1);
					Block y1z1mx2p = World.getBlock(X + 2, Y + 1, Z - 1);
					Block y1z1mx2m = World.getBlock(X - 2, Y + 1, Z - 1);
					Block y1z1mx3m = World.getBlock(X - 4, Y + 1, Z - 1);

					Block y1z2mx3p = World.getBlock(X + 3, Y + 1, Z - 2);
					Block y1z2mx2p = World.getBlock(X + 2, Y + 1, Z - 2);
					Block y1z2mx1p = World.getBlock(X + 1, Y + 1, Z - 2);
					Block y1z2mx = World.getBlock(X, Y + 1, Z - 2);
					Block y1z2mx1m = World.getBlock(X - 1, Y + 1, Z - 2);
					Block y1z2mx2m = World.getBlock(X - 2, Y + 1, Z - 2);
					Block y1z2mx3m = World.getBlock(X - 3, Y + 1, Z - 2);

					Block y1z3mx3p = World.getBlock(X + 3, Y + 1, Z - 3);
					Block y1z3mx2p = World.getBlock(X + 2, Y + 1, Z - 3);
					Block y1z3mx1p = World.getBlock(X + 1, Y + 1, Z - 3);
					Block y1z3mx = World.getBlock(X, Y + 1, Z - 3);
					Block y1z3mx1m = World.getBlock(X - 1, Y + 1, Z - 3);
					Block y1z3mx2m = World.getBlock(X - 2, Y + 1, Z - 3);
					Block y1z3mx3m = World.getBlock(X - 3, Y + 1, Z - 3);

					if (!(soil != REF.BLOCK.SEED.SOIL) && (L1xm != air) && (L2xm != air)
							&& (L3xm != air) && (L4xm != air) && (L1xp != air) && (L2xp != air)
							&& (L3xp != air) && (L4xp != air) && (zp1x4m != air) && (zp1x3m != air)
							&& (zp1x2m != air) && (zp1x1m != air) && (zp1x != air)
							&& (zp1x1p != air) && (zp1x2p != air) && (zp1x3p != air)
							&& (zp1x4p != air) && (zp2x4m != air) && (zp2x3m != air)
							&& (zp2x2m != air) && (zp2x1m != air) && (zp2x != air)
							&& (zp2x1p != air) && (zp2x2p != air) && (zp2x3p != air)
							&& (zp2x4p != air) && (zp1x4m != air) && (zp3x3m != air)
							&& (zp3x2m != air) && (zp3x1m != air) && (zp3x != air)
							&& (zp3x1p != air) && (zp3x2p != air) && (zp3x3p != air)
							&& (zp3x4p != air) && (zp3x4m != air) && (zp4x3m != air)
							&& (zp4x2m != air) && (zp4x1m != air) && (zp4x != air)
							&& (zp4x1p != air) && (zp4x2p != air) && (zp4x3p != air)
							&& (zp4x4p != air) && (zn1x4m != air) && (zn1x3m != air)
							&& (zn1x2m != air) && (zn1x1m != air) && (zn1x != air)
							&& (zn1x1p != air) && (zn1x2p != air) && (zn1x3p != air)
							&& (zn1x4p != air) && (zn2x4m != air) && (zn2x3m != air)
							&& (zn2x2m != air) && (zn2x1m != air) && (zn2x != air)
							&& (zn2x1p != air) && (zn2x2p != air) && (zn2x3p != air)
							&& (zn2x4p != air) && (zn1x4m != air) && (zn3x3m != air)
							&& (zn3x2m != air) && (zn3x1m != air) && (zn3x != air)
							&& (zn3x1p != air) && (zn3x2p != air) && (zn3x3p != air)
							&& (zn3x4p != air) && (zn3x4m != air) && (zn4x3m != air)
							&& (zn4x2m != air) && (zn4x1m != air) && (zn4x != air)
							&& (zn4x1p != air) && (zn4x2p != air) && (zn4x3p != air)
							&& (zn4x4p != air) && (y1zn4x4m != air) && (y1zn4x3m != air)
							&& (y1zn4x2m != air) && (y1zn4x1m != air) && (y1zn4x != air)
							&& (y1zn4x1p != air) && (y1zn4x2p != air) && (y1zn4x3p != air)
							&& (y1zn4x4p != air) && (y1zp4x4m != air) && (y1zp4x3m != air)
							&& (y1zp4x2m != air) && (y1zp4x1m != air) && (y1zp4x != air)
							&& (y1zp4x1p != air) && (y1zp4x2p != air) && (y1zp4x3p != air)
							&& (y1zp4x4p != air) && (y1zm3x4m != air) && (y1zm2x4m != air)
							&& (y1zm1x4m != air) && (y1zx4m != air) && (y1zp1x4m != air)
							&& (y1zp2x4m != air) && (y1zp3x4m != air) && (y1zm3x4p != air)
							&& (y1zm2x4p != air) && (y1zm1x4p != air) && (y1zx4p != air)
							&& (y1zp1x4p != air) && (y1zp2x4p != air) && (y1zp3x4p != air)
							&& !(y1zx != REF.BLOCK.dirt) && !(y2zx != REF.BLOCK.log)
							&& (y2zp4xp4 != air) && (y2zp4xm4 != air) && (y2zm4xp4 != air)
							&& (y2zm4xm4 != air) && (y1z1px != air) && (y1z1px1p != air)
							&& (y1z1px1m != air) && (y1z1mx != air) && (y1z1mx1p != air)
							&& (y1z1mx1m != air) && (y1x1p != air) && (y1x1m != air)

							&& (bufferZp3Xp3 != air) && (bufferZp3Xp2 != air)
							&& (bufferZp3Xp1 != air) && (bufferZp3 != air) && (bufferZp3Xn1 != air)
							&& (bufferZp3Xn2 != air) && (bufferZp3Xn3 != air)

							&& (bufferZp2Xp3 != air) && (bufferZp2Xp2 != air)
							&& (bufferZp2Xp1 != air) && (bufferZp2 != air) && (bufferZp2Xn1 != air)
							&& (bufferZp2Xn2 != air) && (bufferZp2Xn3 != air)

							&& (y1z1px3p != air) && (y1z1px2p != air) && (y1z1px2m != air)
							&& (y1z1px3m != air)

							&& (y1zx3p != air) && (y1zx2p != air) && (y1zx2m != air)
							&& (y1zx3m != air)

							&& (y1z1mx3p != air) && (y1z1mx2p != air) && (y1z1mx2m != air)
							&& (y1z1mx3m != air)

							&& (y1z2mx3p != air) && (bufferZp3Xp2 != air) && (y1z2mx1p != air)
							&& (bufferZp3 != air) && (y1z2mx1m != air) && (bufferZp3Xn2 != air)
							&& (y1z2mx3m != air)

							&& (y1z3mx3p != air) && (bufferZp3Xp2 != air) && (y1z3mx1p != air)
							&& (bufferZp3 != air) && (y1z3mx1m != air) && (bufferZp3Xn2 != air)
							&& (y1z3mx3m != air)) {

						// Holder Pillars
						Block HolderY1nZp4Xp4 = World.getBlock(X + 4, Y - 1, Z + 4);
						Block HolderY2nZp4Xp4 = World.getBlock(X + 4, Y - 2, Z + 4);
						Block HolderY3nZp4Xp4 = World.getBlock(X + 4, Y - 3, Z + 4);
						Block HolderY1nZp4Xn4 = World.getBlock(X - 4, Y - 1, Z + 4);
						Block HolderY2nZp4Xn4 = World.getBlock(X - 4, Y - 2, Z + 4);
						Block HolderY3nZp4Xn4 = World.getBlock(X - 4, Y - 3, Z + 4);
						Block HolderY1nZn4Xp4 = World.getBlock(X + 4, Y - 1, Z - 4);
						Block HolderY2nZn4Xp4 = World.getBlock(X + 4, Y - 2, Z - 4);
						Block HolderY3nZn4Xp4 = World.getBlock(X + 4, Y - 3, Z - 4);
						Block HolderY1nZn4Xn4 = World.getBlock(X - 4, Y - 1, Z - 4);
						Block HolderY2nZn4Xn4 = World.getBlock(X - 4, Y - 2, Z - 4);
						Block HolderY3nZn4Xn4 = World.getBlock(X - 4, Y - 3, Z - 4);

						// Holder Stairs
						Block HolderY1nZp4Xp3 = World.getBlock(X + 4, Y - 3, Z + 3);
						Block HolderY3nZp4Xp3 = World.getBlock(X + 4, Y - 3, Z + 3);
						Block HolderY1nZp4Xn3 = World.getBlock(X + 4, Y - 3, Z - 3);
						Block HolderY3nZp4Xn3 = World.getBlock(X + 4, Y - 3, Z - 3);
						Block HolderY1nZn4Xp3 = World.getBlock(X - 4, Y - 3, Z + 3);
						Block HolderY3nZn4Xp3 = World.getBlock(X - 4, Y - 3, Z + 3);
						Block HolderY1nZn4Xn3 = World.getBlock(X - 4, Y - 3, Z - 3);
						Block HolderY3nZn4Xn3 = World.getBlock(X - 4, Y - 3, Z - 3);
						Block HolderY1nZp3Xp4 = World.getBlock(X + 3, Y - 3, Z + 4);
						Block HolderY3nZp3Xp4 = World.getBlock(X + 3, Y - 3, Z + 4);
						Block HolderY1nZp3Xn4 = World.getBlock(X + 3, Y - 3, Z - 4);
						Block HolderY3nZp3Xn4 = World.getBlock(X + 3, Y - 3, Z - 4);
						Block HolderY1nZn3Xp4 = World.getBlock(X - 3, Y - 3, Z + 4);
						Block HolderY3nZn3Xp4 = World.getBlock(X - 3, Y - 3, Z + 4);
						Block HolderY1nZn3Xn4 = World.getBlock(X - 3, Y - 3, Z - 4);
						Block HolderY3nZn3Xn4 = World.getBlock(X - 3, Y - 3, Z - 4);

						// Log Holders
						Block WoodY1nZp3 = World.getBlock(X, Y - 1, Z + 3);
						Block WoodY2nZp3 = World.getBlock(X, Y - 2, Z + 3);
						Block WoodY3nZp3 = World.getBlock(X, Y - 3, Z + 3);
						Block WoodY1nZn3 = World.getBlock(X, Y - 1, Z - 3);
						Block WoodY2nZn3 = World.getBlock(X, Y - 2, Z - 3);
						Block WoodY3nZn3 = World.getBlock(X, Y - 3, Z - 3);
						Block WoodY1nXp3 = World.getBlock(X + 3, Y - 1, Z);
						Block WoodY2nXp3 = World.getBlock(X + 3, Y - 2, Z);
						Block WoodY3nXp3 = World.getBlock(X + 3, Y - 3, Z);
						Block WoodY1nXn3 = World.getBlock(X - 3, Y - 1, Z);
						Block WoodY2nXn3 = World.getBlock(X - 3, Y - 2, Z);
						Block WoodY3nXn3 = World.getBlock(X - 3, Y - 3, Z);

						Block WoodHY1nZp2 = World.getBlock(X, Y - 1, Z + 2);
						Block WoodHY1nZn2 = World.getBlock(X, Y - 1, Z - 2);
						Block WoodHY1nXp2 = World.getBlock(X + 2, Y - 1, Z);
						Block WoodHY1nXn2 = World.getBlock(X - 2, Y - 1, Z);

						Block WoodHY3nZp4 = World.getBlock(X, Y - 3, Z + 4);
						Block WoodHY3nZn4 = World.getBlock(X, Y - 3, Z - 4);
						Block WoodHY3nXp4 = World.getBlock(X + 4, Y - 3, Z);
						Block WoodHY3nXn4 = World.getBlock(X - 4, Y - 3, Z);

						Block CocoaY1nZp3Xn1 = World.getBlock(X - 1, Y - 1, Z + 3);
						Block CocoaY1nZp3Xp1 = World.getBlock(X + 1, Y - 1, Z + 3);
						Block CocoaY2nZp3Xn1 = World.getBlock(X - 1, Y - 2, Z + 3);
						Block CocoaY2nZp3Xp1 = World.getBlock(X + 1, Y - 2, Z + 3);
						Block CocoaY3nZp3Xn1 = World.getBlock(X - 1, Y - 3, Z + 3);
						Block CocoaY3nZp3Xp1 = World.getBlock(X + 1, Y - 3, Z + 3);

						Block CocoaY1nZn3Xn1 = World.getBlock(X - 1, Y - 1, Z - 3);
						Block CocoaY1nZn3Xp1 = World.getBlock(X + 1, Y - 1, Z - 3);
						Block CocoaY2nZn3Xn1 = World.getBlock(X - 1, Y - 2, Z - 3);
						Block CocoaY2nZn3Xp1 = World.getBlock(X + 1, Y - 2, Z - 3);
						Block CocoaY3nZn3Xn1 = World.getBlock(X - 1, Y - 3, Z - 3);
						Block CocoaY3nZn3Xp1 = World.getBlock(X + 1, Y - 3, Z - 3);

						Block CocoaY1nZn1Xp3 = World.getBlock(X + 3, Y - 1, Z - 1);
						Block CocoaY1nZp1Xp3 = World.getBlock(X + 3, Y - 1, Z + 1);
						Block CocoaY2nZn1Xp3 = World.getBlock(X + 3, Y - 2, Z - 1);
						Block CocoaY2nZp1Xp3 = World.getBlock(X + 3, Y - 2, Z + 1);
						Block CocoaY3nZn1Xp3 = World.getBlock(X + 3, Y - 3, Z - 1);
						Block CocoaY3nZp1Xp3 = World.getBlock(X + 3, Y - 3, Z + 1);

						Block CocoaY1nZn1Xn3 = World.getBlock(X - 3, Y - 1, Z - 1);
						Block CocoaY1nZp1Xn3 = World.getBlock(X - 3, Y - 1, Z + 1);
						Block CocoaY2nZn1Xn3 = World.getBlock(X - 3, Y - 2, Z - 1);
						Block CocoaY2nZp1Xn3 = World.getBlock(X - 3, Y - 2, Z + 1);
						Block CocoaY3nZn1Xn3 = World.getBlock(X - 3, Y - 3, Z - 1);
						Block CocoaY3nZp1Xn3 = World.getBlock(X - 3, Y - 3, Z + 1);

						// Layer y-4 Base
						Block BaseY4nZp5Xp5 = World.getBlock(X + 5, Y - 4, Z + 5);
						Block BaseY4nZp5Xp4 = World.getBlock(X + 4, Y - 4, Z + 5);
						Block BaseY4nZp5Xp3 = World.getBlock(X + 3, Y - 4, Z + 5);
						Block BaseY4nZp5Xp2 = World.getBlock(X + 2, Y - 4, Z + 5);
						Block BaseY4nZp5Xp1 = World.getBlock(X + 1, Y - 4, Z + 5);
						Block BaseY4nZp5X = World.getBlock(X, Y - 4, Z + 5);
						Block BaseY4nZp5Xn1 = World.getBlock(X - 1, Y - 4, Z + 5);
						Block BaseY4nZp5Xn2 = World.getBlock(X - 2, Y - 4, Z + 5);
						Block BaseY4nZp5Xn3 = World.getBlock(X - 3, Y - 4, Z + 5);
						Block BaseY4nZp5Xn4 = World.getBlock(X - 4, Y - 4, Z + 5);
						Block BaseY4nZp5Xn5 = World.getBlock(X - 5, Y - 4, Z + 5);

						Block BaseY4nZp4Xp5 = World.getBlock(X + 5, Y - 4, Z + 4);
						Block BaseY4nZp4Xp4 = World.getBlock(X + 4, Y - 4, Z + 4);
						Block BaseY4nZp4Xp3 = World.getBlock(X + 3, Y - 4, Z + 4);
						Block BaseY4nZp4Xp2 = World.getBlock(X + 2, Y - 4, Z + 4);
						Block BaseY4nZp4Xp1 = World.getBlock(X + 1, Y - 4, Z + 4);
						Block BaseY4nZp4X = World.getBlock(X, Y - 4, Z + 4);
						Block BaseY4nZp4Xn1 = World.getBlock(X - 1, Y - 4, Z + 4);
						Block BaseY4nZp4Xn2 = World.getBlock(X - 2, Y - 4, Z + 4);
						Block BaseY4nZp4Xn3 = World.getBlock(X - 3, Y - 4, Z + 4);
						Block BaseY4nZp4Xn4 = World.getBlock(X - 4, Y - 4, Z + 4);
						Block BaseY4nZp4Xn5 = World.getBlock(X - 5, Y - 4, Z + 4);

						Block BaseY4nZp3Xp5 = World.getBlock(X + 5, Y - 4, Z + 3);
						Block BaseY4nZp3Xp4 = World.getBlock(X + 4, Y - 4, Z + 3);
						Block BaseY4nZp3Xp3 = World.getBlock(X + 3, Y - 4, Z + 3);
						Block BaseY4nZp3Xp2 = World.getBlock(X + 2, Y - 4, Z + 3);
						Block BaseY4nZp3Xp1 = World.getBlock(X + 1, Y - 4, Z + 3);
						Block BaseY4nZp3X = World.getBlock(X, Y - 4, Z + 3);
						Block BaseY4nZp3Xn1 = World.getBlock(X - 1, Y - 4, Z + 3);
						Block BaseY4nZp3Xn2 = World.getBlock(X - 2, Y - 4, Z + 3);
						Block BaseY4nZp3Xn3 = World.getBlock(X - 3, Y - 4, Z + 3);
						Block BaseY4nZp3Xn4 = World.getBlock(X - 4, Y - 4, Z + 3);
						Block BaseY4nZp3Xn5 = World.getBlock(X - 5, Y - 4, Z + 3);

						Block BaseY4nZp2Xp5 = World.getBlock(X + 5, Y - 4, Z + 2);
						Block BaseY4nZp2Xp4 = World.getBlock(X + 4, Y - 4, Z + 2);
						Block BaseY4nZp2Xp3 = World.getBlock(X + 3, Y - 4, Z + 2);
						Block BaseY4nZp2Xn3 = World.getBlock(X - 3, Y - 4, Z + 2);
						Block BaseY4nZp2Xn4 = World.getBlock(X - 4, Y - 4, Z + 2);
						Block BaseY4nZp2Xn5 = World.getBlock(X - 5, Y - 4, Z + 2);

						Block BaseY4nZp1Xp5 = World.getBlock(X + 5, Y - 4, Z + 1);
						Block BaseY4nZp1Xp4 = World.getBlock(X + 4, Y - 4, Z + 1);
						Block BaseY4nZp1Xp3 = World.getBlock(X + 3, Y - 4, Z + 1);
						Block BaseY4nZp1Xn3 = World.getBlock(X - 3, Y - 4, Z + 1);
						Block BaseY4nZp1Xn4 = World.getBlock(X - 4, Y - 4, Z + 1);
						Block BaseY4nZp1Xn5 = World.getBlock(X - 5, Y - 4, Z + 1);

						Block BaseY4nZXp5 = World.getBlock(X + 5, Y - 4, Z);
						Block BaseY4nZXp4 = World.getBlock(X + 4, Y - 4, Z);
						Block BaseY4nZXp3 = World.getBlock(X + 3, Y - 4, Z);
						Block BaseY4nZXn3 = World.getBlock(X - 3, Y - 4, Z);
						Block BaseY4nZXn4 = World.getBlock(X - 4, Y - 4, Z);
						Block BaseY4nZXn5 = World.getBlock(X - 5, Y - 4, Z);

						Block BaseY4nZn1Xp5 = World.getBlock(X + 5, Y - 4, Z - 1);
						Block BaseY4nZn1Xp4 = World.getBlock(X + 4, Y - 4, Z - 1);
						Block BaseY4nZn1Xp3 = World.getBlock(X + 3, Y - 4, Z - 1);
						Block BaseY4nZn1Xn3 = World.getBlock(X - 3, Y - 4, Z - 1);
						Block BaseY4nZn1Xn4 = World.getBlock(X - 4, Y - 4, Z - 1);
						Block BaseY4nZn1Xn5 = World.getBlock(X - 5, Y - 4, Z - 1);

						Block BaseY4nZn2Xp5 = World.getBlock(X + 5, Y - 4, Z - 2);
						Block BaseY4nZn2Xp4 = World.getBlock(X + 4, Y - 4, Z - 2);
						Block BaseY4nZn2Xp3 = World.getBlock(X + 3, Y - 4, Z - 2);
						Block BaseY4nZn2Xn3 = World.getBlock(X - 3, Y - 4, Z - 2);
						Block BaseY4nZn2Xn4 = World.getBlock(X - 4, Y - 4, Z - 2);
						Block BaseY4nZn2Xn5 = World.getBlock(X - 5, Y - 4, Z - 2);

						Block BaseY4nZn3Xp5 = World.getBlock(X + 5, Y - 4, Z - 3);
						Block BaseY4nZn3Xp4 = World.getBlock(X + 4, Y - 4, Z - 3);
						Block BaseY4nZn3Xp3 = World.getBlock(X + 3, Y - 4, Z - 3);
						Block BaseY4nZn3Xp2 = World.getBlock(X + 2, Y - 4, Z - 3);
						Block BaseY4nZn3Xp1 = World.getBlock(X + 1, Y - 4, Z - 3);
						Block BaseY4nZn3X = World.getBlock(X, Y - 4, Z - 3);
						Block BaseY4nZn3Xn1 = World.getBlock(X - 1, Y - 4, Z - 3);
						Block BaseY4nZn3Xn2 = World.getBlock(X - 2, Y - 4, Z - 3);
						Block BaseY4nZn3Xn3 = World.getBlock(X - 3, Y - 4, Z - 3);
						Block BaseY4nZn3Xn4 = World.getBlock(X - 4, Y - 4, Z - 3);
						Block BaseY4nZn3Xn5 = World.getBlock(X - 5, Y - 4, Z - 3);

						Block BaseY4nZn4Xp5 = World.getBlock(X + 5, Y - 4, Z - 4);
						Block BaseY4nZn4Xp4 = World.getBlock(X + 4, Y - 4, Z - 4);
						Block BaseY4nZn4Xp3 = World.getBlock(X + 3, Y - 4, Z - 4);
						Block BaseY4nZn4Xp2 = World.getBlock(X + 2, Y - 4, Z - 4);
						Block BaseY4nZn4Xp1 = World.getBlock(X + 1, Y - 4, Z - 4);
						Block BaseY4nZn4X = World.getBlock(X, Y - 4, Z - 4);
						Block BaseY4nZn4Xn1 = World.getBlock(X - 1, Y - 4, Z - 4);
						Block BaseY4nZn4Xn2 = World.getBlock(X - 2, Y - 4, Z - 4);
						Block BaseY4nZn4Xn3 = World.getBlock(X - 3, Y - 4, Z - 4);
						Block BaseY4nZn4Xn4 = World.getBlock(X - 4, Y - 4, Z - 4);
						Block BaseY4nZn4Xn5 = World.getBlock(X - 5, Y - 4, Z - 4);

						Block BaseY4nZn5Xp5 = World.getBlock(X + 5, Y - 4, Z - 5);
						Block BaseY4nZn5Xp4 = World.getBlock(X + 4, Y - 4, Z - 5);
						Block BaseY4nZn5Xp3 = World.getBlock(X + 3, Y - 4, Z - 5);
						Block BaseY4nZn5Xp2 = World.getBlock(X + 2, Y - 4, Z - 5);
						Block BaseY4nZn5Xp1 = World.getBlock(X + 1, Y - 4, Z - 5);
						Block BaseY4nZn5X = World.getBlock(X, Y - 4, Z - 5);
						Block BaseY4nZn5Xn1 = World.getBlock(X - 1, Y - 4, Z - 5);
						Block BaseY4nZn5Xn2 = World.getBlock(X - 2, Y - 4, Z - 5);
						Block BaseY4nZn5Xn3 = World.getBlock(X - 3, Y - 4, Z - 5);
						Block BaseY4nZn5Xn4 = World.getBlock(X - 4, Y - 4, Z - 5);
						Block BaseY4nZn5Xn5 = World.getBlock(X - 5, Y - 4, Z - 5);

						// Tilled Soil
						Block SoilY4nZp2Xp2 = World.getBlock(X + 2, Y - 4, Z + 2);
						Block SoilY4nZp2Xp1 = World.getBlock(X + 1, Y - 4, Z + 2);
						Block SoilY4nZp2X = World.getBlock(X, Y - 4, Z + 2);
						Block SoilY4nZp2Xn1 = World.getBlock(X - 1, Y - 4, Z + 2);
						Block SoilY4nZp2Xn2 = World.getBlock(X - 2, Y - 4, Z + 2);

						Block SoilY4nZp1Xp2 = World.getBlock(X + 2, Y - 4, Z + 1);
						Block SoilY4nZp1Xp1 = World.getBlock(X + 1, Y - 4, Z + 1);
						Block SoilY4nZp1X = World.getBlock(X, Y - 4, Z + 1);
						Block SoilY4nZp1Xn1 = World.getBlock(X - 1, Y - 4, Z + 1);
						Block SoilY4nZp1Xn2 = World.getBlock(X - 2, Y - 4, Z + 1);

						Block SoilY4nZXp2 = World.getBlock(X + 2, Y - 4, Z);
						Block SoilY4nZXp1 = World.getBlock(X + 1, Y - 4, Z);
						Block WaterCenter = World.getBlock(X, Y - 4, Z);
						Block SoilY4nZXn1 = World.getBlock(X - 1, Y - 4, Z);
						Block SoilY4nZXn2 = World.getBlock(X - 2, Y - 4, Z);

						Block SoilY4nZn1Xp2 = World.getBlock(X + 2, Y - 4, Z - 1);
						Block SoilY4nZn1Xp1 = World.getBlock(X + 1, Y - 4, Z - 1);
						Block SoilY4nZn1X = World.getBlock(X, Y - 4, Z - 1);
						Block SoilY4nZn1Xn1 = World.getBlock(X - 1, Y - 4, Z - 1);
						Block SoilY4nZn1Xn2 = World.getBlock(X - 2, Y - 4, Z - 1);

						Block SoilY4nZn2Xp2 = World.getBlock(X + 2, Y - 4, Z - 2);
						Block SoilY4nZn2Xp1 = World.getBlock(X + 1, Y - 4, Z - 2);
						Block SoilY4nZn2X = World.getBlock(X, Y - 4, Z - 2);
						Block SoilY4nZn2Xn1 = World.getBlock(X - 1, Y - 4, Z - 2);
						Block SoilY4nZn2Xn2 = World.getBlock(X - 2, Y - 4, Z - 2);

						if ((HolderY1nZp4Xp4 != air) && (HolderY2nZp4Xp4 != air)
								&& (HolderY3nZp4Xp4 != air) && (HolderY1nZp4Xn4 != air)
								&& (HolderY2nZp4Xn4 != air) && (HolderY3nZp4Xn4 != air)
								&& (HolderY1nZn4Xp4 != air) && (HolderY3nZn4Xp4 != air)
								&& (HolderY3nZn4Xp4 != air) && (HolderY1nZn4Xn4 != air)
								&& (HolderY2nZn4Xn4 != air) && (HolderY3nZn4Xn4 != air)
								&& (HolderY1nZp4Xp3 != air) && (HolderY3nZp4Xp3 != air)
								&& (HolderY1nZp4Xn3 != air) && (HolderY3nZp4Xn3 != air)
								&& (HolderY1nZn4Xp3 != air) && (HolderY3nZn4Xp3 != air)
								&& (HolderY1nZn4Xn3 != air) && (HolderY3nZn4Xn3 != air)
								&& (HolderY1nZp3Xp4 != air) && (HolderY3nZp3Xp4 != air)
								&& (HolderY1nZp3Xn4 != air) && (HolderY3nZp3Xn4 != air)
								&& (HolderY1nZn3Xp4 != air) && (HolderY3nZn3Xp4 != air)
								&& (HolderY1nZn3Xn4 != air) && (HolderY3nZn3Xn4 != air)
								&& !(WoodY1nZp3 != REF.BLOCK.log) && !(WoodY2nZp3 != REF.BLOCK.log)
								&& !(WoodY3nZp3 != REF.BLOCK.log) && !(WoodY1nZn3 != REF.BLOCK.log)
								&& !(WoodY2nZn3 != REF.BLOCK.log) && !(WoodY3nZn3 != REF.BLOCK.log)
								&& !(WoodY1nXp3 != REF.BLOCK.log) && !(WoodY2nXp3 != REF.BLOCK.log)
								&& !(WoodY3nXp3 != REF.BLOCK.log) && !(WoodY1nXn3 != REF.BLOCK.log)
								&& !(WoodY2nXn3 != REF.BLOCK.log) && !(WoodY3nXn3 != REF.BLOCK.log)

								&& (WoodHY1nZp2 != air) && (WoodHY1nZn2 != air)
								&& (WoodHY1nXp2 != air) && (WoodHY1nXn2 != air)

								&& (WoodHY3nZp4 != air) && (WoodHY3nZn4 != air)
								&& (WoodHY3nXp4 != air) && (WoodHY3nXn4 != air)

								&& !(CocoaY1nZp3Xn1 != Blocks.cocoa)
								&& !(CocoaY1nZp3Xp1 != Blocks.cocoa)
								&& !(CocoaY2nZp3Xn1 != Blocks.cocoa)
								&& !(CocoaY2nZp3Xp1 != Blocks.cocoa)
								&& !(CocoaY3nZp3Xn1 != Blocks.cocoa)
								&& !(CocoaY3nZp3Xp1 != Blocks.cocoa)

								&& !(CocoaY1nZn3Xn1 != Blocks.cocoa)
								&& !(CocoaY1nZn3Xp1 != Blocks.cocoa)
								&& !(CocoaY2nZn3Xn1 != Blocks.cocoa)
								&& !(CocoaY2nZn3Xp1 != Blocks.cocoa)
								&& !(CocoaY3nZn3Xn1 != Blocks.cocoa)
								&& !(CocoaY3nZn3Xp1 != Blocks.cocoa)

								&& !(CocoaY1nZn1Xp3 != Blocks.cocoa)
								&& !(CocoaY1nZp1Xp3 != Blocks.cocoa)
								&& !(CocoaY2nZn1Xp3 != Blocks.cocoa)
								&& !(CocoaY2nZp1Xp3 != Blocks.cocoa)
								&& !(CocoaY3nZn1Xp3 != Blocks.cocoa)
								&& !(CocoaY3nZp1Xp3 != Blocks.cocoa)

								&& !(CocoaY1nZn1Xn3 != Blocks.cocoa)
								&& !(CocoaY1nZp1Xn3 != Blocks.cocoa)
								&& !(CocoaY2nZn1Xn3 != Blocks.cocoa)
								&& !(CocoaY2nZp1Xn3 != Blocks.cocoa)
								&& !(CocoaY3nZn1Xn3 != Blocks.cocoa)
								&& !(CocoaY3nZp1Xn3 != Blocks.cocoa)

								&& (BaseY4nZp5Xp5 != air) && (BaseY4nZp5Xp4 != air)
								&& (BaseY4nZp5Xp3 != air) && (BaseY4nZp5Xp2 != air)
								&& (BaseY4nZp5Xp1 != air) && (BaseY4nZp5X != air)
								&& (BaseY4nZp5Xn1 != air) && (BaseY4nZp5Xn2 != air)
								&& (BaseY4nZp5Xn3 != air) && (BaseY4nZp5Xn4 != air)
								&& (BaseY4nZp5Xn5 != air)

								&& (BaseY4nZp4Xp5 != air) && (BaseY4nZp4Xp4 != air)
								&& (BaseY4nZp4Xp3 != air) && (BaseY4nZp4Xp2 != air)
								&& (BaseY4nZp4Xp1 != air) && (BaseY4nZp4X != air)
								&& (BaseY4nZp4Xn1 != air) && (BaseY4nZp4Xn2 != air)
								&& (BaseY4nZp4Xn3 != air) && (BaseY4nZp4Xn4 != air)
								&& (BaseY4nZp4Xn5 != air)

								&& (BaseY4nZp3Xp5 != air) && (BaseY4nZp3Xp4 != air)
								&& (BaseY4nZp3Xp3 != air) && (BaseY4nZp3Xp2 != air)
								&& (BaseY4nZp3Xp1 != air) && (BaseY4nZp3X != air)
								&& (BaseY4nZp3Xn1 != air) && (BaseY4nZp3Xn2 != air)
								&& (BaseY4nZp3Xn3 != air) && (BaseY4nZp3Xn4 != air)
								&& (BaseY4nZp3Xn5 != air)

								&& (BaseY4nZn3Xp5 != air) && (BaseY4nZn3Xp4 != air)
								&& (BaseY4nZn3Xp3 != air) && (BaseY4nZn3Xp2 != air)
								&& (BaseY4nZn3Xp1 != air) && (BaseY4nZn3X != air)
								&& (BaseY4nZn3Xn1 != air) && (BaseY4nZn3Xn2 != air)
								&& (BaseY4nZn3Xn3 != air) && (BaseY4nZn3Xn4 != air)
								&& (BaseY4nZn3Xn5 != air)

								&& (BaseY4nZn4Xp5 != air) && (BaseY4nZn4Xp4 != air)
								&& (BaseY4nZn4Xp3 != air) && (BaseY4nZn4Xp2 != air)
								&& (BaseY4nZn4Xp1 != air) && (BaseY4nZn4X != air)
								&& (BaseY4nZn4Xn1 != air) && (BaseY4nZn4Xn2 != air)
								&& (BaseY4nZn4Xn3 != air) && (BaseY4nZn4Xn4 != air)
								&& (BaseY4nZn4Xn5 != air)

								&& (BaseY4nZn5Xp5 != air) && (BaseY4nZn5Xp4 != air)
								&& (BaseY4nZn5Xp3 != air) && (BaseY4nZn5Xp2 != air)
								&& (BaseY4nZn5Xp1 != air) && (BaseY4nZn5X != air)
								&& (BaseY4nZn5Xn1 != air) && (BaseY4nZn5Xn2 != air)
								&& (BaseY4nZn5Xn3 != air) && (BaseY4nZn5Xn4 != air)
								&& (BaseY4nZn5Xn5 != air)

								&& (BaseY4nZp2Xp5 != air) && (BaseY4nZp2Xp4 != air)
								&& (BaseY4nZp2Xp3 != air) && (BaseY4nZp2Xn3 != air)
								&& (BaseY4nZp2Xn4 != air) && (BaseY4nZp2Xn5 != air)

								&& (BaseY4nZp1Xp5 != air) && (BaseY4nZp1Xp4 != air)
								&& (BaseY4nZp1Xp3 != air) && (BaseY4nZp1Xn3 != air)
								&& (BaseY4nZp1Xn4 != air) && (BaseY4nZp1Xn5 != air)

								&& (BaseY4nZXp5 != air) && (BaseY4nZXp4 != air)
								&& (BaseY4nZXp3 != air) && (BaseY4nZXn3 != air)
								&& (BaseY4nZXn4 != air) && (BaseY4nZXn5 != air)

								&& (BaseY4nZn1Xp5 != air) && (BaseY4nZn1Xp4 != air)
								&& (BaseY4nZn1Xp3 != air) && (BaseY4nZn1Xn3 != air)
								&& (BaseY4nZn1Xn4 != air) && (BaseY4nZn1Xn5 != air)

								&& (BaseY4nZn2Xp5 != air) && (BaseY4nZn2Xp4 != air)
								&& (BaseY4nZn2Xp3 != air) && (BaseY4nZn2Xn3 != air)
								&& (BaseY4nZn2Xn4 != air) && (BaseY4nZn2Xn5 != air)

								&& !(SoilY4nZp2Xp2 != Blocks.farmland)
								&& !(SoilY4nZp2Xp1 != Blocks.farmland)
								&& !(SoilY4nZp2X != Blocks.farmland)
								&& !(SoilY4nZp2Xn1 != Blocks.farmland)
								&& !(SoilY4nZp2Xn2 != Blocks.farmland)

								&& !(SoilY4nZp1Xp2 != Blocks.farmland)
								&& !(SoilY4nZp1Xp1 != Blocks.farmland)
								&& !(SoilY4nZp1X != Blocks.farmland)
								&& !(SoilY4nZp1Xn1 != Blocks.farmland)
								&& !(SoilY4nZp1Xn2 != Blocks.farmland)

								&& !(SoilY4nZXp2 != Blocks.farmland)
								&& !(SoilY4nZXp1 != Blocks.farmland)
								&& !(WaterCenter != Blocks.water)
								&& !(SoilY4nZXn1 != Blocks.farmland)
								&& !(SoilY4nZXn2 != Blocks.farmland)

								&& !(SoilY4nZn1Xp2 != Blocks.farmland)
								&& !(SoilY4nZn1Xp1 != Blocks.farmland)
								&& !(SoilY4nZn1X != Blocks.farmland)
								&& !(SoilY4nZn1Xn1 != Blocks.farmland)
								&& !(SoilY4nZn1Xn2 != Blocks.farmland)

								&& !(SoilY4nZn2Xp2 != Blocks.farmland)
								&& !(SoilY4nZn2Xp1 != Blocks.farmland)
								&& !(SoilY4nZn2X != Blocks.farmland)
								&& !(SoilY4nZn2Xn1 != Blocks.farmland)
								&& !(SoilY4nZn2Xn2 != Blocks.farmland)) {

							// Layer y-4 Stairs
							Block StairY4nZp6Xp5 = World.getBlock(X + 5, Y - 4, Z + 6);
							Block StairY4nZp6Xp4 = World.getBlock(X + 4, Y - 4, Z + 6);
							Block StairY4nZp6Xp3 = World.getBlock(X + 3, Y - 4, Z + 6);
							Block StairY4nZp6Xp2 = World.getBlock(X + 2, Y - 4, Z + 6);
							Block StairY4nZp6Xp1 = World.getBlock(X + 1, Y - 4, Z + 6);
							Block StairY4nZp6X = World.getBlock(X, Y - 4, Z + 6);
							Block StairY4nZp6Xn1 = World.getBlock(X - 1, Y - 4, Z + 6);
							Block StairY4nZp6Xn2 = World.getBlock(X - 2, Y - 4, Z + 6);
							Block StairY4nZp6Xn3 = World.getBlock(X - 3, Y - 4, Z + 6);
							Block StairY4nZp6Xn4 = World.getBlock(X - 4, Y - 4, Z + 6);
							Block StairY4nZp6Xn5 = World.getBlock(X - 5, Y - 4, Z + 6);

							Block StairY4nZn6Xp5 = World.getBlock(X + 5, Y - 4, Z - 6);
							Block StairY4nZn6Xp4 = World.getBlock(X + 4, Y - 4, Z - 6);
							Block StairY4nZn6Xp3 = World.getBlock(X + 3, Y - 4, Z - 6);
							Block StairY4nZn6Xp2 = World.getBlock(X + 2, Y - 4, Z - 6);
							Block StairY4nZn6Xp1 = World.getBlock(X + 1, Y - 4, Z - 6);
							Block StairY4nZn6X = World.getBlock(X, Y - 4, Z - 6);
							Block StairY4nZn6Xn1 = World.getBlock(X - 1, Y - 4, Z - 6);
							Block StairY4nZn6Xn2 = World.getBlock(X - 2, Y - 4, Z - 6);
							Block StairY4nZn6Xn3 = World.getBlock(X - 3, Y - 4, Z - 6);
							Block StairY4nZn6Xn4 = World.getBlock(X - 4, Y - 4, Z - 6);
							Block StairY4nZn6Xn5 = World.getBlock(X - 5, Y - 4, Z - 6);

							Block StairY4nZp5Xp6 = World.getBlock(X + 6, Y - 4, Z + 5);
							Block StairY4nZp4Xp6 = World.getBlock(X + 6, Y - 4, Z + 4);
							Block StairY4nZp3Xp6 = World.getBlock(X + 6, Y - 4, Z + 3);
							Block StairY4nZp2Xp6 = World.getBlock(X + 6, Y - 4, Z + 2);
							Block StairY4nZp1Xp6 = World.getBlock(X + 6, Y - 4, Z + 1);
							Block StairY4nZXp6 = World.getBlock(X + 6, Y - 4, Z);
							Block StairY4nZn1Xp6 = World.getBlock(X + 6, Y - 4, Z - 1);
							Block StairY4nZn2Xp6 = World.getBlock(X + 6, Y - 4, Z - 2);
							Block StairY4nZn3Xp6 = World.getBlock(X + 6, Y - 4, Z - 3);
							Block StairY4nZn4Xp6 = World.getBlock(X + 6, Y - 4, Z - 4);
							Block StairY4nZn5Xp6 = World.getBlock(X + 6, Y - 4, Z - 5);

							Block StairY4nZp5Xn6 = World.getBlock(X - 6, Y - 4, Z + 5);
							Block StairY4nZp4Xn6 = World.getBlock(X - 6, Y - 4, Z + 4);
							Block StairY4nZp3Xn6 = World.getBlock(X - 6, Y - 4, Z + 3);
							Block StairY4nZp2Xn6 = World.getBlock(X - 6, Y - 4, Z + 2);
							Block StairY4nZp1Xn6 = World.getBlock(X - 6, Y - 4, Z + 1);
							Block StairY4nZXn6 = World.getBlock(X - 6, Y - 4, Z);
							Block StairY4nZn1Xn6 = World.getBlock(X - 6, Y - 4, Z - 1);
							Block StairY4nZn2Xn6 = World.getBlock(X - 6, Y - 4, Z - 2);
							Block StairY4nZn3Xn6 = World.getBlock(X - 6, Y - 4, Z - 3);
							Block StairY4nZn4Xn6 = World.getBlock(X - 6, Y - 4, Z - 4);
							Block StairY4nZn5Xn6 = World.getBlock(X - 6, Y - 4, Z - 5);

							// Layer y-5 Stairs
							Block StairY5nZp7Xp5 = World.getBlock(X + 5, Y - 5, Z + 7);
							Block StairY5nZp7Xp4 = World.getBlock(X + 4, Y - 5, Z + 7);
							Block StairY5nZp7Xp3 = World.getBlock(X + 3, Y - 5, Z + 7);
							Block StairY5nZp7Xp2 = World.getBlock(X + 2, Y - 5, Z + 7);
							Block StairY5nZp7Xp1 = World.getBlock(X + 1, Y - 5, Z + 7);
							Block StairY5nZp7X = World.getBlock(X, Y - 5, Z + 7);
							Block StairY5nZp7Xn1 = World.getBlock(X - 1, Y - 5, Z + 7);
							Block StairY5nZp7Xn2 = World.getBlock(X - 2, Y - 5, Z + 7);
							Block StairY5nZp7Xn3 = World.getBlock(X - 3, Y - 5, Z + 7);
							Block StairY5nZp7Xn4 = World.getBlock(X - 4, Y - 5, Z + 7);
							Block StairY5nZp7Xn5 = World.getBlock(X - 5, Y - 5, Z + 7);

							Block StairY5nZn7Xp5 = World.getBlock(X + 5, Y - 5, Z - 7);
							Block StairY5nZn7Xp4 = World.getBlock(X + 4, Y - 5, Z - 7);
							Block StairY5nZn7Xp3 = World.getBlock(X + 3, Y - 5, Z - 7);
							Block StairY5nZn7Xp2 = World.getBlock(X + 2, Y - 5, Z - 7);
							Block StairY5nZn7Xp1 = World.getBlock(X + 1, Y - 5, Z - 7);
							Block StairY5nZn7X = World.getBlock(X, Y - 5, Z - 7);
							Block StairY5nZn7Xn1 = World.getBlock(X - 1, Y - 5, Z - 7);
							Block StairY5nZn7Xn2 = World.getBlock(X - 2, Y - 5, Z - 7);
							Block StairY5nZn7Xn3 = World.getBlock(X - 3, Y - 5, Z - 7);
							Block StairY5nZn7Xn4 = World.getBlock(X - 4, Y - 5, Z - 7);
							Block StairY5nZn7Xn5 = World.getBlock(X - 5, Y - 5, Z - 7);

							Block StairY5nZp5Xp7 = World.getBlock(X + 7, Y - 5, Z + 5);
							Block StairY5nZp4Xp7 = World.getBlock(X + 7, Y - 5, Z + 4);
							Block StairY5nZp3Xp7 = World.getBlock(X + 7, Y - 5, Z + 3);
							Block StairY5nZp2Xp7 = World.getBlock(X + 7, Y - 5, Z + 2);
							Block StairY5nZp1Xp7 = World.getBlock(X + 7, Y - 5, Z + 1);
							Block StairY5nZXp7 = World.getBlock(X + 7, Y - 5, Z);
							Block StairY5nZn1Xp7 = World.getBlock(X + 7, Y - 5, Z - 1);
							Block StairY5nZn2Xp7 = World.getBlock(X + 7, Y - 5, Z - 2);
							Block StairY5nZn3Xp7 = World.getBlock(X + 7, Y - 5, Z - 3);
							Block StairY5nZn4Xp7 = World.getBlock(X + 7, Y - 5, Z - 4);
							Block StairY5nZn5Xp7 = World.getBlock(X + 7, Y - 5, Z - 5);

							Block StairY5nZp5Xn7 = World.getBlock(X - 7, Y - 5, Z + 5);
							Block StairY5nZp4Xn7 = World.getBlock(X - 7, Y - 5, Z + 4);
							Block StairY5nZp3Xn7 = World.getBlock(X - 7, Y - 5, Z + 3);
							Block StairY5nZp2Xn7 = World.getBlock(X - 7, Y - 5, Z + 2);
							Block StairY5nZp1Xn7 = World.getBlock(X - 7, Y - 5, Z + 1);
							Block StairY5nZXn7 = World.getBlock(X - 7, Y - 5, Z);
							Block StairY5nZn1Xn7 = World.getBlock(X - 7, Y - 5, Z - 1);
							Block StairY5nZn2Xn7 = World.getBlock(X - 7, Y - 5, Z - 2);
							Block StairY5nZn3Xn7 = World.getBlock(X - 7, Y - 5, Z - 3);
							Block StairY5nZn4Xn7 = World.getBlock(X - 7, Y - 5, Z - 4);
							Block StairY5nZn5Xn7 = World.getBlock(X - 7, Y - 5, Z - 5);

							// Layer y-6 Stairs
							Block StairY6nZp8Xp5 = World.getBlock(X + 5, Y - 6, Z + 8);
							Block StairY6nZp8Xp4 = World.getBlock(X + 4, Y - 6, Z + 8);
							Block StairY6nZp8Xp3 = World.getBlock(X + 3, Y - 6, Z + 8);
							Block StairY6nZp8Xp2 = World.getBlock(X + 2, Y - 6, Z + 8);
							Block StairY6nZp8Xp1 = World.getBlock(X + 1, Y - 6, Z + 8);
							Block StairY6nZp8X = World.getBlock(X, Y - 6, Z + 8);
							Block StairY6nZp8Xn1 = World.getBlock(X - 1, Y - 6, Z + 8);
							Block StairY6nZp8Xn2 = World.getBlock(X - 2, Y - 6, Z + 8);
							Block StairY6nZp8Xn3 = World.getBlock(X - 3, Y - 6, Z + 8);
							Block StairY6nZp8Xn4 = World.getBlock(X - 4, Y - 6, Z + 8);
							Block StairY6nZp8Xn5 = World.getBlock(X - 5, Y - 6, Z + 8);

							Block StairY6nZn8Xp5 = World.getBlock(X + 5, Y - 6, Z - 8);
							Block StairY6nZn8Xp4 = World.getBlock(X + 4, Y - 6, Z - 8);
							Block StairY6nZn8Xp3 = World.getBlock(X + 3, Y - 6, Z - 8);
							Block StairY6nZn8Xp2 = World.getBlock(X + 2, Y - 6, Z - 8);
							Block StairY6nZn8Xp1 = World.getBlock(X + 1, Y - 6, Z - 8);
							Block StairY6nZn8X = World.getBlock(X, Y - 6, Z - 8);
							Block StairY6nZn8Xn1 = World.getBlock(X - 1, Y - 6, Z - 8);
							Block StairY6nZn8Xn2 = World.getBlock(X - 2, Y - 6, Z - 8);
							Block StairY6nZn8Xn3 = World.getBlock(X - 3, Y - 6, Z - 8);
							Block StairY6nZn8Xn4 = World.getBlock(X - 4, Y - 6, Z - 8);
							Block StairY6nZn8Xn5 = World.getBlock(X - 5, Y - 6, Z - 8);

							Block StairY6nZp5Xp8 = World.getBlock(X + 8, Y - 6, Z + 5);
							Block StairY6nZp4Xp8 = World.getBlock(X + 8, Y - 6, Z + 4);
							Block StairY6nZp3Xp8 = World.getBlock(X + 8, Y - 6, Z + 3);
							Block StairY6nZp2Xp8 = World.getBlock(X + 8, Y - 6, Z + 2);
							Block StairY6nZp1Xp8 = World.getBlock(X + 8, Y - 6, Z + 1);
							Block StairY6nZXp8 = World.getBlock(X + 8, Y - 6, Z);
							Block StairY6nZn1Xp8 = World.getBlock(X + 8, Y - 6, Z - 1);
							Block StairY6nZn2Xp8 = World.getBlock(X + 8, Y - 6, Z - 2);
							Block StairY6nZn3Xp8 = World.getBlock(X + 8, Y - 6, Z - 3);
							Block StairY6nZn4Xp8 = World.getBlock(X + 8, Y - 6, Z - 4);
							Block StairY6nZn5Xp8 = World.getBlock(X + 8, Y - 6, Z - 5);

							Block StairY6nZp5Xn8 = World.getBlock(X - 8, Y - 6, Z + 5);
							Block StairY6nZp4Xn8 = World.getBlock(X - 8, Y - 6, Z + 4);
							Block StairY6nZp3Xn8 = World.getBlock(X - 8, Y - 6, Z + 3);
							Block StairY6nZp2Xn8 = World.getBlock(X - 8, Y - 6, Z + 2);
							Block StairY6nZp1Xn8 = World.getBlock(X - 8, Y - 6, Z + 1);
							Block StairY6nZXn8 = World.getBlock(X - 8, Y - 6, Z);
							Block StairY6nZn1Xn8 = World.getBlock(X - 8, Y - 6, Z - 1);
							Block StairY6nZn2Xn8 = World.getBlock(X - 8, Y - 6, Z - 2);
							Block StairY6nZn3Xn8 = World.getBlock(X - 8, Y - 6, Z - 3);
							Block StairY6nZn4Xn8 = World.getBlock(X - 8, Y - 6, Z - 4);
							Block StairY6nZn5Xn8 = World.getBlock(X - 8, Y - 6, Z - 5);

							if ((StairY4nZp6Xp5 != air) && (StairY4nZp6Xp4 != air)
									&& (StairY4nZp6Xp3 != air) && (StairY4nZp6Xp2 != air)
									&& (StairY4nZp6Xp1 != air) && (StairY4nZp6X != air)
									&& (StairY4nZp6Xn1 != air) && (StairY4nZp6Xn2 != air)
									&& (StairY4nZp6Xn3 != air) && (StairY4nZp6Xn4 != air)
									&& (StairY4nZp6Xn5 != air)

									&& (StairY4nZn6Xp5 != air) && (StairY4nZn6Xp4 != air)
									&& (StairY4nZn6Xp3 != air) && (StairY4nZn6Xp2 != air)
									&& (StairY4nZn6Xp1 != air) && (StairY4nZn6X != air)
									&& (StairY4nZn6Xn1 != air) && (StairY4nZn6Xn2 != air)
									&& (StairY4nZn6Xn3 != air) && (StairY4nZn6Xn4 != air)
									&& (StairY4nZn6Xn5 != air)

									&& (StairY4nZp5Xp6 != air) && (StairY4nZp4Xp6 != air)
									&& (StairY4nZp3Xp6 != air) && (StairY4nZp2Xp6 != air)
									&& (StairY4nZp1Xp6 != air) && (StairY4nZXp6 != air)
									&& (StairY4nZn1Xp6 != air) && (StairY4nZn2Xp6 != air)
									&& (StairY4nZn3Xp6 != air) && (StairY4nZn4Xp6 != air)
									&& (StairY4nZn5Xp6 != air)

									&& (StairY4nZp5Xn6 != air) && (StairY4nZp4Xn6 != air)
									&& (StairY4nZp3Xn6 != air) && (StairY4nZp2Xn6 != air)
									&& (StairY4nZp1Xn6 != air) && (StairY4nZXn6 != air)
									&& (StairY4nZn1Xn6 != air) && (StairY4nZn2Xn6 != air)
									&& (StairY4nZn3Xn6 != air) && (StairY4nZn4Xn6 != air)
									&& (StairY4nZn5Xn6 != air)

									&& (StairY5nZp7Xp5 != air) && (StairY5nZp7Xp4 != air)
									&& (StairY5nZp7Xp3 != air) && (StairY5nZp7Xp2 != air)
									&& (StairY5nZp7Xp1 != air) && (StairY5nZp7X != air)
									&& (StairY5nZp7Xn1 != air) && (StairY5nZp7Xn2 != air)
									&& (StairY5nZp7Xn3 != air) && (StairY5nZp7Xn4 != air)
									&& (StairY5nZp7Xn5 != air)

									&& (StairY5nZn7Xp5 != air) && (StairY5nZn7Xp4 != air)
									&& (StairY5nZn7Xp3 != air) && (StairY5nZn7Xp2 != air)
									&& (StairY5nZn7Xp1 != air) && (StairY5nZn7X != air)
									&& (StairY5nZn7Xn1 != air) && (StairY5nZn7Xn2 != air)
									&& (StairY5nZn7Xn3 != air) && (StairY5nZn7Xn4 != air)
									&& (StairY5nZn7Xn5 != air)

									&& (StairY5nZp5Xp7 != air) && (StairY5nZp4Xp7 != air)
									&& (StairY5nZp3Xp7 != air) && (StairY5nZp2Xp7 != air)
									&& (StairY5nZp1Xp7 != air) && (StairY5nZXp7 != air)
									&& (StairY5nZn1Xp7 != air) && (StairY5nZn2Xp7 != air)
									&& (StairY5nZn3Xp7 != air) && (StairY5nZn4Xp7 != air)
									&& (StairY5nZn5Xp7 != air)

									&& (StairY5nZp5Xn7 != air) && (StairY5nZp4Xn7 != air)
									&& (StairY5nZp3Xn7 != air) && (StairY5nZp2Xn7 != air)
									&& (StairY5nZp1Xn7 != air) && (StairY5nZXn7 != air)
									&& (StairY5nZn1Xn7 != air) && (StairY5nZn2Xn7 != air)
									&& (StairY5nZn3Xn7 != air) && (StairY5nZn4Xn7 != air)
									&& (StairY5nZn5Xn7 != air)

									&& (StairY6nZp8Xp5 != air) && (StairY6nZp8Xp4 != air)
									&& (StairY6nZp8Xp3 != air) && (StairY6nZp8Xp2 != air)
									&& (StairY6nZp8Xp1 != air) && (StairY6nZp8X != air)
									&& (StairY6nZp8Xn1 != air) && (StairY6nZp8Xn2 != air)
									&& (StairY6nZp8Xn3 != air) && (StairY6nZp8Xn4 != air)
									&& (StairY6nZp8Xn5 != air)

									&& (StairY6nZn8Xp5 != air) && (StairY6nZn8Xp4 != air)
									&& (StairY6nZn8Xp3 != air) && (StairY6nZn8Xp2 != air)
									&& (StairY6nZn8Xp1 != air) && (StairY6nZn8X != air)
									&& (StairY6nZn8Xn1 != air) && (StairY6nZn8Xn2 != air)
									&& (StairY6nZn8Xn3 != air) && (StairY6nZn8Xn4 != air)
									&& (StairY6nZn8Xn5 != air)

									&& (StairY6nZp5Xp8 != air) && (StairY6nZp4Xp8 != air)
									&& (StairY6nZp3Xp8 != air) && (StairY6nZp2Xp8 != air)
									&& (StairY6nZp1Xp8 != air) && (StairY6nZXp8 != air)
									&& (StairY6nZn1Xp8 != air) && (StairY6nZn2Xp8 != air)
									&& (StairY6nZn3Xp8 != air) && (StairY6nZn4Xp8 != air)
									&& (StairY6nZn5Xp8 != air)

									&& (StairY6nZp5Xn8 != air) && (StairY6nZp4Xn8 != air)
									&& (StairY6nZp3Xn8 != air) && (StairY6nZp2Xn8 != air)
									&& (StairY6nZp1Xn8 != air) && (StairY6nZXn8 != air)
									&& (StairY6nZn1Xn8 != air) && (StairY6nZn2Xn8 != air)
									&& (StairY6nZn3Xn8 != air) && (StairY6nZn4Xn8 != air)
									&& (StairY6nZn5Xn8 != air)) {

								// Layer y-6 X+Z+ Base Pillar
								Block PBaseY6nZp6Xp6 = World.getBlock(X + 6, Y - 6, Z + 6);
								Block PBaseY6nZp6Xp7 = World.getBlock(X + 7, Y - 6, Z + 6);
								Block PBaseY6nZp6Xp8 = World.getBlock(X + 8, Y - 6, Z + 6);
								Block PBaseY6nZp7Xp6 = World.getBlock(X + 6, Y - 6, Z + 7);
								Block PBaseY6nZp7Xp8 = World.getBlock(X + 8, Y - 6, Z + 7);
								Block PBaseY6nZp8Xp6 = World.getBlock(X + 6, Y - 6, Z + 8);
								Block PBaseY6nZp8Xp7 = World.getBlock(X + 7, Y - 6, Z + 8);
								Block PBaseY6nZp8Xp8 = World.getBlock(X + 8, Y - 6, Z + 8);

								// Layer y-6 X+Z- Base Pillar
								Block PBaseY6nZn6Xp6 = World.getBlock(X + 6, Y - 6, Z - 6);
								Block PBaseY6nZn6Xp7 = World.getBlock(X + 7, Y - 6, Z - 6);
								Block PBaseY6nZn6Xp8 = World.getBlock(X + 8, Y - 6, Z - 6);
								Block PBaseY6nZn7Xp6 = World.getBlock(X + 6, Y - 6, Z - 7);
								Block PBaseY6nZn7Xp8 = World.getBlock(X + 8, Y - 6, Z - 7);
								Block PBaseY6nZn8Xp6 = World.getBlock(X + 6, Y - 6, Z - 8);
								Block PBaseY6nZn8Xp7 = World.getBlock(X + 7, Y - 6, Z - 8);
								Block PBaseY6nZn8Xp8 = World.getBlock(X + 8, Y - 6, Z - 8);

								// Layer y-6 X-Z- Base Pillar
								Block PBaseY6nZn6Xn6 = World.getBlock(X - 6, Y - 6, Z - 6);
								Block PBaseY6nZn7Xn7 = World.getBlock(X - 6, Y - 6, Z - 7);
								Block PBaseY6nZn8Xn6 = World.getBlock(X - 6, Y - 6, Z - 8);
								Block PBaseY6nZn6Xn7 = World.getBlock(X - 7, Y - 6, Z - 6);
								Block PBaseY6nZn8Xn7 = World.getBlock(X - 7, Y - 6, Z - 8);
								Block PBaseY6nZn6Xn8 = World.getBlock(X - 8, Y - 6, Z - 6);
								Block PBaseY6nZn7Xn8 = World.getBlock(X - 8, Y - 6, Z - 7);
								Block PBaseY6nZn8Xn8 = World.getBlock(X - 8, Y - 6, Z - 8);

								// Layer y-6 X-Z+ Base Pillar
								Block PBaseY6nZp6Xn6 = World.getBlock(X - 6, Y - 6, Z + 6);
								Block PBaseY6nZp7Xn7 = World.getBlock(X - 6, Y - 6, Z + 7);
								Block PBaseY6nZp8Xn6 = World.getBlock(X - 6, Y - 6, Z + 8);
								Block PBaseY6nZp6Xn7 = World.getBlock(X - 7, Y - 6, Z + 6);
								Block PBaseY6nZp8Xn7 = World.getBlock(X - 7, Y - 6, Z + 8);
								Block PBaseY6nZp6Xn8 = World.getBlock(X - 8, Y - 6, Z + 6);
								Block PBaseY6nZp7Xn8 = World.getBlock(X - 8, Y - 6, Z + 7);
								Block PBaseY6nZp8Xn8 = World.getBlock(X - 8, Y - 6, Z + 8);

								// Pillar X+Z+
								Block PillarY5nZp6Xp6 = World.getBlock(X + 6, Y - 5, Z + 6);
								Block PillarY4nZp6Xp6 = World.getBlock(X + 6, Y - 4, Z + 6);
								Block PillarY3nZp6Xp6 = World.getBlock(X + 6, Y - 3, Z + 6);
								Block PillarY2nZp6Xp6 = World.getBlock(X + 6, Y - 2, Z + 6);
								Block PillarY1nZp6Xp6 = World.getBlock(X + 6, Y - 1, Z + 6);
								Block PillarYZp6Xp6 = World.getBlock(X + 6, Y, Z + 6);
								Block PillarY1pZp6Xp6 = World.getBlock(X + 6, Y + 1, Z + 6);
								Block PillarY2pZp6Xp6 = World.getBlock(X + 6, Y + 2, Z + 6);
								Block PillarY3pZp6Xp6 = World.getBlock(X + 6, Y + 3, Z + 6);
								Block PillarY4pZp6Xp6 = World.getBlock(X + 6, Y + 4, Z + 6);

								Block PillarY5nZp6Xp8 = World.getBlock(X + 8, Y - 5, Z + 6);
								Block PillarY4nZp6Xp8 = World.getBlock(X + 8, Y - 4, Z + 6);
								Block PillarY3nZp6Xp8 = World.getBlock(X + 8, Y - 3, Z + 6);
								Block PillarY2nZp6Xp8 = World.getBlock(X + 8, Y - 2, Z + 6);
								Block PillarY1nZp6Xp8 = World.getBlock(X + 8, Y - 1, Z + 6);
								Block PillarYZp6Xp8 = World.getBlock(X + 8, Y, Z + 6);
								Block PillarY1pZp6Xp8 = World.getBlock(X + 8, Y + 1, Z + 6);
								Block PillarY2pZp6Xp8 = World.getBlock(X + 8, Y + 2, Z + 6);
								Block PillarY3pZp6Xp8 = World.getBlock(X + 8, Y + 3, Z + 6);
								Block PillarY4pZp6Xp8 = World.getBlock(X + 8, Y + 4, Z + 6);

								Block PillarY5nZp8Xp6 = World.getBlock(X + 6, Y - 5, Z + 8);
								Block PillarY4nZp8Xp6 = World.getBlock(X + 6, Y - 4, Z + 8);
								Block PillarY3nZp8Xp6 = World.getBlock(X + 6, Y - 3, Z + 8);
								Block PillarY2nZp8Xp6 = World.getBlock(X + 6, Y - 2, Z + 8);
								Block PillarY1nZp8Xp6 = World.getBlock(X + 6, Y - 1, Z + 8);
								Block PillarYZp8Xp6 = World.getBlock(X + 6, Y, Z + 8);
								Block PillarY1pZp8Xp6 = World.getBlock(X + 6, Y + 1, Z + 8);
								Block PillarY2pZp8Xp6 = World.getBlock(X + 6, Y + 2, Z + 8);
								Block PillarY3pZp8Xp6 = World.getBlock(X + 6, Y + 3, Z + 8);
								Block PillarY4pZp8Xp6 = World.getBlock(X + 6, Y + 4, Z + 8);

								Block PillarY5nZp8Xp8 = World.getBlock(X + 8, Y - 5, Z + 8);
								Block PillarY4nZp8Xp8 = World.getBlock(X + 8, Y - 4, Z + 8);
								Block PillarY3nZp8Xp8 = World.getBlock(X + 8, Y - 3, Z + 8);
								Block PillarY2nZp8Xp8 = World.getBlock(X + 8, Y - 2, Z + 8);
								Block PillarY1nZp8Xp8 = World.getBlock(X + 8, Y - 1, Z + 8);
								Block PillarYZp8Xp8 = World.getBlock(X + 8, Y, Z + 8);
								Block PillarY1pZp8Xp8 = World.getBlock(X + 8, Y + 1, Z + 8);
								Block PillarY2pZp8Xp8 = World.getBlock(X + 8, Y + 2, Z + 8);
								Block PillarY3pZp8Xp8 = World.getBlock(X + 8, Y + 3, Z + 8);
								Block PillarY4pZp8Xp8 = World.getBlock(X + 8, Y + 4, Z + 8);

								// Pillar X+Z-
								Block PillarY5nZn6Xp6 = World.getBlock(X + 6, Y - 5, Z - 6);
								Block PillarY4nZn6Xp6 = World.getBlock(X + 6, Y - 4, Z - 6);
								Block PillarY3nZn6Xp6 = World.getBlock(X + 6, Y - 3, Z - 6);
								Block PillarY2nZn6Xp6 = World.getBlock(X + 6, Y - 2, Z - 6);
								Block PillarY1nZn6Xp6 = World.getBlock(X + 6, Y - 1, Z - 6);
								Block PillarYZn6Xp6 = World.getBlock(X + 6, Y, Z - 6);
								Block PillarY1pZn6Xp6 = World.getBlock(X + 6, Y + 1, Z - 6);
								Block PillarY2pZn6Xp6 = World.getBlock(X + 6, Y + 2, Z - 6);
								Block PillarY3pZn6Xp6 = World.getBlock(X + 6, Y + 3, Z - 6);
								Block PillarY4pZn6Xp6 = World.getBlock(X + 6, Y + 4, Z - 6);

								Block PillarY5nZn6Xp8 = World.getBlock(X + 8, Y - 5, Z - 6);
								Block PillarY4nZn6Xp8 = World.getBlock(X + 8, Y - 4, Z - 6);
								Block PillarY3nZn6Xp8 = World.getBlock(X + 8, Y - 3, Z - 6);
								Block PillarY2nZn6Xp8 = World.getBlock(X + 8, Y - 2, Z - 6);
								Block PillarY1nZn6Xp8 = World.getBlock(X + 8, Y - 1, Z - 6);
								Block PillarYZn6Xp8 = World.getBlock(X + 8, Y, Z - 6);
								Block PillarY1pZn6Xp8 = World.getBlock(X + 8, Y + 1, Z - 6);
								Block PillarY2pZn6Xp8 = World.getBlock(X + 8, Y + 2, Z - 6);
								Block PillarY3pZn6Xp8 = World.getBlock(X + 8, Y + 3, Z - 6);
								Block PillarY4pZn6Xp8 = World.getBlock(X + 8, Y + 4, Z - 6);

								Block PillarY5nZn8Xp6 = World.getBlock(X + 6, Y - 5, Z - 8);
								Block PillarY4nZn8Xp6 = World.getBlock(X + 6, Y - 4, Z - 8);
								Block PillarY3nZn8Xp6 = World.getBlock(X + 6, Y - 3, Z - 8);
								Block PillarY2nZn8Xp6 = World.getBlock(X + 6, Y - 2, Z - 8);
								Block PillarY1nZn8Xp6 = World.getBlock(X + 6, Y - 1, Z - 8);
								Block PillarYZn8Xp6 = World.getBlock(X + 6, Y, Z - 8);
								Block PillarY1pZn8Xp6 = World.getBlock(X + 6, Y + 1, Z - 8);
								Block PillarY2pZn8Xp6 = World.getBlock(X + 6, Y + 2, Z - 8);
								Block PillarY3pZn8Xp6 = World.getBlock(X + 6, Y + 3, Z - 8);
								Block PillarY4pZn8Xp6 = World.getBlock(X + 6, Y + 4, Z - 8);

								Block PillarY5nZn8Xp8 = World.getBlock(X + 8, Y - 5, Z - 8);
								Block PillarY4nZn8Xp8 = World.getBlock(X + 8, Y - 4, Z - 8);
								Block PillarY3nZn8Xp8 = World.getBlock(X + 8, Y - 3, Z - 8);
								Block PillarY2nZn8Xp8 = World.getBlock(X + 8, Y - 2, Z - 8);
								Block PillarY1nZn8Xp8 = World.getBlock(X + 8, Y - 1, Z - 8);
								Block PillarYZn8Xp8 = World.getBlock(X + 8, Y, Z - 8);
								Block PillarY1pZn8Xp8 = World.getBlock(X + 8, Y + 1, Z - 8);
								Block PillarY2pZn8Xp8 = World.getBlock(X + 8, Y + 2, Z - 8);
								Block PillarY3pZn8Xp8 = World.getBlock(X + 8, Y + 3, Z - 8);
								Block PillarY4pZn8Xp8 = World.getBlock(X + 8, Y + 4, Z - 8);

								// Pillar X-Z-
								Block PillarY5nZn6Xn6 = World.getBlock(X - 6, Y - 5, Z - 6);
								Block PillarY4nZn6Xn6 = World.getBlock(X - 6, Y - 4, Z - 6);
								Block PillarY3nZn6Xn6 = World.getBlock(X - 6, Y - 3, Z - 6);
								Block PillarY2nZn6Xn6 = World.getBlock(X - 6, Y - 2, Z - 6);
								Block PillarY1nZn6Xn6 = World.getBlock(X - 6, Y - 1, Z - 6);
								Block PillarYZn6Xn6 = World.getBlock(X - 6, Y, Z - 6);
								Block PillarY1pZn6Xn6 = World.getBlock(X - 6, Y + 1, Z - 6);
								Block PillarY2pZn6Xn6 = World.getBlock(X - 6, Y + 2, Z - 6);
								Block PillarY3pZn6Xn6 = World.getBlock(X - 6, Y + 3, Z - 6);
								Block PillarY4pZn6Xn6 = World.getBlock(X - 6, Y + 4, Z - 6);

								Block PillarY5nZn6Xn8 = World.getBlock(X - 8, Y - 5, Z - 6);
								Block PillarY4nZn6Xn8 = World.getBlock(X - 8, Y - 4, Z - 6);
								Block PillarY3nZn6Xn8 = World.getBlock(X - 8, Y - 3, Z - 6);
								Block PillarY2nZn6Xn8 = World.getBlock(X - 8, Y - 2, Z - 6);
								Block PillarY1nZn6Xn8 = World.getBlock(X - 8, Y - 1, Z - 6);
								Block PillarYZn6Xn8 = World.getBlock(X - 8, Y, Z - 6);
								Block PillarY1pZn6Xn8 = World.getBlock(X - 8, Y + 1, Z - 6);
								Block PillarY2pZn6Xn8 = World.getBlock(X - 8, Y + 2, Z - 6);
								Block PillarY3pZn6Xn8 = World.getBlock(X - 8, Y + 3, Z - 6);
								Block PillarY4pZn6Xn8 = World.getBlock(X - 8, Y + 4, Z - 6);

								Block PillarY5nZn8Xn6 = World.getBlock(X - 6, Y - 5, Z - 8);
								Block PillarY4nZn8Xn6 = World.getBlock(X - 6, Y - 4, Z - 8);
								Block PillarY3nZn8Xn6 = World.getBlock(X - 6, Y - 3, Z - 8);
								Block PillarY2nZn8Xn6 = World.getBlock(X - 6, Y - 2, Z - 8);
								Block PillarY1nZn8Xn6 = World.getBlock(X - 6, Y - 1, Z - 8);
								Block PillarYZn8Xn6 = World.getBlock(X - 6, Y, Z - 8);
								Block PillarY1pZn8Xn6 = World.getBlock(X - 6, Y + 1, Z - 8);
								Block PillarY2pZn8Xn6 = World.getBlock(X - 6, Y + 2, Z - 8);
								Block PillarY3pZn8Xn6 = World.getBlock(X - 6, Y + 3, Z - 8);
								Block PillarY4pZn8Xn6 = World.getBlock(X - 6, Y + 4, Z - 8);

								Block PillarY5nZn8Xn8 = World.getBlock(X - 8, Y - 5, Z - 8);
								Block PillarY4nZn8Xn8 = World.getBlock(X - 8, Y - 4, Z - 8);
								Block PillarY3nZn8Xn8 = World.getBlock(X - 8, Y - 3, Z - 8);
								Block PillarY2nZn8Xn8 = World.getBlock(X - 8, Y - 2, Z - 8);
								Block PillarY1nZn8Xn8 = World.getBlock(X - 8, Y - 1, Z - 8);
								Block PillarYZn8Xn8 = World.getBlock(X - 8, Y, Z - 8);
								Block PillarY1pZn8Xn8 = World.getBlock(X - 8, Y + 1, Z - 8);
								Block PillarY2pZn8Xn8 = World.getBlock(X - 8, Y + 2, Z - 8);
								Block PillarY3pZn8Xn8 = World.getBlock(X - 8, Y + 3, Z - 8);
								Block PillarY4pZn8Xn8 = World.getBlock(X - 8, Y + 4, Z - 8);

								// Pillar X-Z+
								Block PillarY5nZp6Xn6 = World.getBlock(X - 6, Y - 5, Z + 6);
								Block PillarY4nZp6Xn6 = World.getBlock(X - 6, Y - 4, Z + 6);
								Block PillarY3nZp6Xn6 = World.getBlock(X - 6, Y - 3, Z + 6);
								Block PillarY2nZp6Xn6 = World.getBlock(X - 6, Y - 2, Z + 6);
								Block PillarY1nZ6Xn6 = World.getBlock(X - 6, Y - 1, Z + 6);
								Block PillarYZp6Xn6 = World.getBlock(X - 6, Y, Z + 6);
								Block PillarY1pZp6Xn6 = World.getBlock(X - 6, Y + 1, Z + 6);
								Block PillarY2pZp6Xn6 = World.getBlock(X - 6, Y + 2, Z + 6);
								Block PillarY3pZp6Xn6 = World.getBlock(X - 6, Y + 3, Z + 6);
								Block PillarY4pZp6Xn6 = World.getBlock(X - 6, Y + 4, Z + 6);

								Block PillarY5nZp6Xn8 = World.getBlock(X - 8, Y - 5, Z + 6);
								Block PillarY4nZp6Xn8 = World.getBlock(X - 8, Y - 4, Z + 6);
								Block PillarY3nZp6Xn8 = World.getBlock(X - 8, Y - 3, Z + 6);
								Block PillarY2nZp6Xn8 = World.getBlock(X - 8, Y - 2, Z + 6);
								Block PillarY1nZp6Xn8 = World.getBlock(X - 8, Y - 1, Z + 6);
								Block PillarYZp6Xn8 = World.getBlock(X - 8, Y, Z + 6);
								Block PillarY1pZp6Xn8 = World.getBlock(X - 8, Y + 1, Z + 6);
								Block PillarY2pZp6Xn8 = World.getBlock(X - 8, Y + 2, Z + 6);
								Block PillarY3pZp6Xn8 = World.getBlock(X - 8, Y + 3, Z + 6);
								Block PillarY4pZp6Xn8 = World.getBlock(X - 8, Y + 4, Z + 6);

								Block PillarY5nZp8Xn6 = World.getBlock(X - 6, Y - 5, Z + 8);
								Block PillarY4nZp8Xn6 = World.getBlock(X - 6, Y - 4, Z + 8);
								Block PillarY3nZp8Xn6 = World.getBlock(X - 6, Y - 3, Z + 8);
								Block PillarY2nZp8Xn6 = World.getBlock(X - 6, Y - 2, Z + 8);
								Block PillarY1nZp8Xn6 = World.getBlock(X - 6, Y - 1, Z + 8);
								Block PillarYZp8Xn6 = World.getBlock(X - 6, Y, Z + 8);
								Block PillarY1pZp8Xn6 = World.getBlock(X - 6, Y + 1, Z + 8);
								Block PillarY2pZp8Xn6 = World.getBlock(X - 6, Y + 2, Z + 8);
								Block PillarY3pZp8Xn6 = World.getBlock(X - 6, Y + 3, Z + 8);
								Block PillarY4pZp8Xn6 = World.getBlock(X - 6, Y + 4, Z + 8);

								Block PillarY5nZp8Xn8 = World.getBlock(X - 8, Y - 5, Z + 8);
								Block PillarY4nZp8Xn8 = World.getBlock(X - 8, Y - 4, Z + 8);
								Block PillarY3nZp8Xn8 = World.getBlock(X - 8, Y - 3, Z + 8);
								Block PillarY2nZp8Xn8 = World.getBlock(X - 8, Y - 2, Z + 8);
								Block PillarY1nZp8Xn8 = World.getBlock(X - 8, Y - 1, Z + 8);
								Block PillarYZp8Xn8 = World.getBlock(X - 8, Y, Z + 8);
								Block PillarY1pZp8Xn8 = World.getBlock(X - 8, Y + 1, Z + 8);
								Block PillarY2pZp8Xn8 = World.getBlock(X - 8, Y + 2, Z + 8);
								Block PillarY3pZp8Xn8 = World.getBlock(X - 8, Y + 3, Z + 8);
								Block PillarY4pZp8Xn8 = World.getBlock(X - 8, Y + 4, Z + 8);

								if ((PBaseY6nZp6Xp6 != air) && (PBaseY6nZp6Xp7 != air)
										&& (PBaseY6nZp6Xp8 != air) && (PBaseY6nZp7Xp6 != air)
										&& (PBaseY6nZp7Xp8 != air) && (PBaseY6nZp8Xp6 != air)
										&& (PBaseY6nZp8Xp7 != air) && (PBaseY6nZp8Xp8 != air)

										&& (PBaseY6nZn6Xp6 != air) && (PBaseY6nZn6Xp7 != air)
										&& (PBaseY6nZn6Xp8 != air) && (PBaseY6nZn7Xp6 != air)
										&& (PBaseY6nZn7Xp8 != air) && (PBaseY6nZn8Xp6 != air)
										&& (PBaseY6nZn8Xp7 != air) && (PBaseY6nZn8Xp8 != air)

										&& (PBaseY6nZn6Xn6 != air) && (PBaseY6nZn7Xn7 != air)
										&& (PBaseY6nZn8Xn6 != air) && (PBaseY6nZn6Xn7 != air)
										&& (PBaseY6nZn8Xn7 != air) && (PBaseY6nZn6Xn8 != air)
										&& (PBaseY6nZn7Xn8 != air) && (PBaseY6nZn8Xn8 != air)

										&& (PBaseY6nZp6Xn6 != air) && (PBaseY6nZp7Xn7 != air)
										&& (PBaseY6nZp8Xn6 != air) && (PBaseY6nZp6Xn7 != air)
										&& (PBaseY6nZp8Xn7 != air) && (PBaseY6nZp6Xn8 != air)
										&& (PBaseY6nZp7Xn8 != air) && (PBaseY6nZp8Xn8 != air)

										&& (PillarY5nZp6Xp6 != air) && (PillarY4nZp6Xp6 != air)
										&& (PillarY3nZp6Xp6 != air) && (PillarY2nZp6Xp6 != air)
										&& (PillarY1nZp6Xp6 != air) && (PillarYZp6Xp6 != air)
										&& (PillarY1pZp6Xp6 != air) && (PillarY2pZp6Xp6 != air)
										&& (PillarY3pZp6Xp6 != air) && (PillarY4pZp6Xp6 != air)

										&& (PillarY5nZp6Xp8 != air) && (PillarY4nZp6Xp8 != air)
										&& (PillarY3nZp6Xp8 != air) && (PillarY2nZp6Xp8 != air)
										&& (PillarY1nZp6Xp8 != air) && (PillarYZp6Xp8 != air)
										&& (PillarY1pZp6Xp8 != air) && (PillarY2pZp6Xp8 != air)
										&& (PillarY3pZp6Xp8 != air) && (PillarY4pZp6Xp8 != air)

										&& (PillarY5nZp8Xp6 != air) && (PillarY4nZp8Xp6 != air)
										&& (PillarY3nZp8Xp6 != air) && (PillarY2nZp8Xp6 != air)
										&& (PillarY1nZp8Xp6 != air) && (PillarYZp8Xp6 != air)
										&& (PillarY1pZp8Xp6 != air) && (PillarY2pZp8Xp6 != air)
										&& (PillarY3pZp8Xp6 != air) && (PillarY4pZp8Xp6 != air)

										&& (PillarY5nZp8Xp8 != air) && (PillarY4nZp8Xp8 != air)
										&& (PillarY3nZp8Xp8 != air) && (PillarY2nZp8Xp8 != air)
										&& (PillarY1nZp8Xp8 != air) && (PillarYZp8Xp8 != air)
										&& (PillarY1pZp8Xp8 != air) && (PillarY2pZp8Xp8 != air)
										&& (PillarY3pZp8Xp8 != air) && (PillarY4pZp8Xp8 != air)

										&& (PillarY5nZn6Xp6 != air) && (PillarY4nZn6Xp6 != air)
										&& (PillarY3nZn6Xp6 != air) && (PillarY2nZn6Xp6 != air)
										&& (PillarY1nZn6Xp6 != air) && (PillarYZn6Xp6 != air)
										&& (PillarY1pZn6Xp6 != air) && (PillarY2pZn6Xp6 != air)
										&& (PillarY3pZn6Xp6 != air) && (PillarY4pZn6Xp6 != air)

										&& (PillarY5nZn6Xp8 != air) && (PillarY4nZn6Xp8 != air)
										&& (PillarY3nZn6Xp8 != air) && (PillarY2nZn6Xp8 != air)
										&& (PillarY1nZn6Xp8 != air) && (PillarYZn6Xp8 != air)
										&& (PillarY1pZn6Xp8 != air) && (PillarY2pZn6Xp8 != air)
										&& (PillarY3pZn6Xp8 != air) && (PillarY4pZn6Xp8 != air)

										&& (PillarY5nZn8Xp6 != air) && (PillarY4nZn8Xp6 != air)
										&& (PillarY3nZn8Xp6 != air) && (PillarY2nZn8Xp6 != air)
										&& (PillarY1nZn8Xp6 != air) && (PillarYZn8Xp6 != air)
										&& (PillarY1pZn8Xp6 != air) && (PillarY2pZn8Xp6 != air)
										&& (PillarY3pZn8Xp6 != air) && (PillarY4pZn8Xp6 != air)

										&& (PillarY5nZn8Xp8 != air) && (PillarY4nZn8Xp8 != air)
										&& (PillarY3nZn8Xp8 != air) && (PillarY2nZn8Xp8 != air)
										&& (PillarY1nZn8Xp8 != air) && (PillarYZn8Xp8 != air)
										&& (PillarY1pZn8Xp8 != air) && (PillarY2pZn8Xp8 != air)
										&& (PillarY3pZn8Xp8 != air) && (PillarY4pZn8Xp8 != air)

										&& (PillarY5nZn6Xn6 != air) && (PillarY4nZn6Xn6 != air)
										&& (PillarY3nZn6Xn6 != air) && (PillarY2nZn6Xn6 != air)
										&& (PillarY1nZn6Xn6 != air) && (PillarYZn6Xn6 != air)
										&& (PillarY1pZn6Xn6 != air) && (PillarY2pZn6Xn6 != air)
										&& (PillarY3pZn6Xn6 != air) && (PillarY4pZn6Xn6 != air)

										&& (PillarY5nZn6Xn8 != air) && (PillarY4nZn6Xn8 != air)
										&& (PillarY3nZn6Xn8 != air) && (PillarY2nZn6Xn8 != air)
										&& (PillarY1nZn6Xn8 != air) && (PillarYZn6Xn8 != air)
										&& (PillarY1pZn6Xn8 != air) && (PillarY2pZn6Xn8 != air)
										&& (PillarY3pZn6Xn8 != air) && (PillarY4pZn6Xn8 != air)

										&& (PillarY5nZn8Xn6 != air) && (PillarY4nZn8Xn6 != air)
										&& (PillarY3nZn8Xn6 != air) && (PillarY2nZn8Xn6 != air)
										&& (PillarY1nZn8Xn6 != air) && (PillarYZn8Xn6 != air)
										&& (PillarY1pZn8Xn6 != air) && (PillarY2pZn8Xn6 != air)
										&& (PillarY3pZn8Xn6 != air) && (PillarY4pZn8Xn6 != air)

										&& (PillarY5nZn8Xn8 != air) && (PillarY4nZn8Xn8 != air)
										&& (PillarY3nZn8Xn8 != air) && (PillarY2nZn8Xn8 != air)
										&& (PillarY1nZn8Xn8 != air) && (PillarYZn8Xn8 != air)
										&& (PillarY1pZn8Xn8 != air) && (PillarY2pZn8Xn8 != air)
										&& (PillarY3pZn8Xn8 != air) && (PillarY4pZn8Xn8 != air)

										&& (PillarY5nZp6Xn6 != air) && (PillarY4nZp6Xn6 != air)
										&& (PillarY3nZp6Xn6 != air) && (PillarY2nZp6Xn6 != air)
										&& (PillarY1nZ6Xn6 != air) && (PillarYZp6Xn6 != air)
										&& (PillarY1pZp6Xn6 != air) && (PillarY2pZp6Xn6 != air)
										&& (PillarY3pZp6Xn6 != air) && (PillarY4pZp6Xn6 != air)

										&& (PillarY5nZp6Xn8 != air) && (PillarY4nZp6Xn8 != air)
										&& (PillarY3nZp6Xn8 != air) && (PillarY2nZp6Xn8 != air)
										&& (PillarY1nZp6Xn8 != air) && (PillarYZp6Xn8 != air)
										&& (PillarY1pZp6Xn8 != air) && (PillarY2pZp6Xn8 != air)
										&& (PillarY3pZp6Xn8 != air) && (PillarY4pZp6Xn8 != air)

										&& (PillarY5nZp8Xn6 != air) && (PillarY4nZp8Xn6 != air)
										&& (PillarY3nZp8Xn6 != air) && (PillarY2nZp8Xn6 != air)
										&& (PillarY1nZp8Xn6 != air) && (PillarYZp8Xn6 != air)
										&& (PillarY1pZp8Xn6 != air) && (PillarY2pZp8Xn6 != air)
										&& (PillarY3pZp8Xn6 != air) && (PillarY4pZp8Xn6 != air)

										&& (PillarY5nZp8Xn8 != air) && (PillarY4nZp8Xn8 != air)
										&& (PillarY3nZp8Xn8 != air) && (PillarY2nZp8Xn8 != air)
										&& (PillarY1nZp8Xn8 != air) && (PillarYZp8Xn8 != air)
										&& (PillarY1pZp8Xn8 != air) && (PillarY2pZp8Xn8 != air)
										&& (PillarY3pZp8Xn8 != air) && (PillarY4pZp8Xn8 != air)) {

									// Layer y+5 X+Z+ Top Pillar
									Block pTopY5pZp6Xp6 = World.getBlock(X + 6, Y + 5, Z + 6);
									Block pTopY5pZp6Xp7 = World.getBlock(X + 7, Y + 5, Z + 6);
									Block pTopY5pZp6Xp8 = World.getBlock(X + 8, Y + 5, Z + 6);
									Block pTopY5pZp7Xp6 = World.getBlock(X + 6, Y + 5, Z + 7);
									Block pTopY5pZp7Xp8 = World.getBlock(X + 8, Y + 5, Z + 7);
									Block pTopY5pZp8Xp6 = World.getBlock(X + 6, Y + 5, Z + 8);
									Block pTopY5pZp8Xp7 = World.getBlock(X + 7, Y + 5, Z + 8);
									Block pTopY5pZp8Xp8 = World.getBlock(X + 8, Y + 5, Z + 8);

									// Layer y+5 X+Z- Top Pillar
									Block pTopY5pZn6Xp6 = World.getBlock(X + 6, Y + 5, Z - 6);
									Block pTopY5pZn6Xp7 = World.getBlock(X + 7, Y + 5, Z - 6);
									Block pTopY5pZn6Xp8 = World.getBlock(X + 8, Y + 5, Z - 6);
									Block pTopY5pZn7Xp6 = World.getBlock(X + 6, Y + 5, Z - 7);
									Block pTopY5pZn7Xp8 = World.getBlock(X + 8, Y + 5, Z - 7);
									Block pTopY5pZn8Xp6 = World.getBlock(X + 6, Y + 5, Z - 8);
									Block pTopY5pZn8Xp7 = World.getBlock(X + 7, Y + 5, Z - 8);
									Block pTopY5pZn8Xp8 = World.getBlock(X + 8, Y + 5, Z - 8);

									// Layer y+5 X-Z- Top Pillar
									Block pTopY5pZn6Xn6 = World.getBlock(X - 6, Y + 5, Z - 6);
									Block pTopY5pZn7Xn7 = World.getBlock(X - 6, Y + 5, Z - 7);
									Block pTopY5pZn8Xn6 = World.getBlock(X - 6, Y + 5, Z - 8);
									Block pTopY5pZn6Xn7 = World.getBlock(X - 7, Y + 5, Z - 6);
									Block pTopY5pZn8Xn7 = World.getBlock(X - 7, Y + 5, Z - 8);
									Block pTopY5pZn6Xn8 = World.getBlock(X - 8, Y + 5, Z - 6);
									Block pTopY5pZn7Xn8 = World.getBlock(X - 8, Y + 5, Z - 7);
									Block pTopY5pZn8Xn8 = World.getBlock(X - 8, Y + 5, Z - 8);

									// Layer y+5 X-Z+ Top Pillar
									Block pTopY5pZp6Xn6 = World.getBlock(X - 6, Y + 5, Z + 6);
									Block pTopY5pZp7Xn7 = World.getBlock(X - 6, Y + 5, Z + 7);
									Block pTopY5pZp8Xn6 = World.getBlock(X - 6, Y + 5, Z + 8);
									Block pTopY5pZp6Xn7 = World.getBlock(X - 7, Y + 5, Z + 6);
									Block pTopY5pZp8Xn7 = World.getBlock(X - 7, Y + 5, Z + 8);
									Block pTopY5pZp6Xn8 = World.getBlock(X - 8, Y + 5, Z + 6);
									Block pTopY5pZp7Xn8 = World.getBlock(X - 8, Y + 5, Z + 7);
									Block pTopY5pZp8Xn8 = World.getBlock(X - 8, Y + 5, Z + 8);

									// Layer y+5 Top Water
									Block pTopWaterY5pZp7Xp7 = World.getBlock(X + 7, Y + 5, Z + 7);
									Block pTopWaterY5pZp7Xn7 = World.getBlock(X - 7, Y + 5, Z + 7);
									Block pTopWaterY5pZn7Xn7 = World.getBlock(X - 7, Y + 5, Z - 7);
									Block pTopWaterY5pZn7Xp7 = World.getBlock(X + 7, Y + 5, Z - 7);

									// Layer y+5-7 Top Pillar
									Block pTopY5pZp7Xp5 = World.getBlock(X + 5, Y + 5, Z + 7);
									Block pTopY6pZp7Xp5 = World.getBlock(X + 5, Y + 6, Z + 7);
									Block pTopY7pZp7Xp5 = World.getBlock(X + 5, Y + 7, Z + 7);
									Block pTopY5pZp7Xp9 = World.getBlock(X + 9, Y + 5, Z + 7);
									Block pTopY6pZp7Xp9 = World.getBlock(X + 9, Y + 6, Z + 7);
									Block pTopY7pZp7Xp9 = World.getBlock(X + 9, Y + 7, Z + 7);
									Block pTopY5pZp7Xn5 = World.getBlock(X - 5, Y + 5, Z + 7);
									Block pTopY6pZp7Xn5 = World.getBlock(X - 5, Y + 6, Z + 7);
									Block pTopY7pZp7Xn5 = World.getBlock(X - 5, Y + 7, Z + 7);
									Block pTopY5pZp7Xn9 = World.getBlock(X - 9, Y + 5, Z + 7);
									Block pTopY6pZp7Xn9 = World.getBlock(X - 9, Y + 6, Z + 7);
									Block pTopY7pZp7Xn9 = World.getBlock(X - 9, Y + 7, Z + 7);

									Block pTopY5pZn7Xp5 = World.getBlock(X + 5, Y + 5, Z - 7);
									Block pTopY6pZn7Xp5 = World.getBlock(X + 5, Y + 6, Z - 7);
									Block pTopY7pZn7Xp5 = World.getBlock(X + 5, Y + 7, Z - 7);
									Block pTopY5pZn7Xp9 = World.getBlock(X + 9, Y + 5, Z - 7);
									Block pTopY6pZn7Xp9 = World.getBlock(X + 9, Y + 6, Z - 7);
									Block pTopY7pZn7Xp9 = World.getBlock(X + 9, Y + 7, Z - 7);
									Block pTopY5pZn7Xn5 = World.getBlock(X - 5, Y + 5, Z - 7);
									Block pTopY6pZn7Xn5 = World.getBlock(X - 5, Y + 6, Z - 7);
									Block pTopY7pZn7Xn5 = World.getBlock(X - 5, Y + 7, Z - 7);
									Block pTopY5pZn7Xn9 = World.getBlock(X - 9, Y + 5, Z - 7);
									Block pTopY6pZn7Xn9 = World.getBlock(X - 9, Y + 6, Z - 7);
									Block pTopY7pZn7Xn9 = World.getBlock(X - 9, Y + 7, Z - 7);

									Block pTopY5pZp5Xp7 = World.getBlock(X + 7, Y + 5, Z + 5);
									Block pTopY6pZp5Xp7 = World.getBlock(X + 7, Y + 6, Z + 5);
									Block pTopY7pZp5Xp7 = World.getBlock(X + 7, Y + 7, Z + 5);
									Block pTopY5pZp9Xp7 = World.getBlock(X + 7, Y + 5, Z + 9);
									Block pTopY6pZp9Xp7 = World.getBlock(X + 7, Y + 6, Z + 9);
									Block pTopY7pZp9Xp7 = World.getBlock(X + 7, Y + 7, Z + 9);
									Block pTopY5pZn5Xp7 = World.getBlock(X + 7, Y + 5, Z - 5);
									Block pTopY6pZn5Xp7 = World.getBlock(X + 7, Y + 6, Z - 5);
									Block pTopY7pZn5Xp7 = World.getBlock(X + 7, Y + 7, Z - 5);
									Block pTopY5pZn9Xp7 = World.getBlock(X + 7, Y + 5, Z - 9);
									Block pTopY6pZn9Xp7 = World.getBlock(X + 7, Y + 6, Z - 9);
									Block pTopY7pZn9Xp7 = World.getBlock(X + 7, Y + 7, Z - 9);

									Block pTopY5pZp5Xn7 = World.getBlock(X - 7, Y + 5, Z + 5);
									Block pTopY6pZp5Xn7 = World.getBlock(X - 7, Y + 6, Z + 5);
									Block pTopY7pZp5Xn7 = World.getBlock(X - 7, Y + 7, Z + 5);
									Block pTopY5pZp9Xn7 = World.getBlock(X - 7, Y + 5, Z + 9);
									Block pTopY6pZp9Xn7 = World.getBlock(X - 7, Y + 6, Z + 9);
									Block pTopY7pZp9Xn7 = World.getBlock(X - 7, Y + 7, Z + 9);
									Block pTopY5pZn5Xn7 = World.getBlock(X - 7, Y + 5, Z - 5);
									Block pTopY6pZn5Xn7 = World.getBlock(X - 7, Y + 6, Z - 5);
									Block pTopY7pZn5Xn7 = World.getBlock(X - 7, Y + 7, Z - 5);
									Block pTopY5pZn9Xn7 = World.getBlock(X - 7, Y + 5, Z - 9);
									Block pTopY6pZn9Xn7 = World.getBlock(X - 7, Y + 6, Z - 9);
									Block pTopY7pZn9Xn7 = World.getBlock(X - 7, Y + 7, Z - 9);

									// Pillar Top Filller
									Block PillarY6pZp6Xp6 = World.getBlock(X + 6, Y + 6, Z + 6);
									Block PillarY6pZp6Xp8 = World.getBlock(X + 8, Y + 6, Z + 6);
									Block PillarY6pZp6Xn6 = World.getBlock(X - 6, Y + 6, Z + 6);
									Block PillarY6pZp6Xn8 = World.getBlock(X - 8, Y + 6, Z + 6);
									Block PillarY6pZn6Xp6 = World.getBlock(X + 6, Y + 6, Z - 6);
									Block PillarY6pZn6Xp8 = World.getBlock(X + 8, Y + 6, Z - 6);
									Block PillarY6pZn6Xn6 = World.getBlock(X - 6, Y + 6, Z - 6);
									Block PillarY6pZn6Xn8 = World.getBlock(X - 8, Y + 6, Z - 6);
									Block PillarY6pZp8Xp6 = World.getBlock(X + 6, Y + 6, Z + 8);
									Block PillarY6pZp8Xp8 = World.getBlock(X + 8, Y + 6, Z + 8);
									Block PillarY6pZp8Xn6 = World.getBlock(X - 6, Y + 6, Z + 8);
									Block PillarY6pZp8Xn8 = World.getBlock(X - 8, Y + 6, Z + 8);
									Block PillarY6pZn8Xp6 = World.getBlock(X + 6, Y + 6, Z - 8);
									Block PillarY6pZn8Xp8 = World.getBlock(X + 8, Y + 6, Z - 8);
									Block PillarY6pZn8Xn6 = World.getBlock(X - 6, Y + 6, Z - 8);
									Block PillarY6pZn8Xn8 = World.getBlock(X - 8, Y + 6, Z - 8);

									Block PillarY7pZp6Xp6 = World.getBlock(X + 6, Y + 7, Z + 6);
									Block PillarY7pZp6Xp8 = World.getBlock(X + 8, Y + 7, Z + 6);
									Block PillarY7pZp6Xn6 = World.getBlock(X - 6, Y + 7, Z + 6);
									Block PillarY7pZp6Xn8 = World.getBlock(X - 8, Y + 7, Z + 6);
									Block PillarY7pZn6Xp6 = World.getBlock(X + 6, Y + 7, Z - 6);
									Block PillarY7pZn6Xp8 = World.getBlock(X + 8, Y + 7, Z - 6);
									Block PillarY7pZn6Xn6 = World.getBlock(X - 6, Y + 7, Z - 6);
									Block PillarY7pZn6Xn8 = World.getBlock(X - 8, Y + 7, Z - 6);
									Block PillarY7pZp8Xp6 = World.getBlock(X + 6, Y + 7, Z + 8);
									Block PillarY7pZp8Xp8 = World.getBlock(X + 8, Y + 7, Z + 8);
									Block PillarY7pZp8Xn6 = World.getBlock(X - 6, Y + 7, Z + 8);
									Block PillarY7pZp8Xn8 = World.getBlock(X - 8, Y + 7, Z + 8);
									Block PillarY7pZn8Xp6 = World.getBlock(X + 6, Y + 7, Z - 8);
									Block PillarY7pZn8Xp8 = World.getBlock(X + 8, Y + 7, Z - 8);
									Block PillarY7pZn8Xn6 = World.getBlock(X - 6, Y + 7, Z - 8);
									Block PillarY7pZn8Xn8 = World.getBlock(X - 8, Y + 7, Z - 8);

									// Layer y+8 X+Z+ Top Pillar
									Block pTopY8pZp6Xp6 = World.getBlock(X + 6, Y + 8, Z + 6);
									Block pTopY8pZp6Xp7 = World.getBlock(X + 7, Y + 8, Z + 6);
									Block pTopY8pZp6Xp8 = World.getBlock(X + 8, Y + 8, Z + 6);
									Block pTopY8pZp7Xp6 = World.getBlock(X + 6, Y + 8, Z + 7);
									Block pTopY8pZp7Xp8 = World.getBlock(X + 8, Y + 8, Z + 7);
									Block pTopY8pZp8Xp6 = World.getBlock(X + 6, Y + 8, Z + 8);
									Block pTopY8pZp8Xp7 = World.getBlock(X + 7, Y + 8, Z + 8);
									Block pTopY8pZp8Xp8 = World.getBlock(X + 8, Y + 8, Z + 8);

									// Layer y+8 X+Z- Top Pillar
									Block pTopY8pZn6Xp6 = World.getBlock(X + 6, Y + 8, Z - 6);
									Block pTopY8pZn6Xp7 = World.getBlock(X + 7, Y + 8, Z - 6);
									Block pTopY8pZn6Xp8 = World.getBlock(X + 8, Y + 8, Z - 6);
									Block pTopY8pZn7Xp6 = World.getBlock(X + 6, Y + 8, Z - 7);
									Block pTopY8pZn7Xp8 = World.getBlock(X + 8, Y + 8, Z - 7);
									Block pTopY8pZn8Xp6 = World.getBlock(X + 6, Y + 8, Z - 8);
									Block pTopY8pZn8Xp7 = World.getBlock(X + 7, Y + 8, Z - 8);
									Block pTopY8pZn8Xp8 = World.getBlock(X + 8, Y + 8, Z - 8);

									// Layer y+8 X-Z- Top Pillar
									Block pTopY8pZn6Xn6 = World.getBlock(X - 6, Y + 8, Z - 6);
									Block pTopY8pZn7Xn7 = World.getBlock(X - 6, Y + 8, Z - 7);
									Block pTopY8pZn8Xn6 = World.getBlock(X - 6, Y + 8, Z - 8);
									Block pTopY8pZn6Xn7 = World.getBlock(X - 7, Y + 8, Z - 6);
									Block pTopY8pZn8Xn7 = World.getBlock(X - 7, Y + 8, Z - 8);
									Block pTopY8pZn6Xn8 = World.getBlock(X - 8, Y + 8, Z - 6);
									Block pTopY8pZn7Xn8 = World.getBlock(X - 8, Y + 8, Z - 7);
									Block pTopY8pZn8Xn8 = World.getBlock(X - 8, Y + 8, Z - 8);

									// Layer y+8 X-Z+ Top Pillar
									Block pTopY8pZp6Xn6 = World.getBlock(X - 6, Y + 8, Z + 6);
									Block pTopY8pZp7Xn7 = World.getBlock(X - 6, Y + 8, Z + 7);
									Block pTopY8pZp8Xn6 = World.getBlock(X - 6, Y + 8, Z + 8);
									Block pTopY8pZp6Xn7 = World.getBlock(X - 7, Y + 8, Z + 6);
									Block pTopY8pZp8Xn7 = World.getBlock(X - 7, Y + 8, Z + 8);
									Block pTopY8pZp6Xn8 = World.getBlock(X - 8, Y + 8, Z + 6);
									Block pTopY8pZp7Xn8 = World.getBlock(X - 8, Y + 8, Z + 7);
									Block pTopY8pZp8Xn8 = World.getBlock(X - 8, Y + 8, Z + 8);

									// Layer y+9 Top Cap
									Block pTopCapY9pZp7Xp7 = World.getBlock(X + 7, Y + 9, Z + 7);
									Block pTopCapY9pZp7Xn7 = World.getBlock(X - 7, Y + 9, Z + 7);
									Block pTopCapY9pZn7Xn7 = World.getBlock(X - 7, Y + 9, Z - 7);
									Block pTopCapY9pZn7Xp7 = World.getBlock(X + 7, Y + 9, Z - 7);

									// Layer y+10 Activator
									Block pTopCapY10pZp7Xp7 = World.getBlock(X + 7, Y + 10, Z + 7);
									Block pTopCapY10pZp7Xn7 = World.getBlock(X - 7, Y + 10, Z + 7);
									Block pTopCapY10pZn7Xn7 = World.getBlock(X - 7, Y + 10, Z - 7);
									Block pTopCapY10pZn7Xp7 = World.getBlock(X + 7, Y + 10, Z - 7);

									if ((pTopY5pZp6Xp6 != air) && (pTopY5pZp6Xp7 != air)
											&& (pTopY5pZp6Xp8 != air) && (pTopY5pZp7Xp6 != air)
											&& (pTopY5pZp7Xp8 != air) && (pTopY5pZp8Xp6 != air)
											&& (pTopY5pZp8Xp7 != air) && (pTopY5pZp8Xp8 != air)

											&& (pTopY5pZn6Xp6 != air) && (pTopY5pZn6Xp7 != air)
											&& (pTopY5pZn6Xp8 != air) && (pTopY5pZn7Xp6 != air)
											&& (pTopY5pZn7Xp8 != air) && (pTopY5pZn8Xp6 != air)
											&& (pTopY5pZn8Xp7 != air) && (pTopY5pZn8Xp8 != air)

											&& (pTopY5pZn6Xn6 != air) && (pTopY5pZn7Xn7 != air)
											&& (pTopY5pZn8Xn6 != air) && (pTopY5pZn6Xn7 != air)
											&& (pTopY5pZn8Xn7 != air) && (pTopY5pZn6Xn8 != air)
											&& (pTopY5pZn7Xn8 != air) && (pTopY5pZn8Xn8 != air)

											&& (pTopY5pZp6Xn6 != air) && (pTopY5pZp7Xn7 != air)
											&& (pTopY5pZp8Xn6 != air) && (pTopY5pZp6Xn7 != air)
											&& (pTopY5pZp8Xn7 != air) && (pTopY5pZp6Xn8 != air)
											&& (pTopY5pZp7Xn8 != air) && (pTopY5pZp8Xn8 != air)

											&& !(pTopWaterY5pZp7Xp7 != Blocks.water)
											&& !(pTopWaterY5pZp7Xn7 != Blocks.water)
											&& !(pTopWaterY5pZn7Xn7 != Blocks.water)
											&& !(pTopWaterY5pZn7Xp7 != Blocks.water)

											&& (pTopY5pZp7Xp5 != air) && (pTopY6pZp7Xp5 != air)
											&& (pTopY7pZp7Xp5 != air) && (pTopY5pZp7Xp9 != air)
											&& (pTopY6pZp7Xp9 != air) && (pTopY7pZp7Xp9 != air)
											&& (pTopY5pZp7Xn5 != air) && (pTopY6pZp7Xn5 != air)
											&& (pTopY7pZp7Xn5 != air) && (pTopY5pZp7Xn9 != air)
											&& (pTopY6pZp7Xn9 != air) && (pTopY7pZp7Xn9 != air)

											&& (pTopY5pZn7Xp5 != air) && (pTopY6pZn7Xp5 != air)
											&& (pTopY7pZn7Xp5 != air) && (pTopY5pZn7Xp9 != air)
											&& (pTopY6pZn7Xp9 != air) && (pTopY7pZn7Xp9 != air)
											&& (pTopY5pZn7Xn5 != air) && (pTopY6pZn7Xn5 != air)
											&& (pTopY7pZn7Xn5 != air) && (pTopY5pZn7Xn9 != air)
											&& (pTopY6pZn7Xn9 != air) && (pTopY7pZn7Xn9 != air)

											&& (pTopY5pZp5Xp7 != air) && (pTopY6pZp5Xp7 != air)
											&& (pTopY7pZp5Xp7 != air) && (pTopY5pZp9Xp7 != air)
											&& (pTopY6pZp9Xp7 != air) && (pTopY7pZp9Xp7 != air)
											&& (pTopY5pZn5Xp7 != air) && (pTopY6pZn5Xp7 != air)
											&& (pTopY7pZn5Xp7 != air) && (pTopY5pZn9Xp7 != air)
											&& (pTopY6pZn9Xp7 != air) && (pTopY7pZn9Xp7 != air)

											&& (pTopY5pZp5Xn7 != air) && (pTopY6pZp5Xn7 != air)
											&& (pTopY7pZp5Xn7 != air) && (pTopY5pZp9Xn7 != air)
											&& (pTopY6pZp9Xn7 != air) && (pTopY7pZp9Xn7 != air)
											&& (pTopY5pZn5Xn7 != air) && (pTopY6pZn5Xn7 != air)
											&& (pTopY7pZn5Xn7 != air) && (pTopY5pZn9Xn7 != air)
											&& (pTopY6pZn9Xn7 != air) && (pTopY7pZn9Xn7 != air)

											&& (PillarY6pZp6Xp6 != air) && (PillarY6pZp6Xp8 != air)
											&& (PillarY6pZp6Xn6 != air) && (PillarY6pZp6Xn8 != air)
											&& (PillarY6pZn6Xp6 != air) && (PillarY6pZn6Xp8 != air)
											&& (PillarY6pZn6Xn6 != air) && (PillarY6pZn6Xn8 != air)
											&& (PillarY6pZp8Xp6 != air) && (PillarY6pZp8Xp8 != air)
											&& (PillarY6pZp8Xn6 != air) && (PillarY6pZp8Xn8 != air)
											&& (PillarY6pZn8Xp6 != air) && (PillarY6pZn8Xp8 != air)
											&& (PillarY6pZn8Xn6 != air) && (PillarY6pZn8Xn8 != air)

											&& !(PillarY7pZp6Xp6 != cap)
											&& !(PillarY7pZp6Xp8 != cap)
											&& !(PillarY7pZp6Xn6 != cap)
											&& !(PillarY7pZp6Xn8 != cap)
											&& !(PillarY7pZn6Xp6 != cap)
											&& !(PillarY7pZn6Xp8 != cap)
											&& !(PillarY7pZn6Xn6 != cap)
											&& !(PillarY7pZn6Xn8 != cap)
											&& !(PillarY7pZp8Xp6 != cap)
											&& !(PillarY7pZp8Xp8 != cap)
											&& !(PillarY7pZp8Xn6 != cap)
											&& !(PillarY7pZp8Xn8 != cap)
											&& !(PillarY7pZn8Xp6 != cap)
											&& !(PillarY7pZn8Xp8 != cap)
											&& !(PillarY7pZn8Xn6 != cap)
											&& !(PillarY7pZn8Xn8 != cap)

											&& (pTopY8pZp6Xp6 != air) && (pTopY8pZp6Xp7 != air)
											&& (pTopY8pZp6Xp8 != air) && (pTopY8pZp7Xp6 != air)
											&& (pTopY8pZp7Xp8 != air) && (pTopY8pZp8Xp6 != air)
											&& (pTopY8pZp8Xp7 != air) && (pTopY8pZp8Xp8 != air)

											&& (pTopY8pZn6Xp6 != air) && (pTopY8pZn6Xp7 != air)
											&& (pTopY8pZn6Xp8 != air) && (pTopY8pZn7Xp6 != air)
											&& (pTopY8pZn7Xp8 != air) && (pTopY8pZn8Xp6 != air)
											&& (pTopY8pZn8Xp7 != air) && (pTopY8pZn8Xp8 != air)

											&& (pTopY8pZn6Xn6 != air) && (pTopY8pZn7Xn7 != air)
											&& (pTopY8pZn8Xn6 != air) && (pTopY8pZn6Xn7 != air)
											&& (pTopY8pZn8Xn7 != air) && (pTopY8pZn6Xn8 != air)
											&& (pTopY8pZn7Xn8 != air) && (pTopY8pZn8Xn8 != air)

											&& (pTopY8pZp6Xn6 != air) && (pTopY8pZp7Xn7 != air)
											&& (pTopY8pZp8Xn6 != air) && (pTopY8pZp6Xn7 != air)
											&& (pTopY8pZp8Xn7 != air) && (pTopY8pZp6Xn8 != air)
											&& (pTopY8pZp7Xn8 != air) && (pTopY8pZp8Xn8 != air)

											&& !(pTopCapY9pZp7Xp7 != cap)
											&& !(pTopCapY9pZp7Xn7 != cap)
											&& !(pTopCapY9pZn7Xn7 != cap)
											&& !(pTopCapY9pZn7Xp7 != cap)

											&& !(pTopCapY10pZp7Xp7 != activator)
											&& !(pTopCapY10pZp7Xn7 != activator)
											&& !(pTopCapY10pZn7Xn7 != activator)
											&& !(pTopCapY10pZn7Xp7 != activator)) {
										World.setBlock(X, Y - 1, Z, theBlockPlant);
										--ItemStack.stackSize;
										World.playSoundEffect(X, Y, Z, REF.SOUND.SUCCESS01, 1.0F,
												2.0F);
										World.playSoundEffect(X, Y, Z, REF.SOUND.SUCCESS02, 0.5F,
												0.5F);
									}
									return true;

								}
								else {
									World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
									World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
									World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
									return false;

								}

							}
							else {
								World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
								World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
								World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
								return false;

							}
						}
						else {
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
							return false;

						}

					}
					else {
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
						return false;

					}

				}
				else {
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
					return false;

				}

			}
			else {
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
				return false;

			}

	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int X, int Y, int Z) {
		return EnumPlantType.Cave;
	}

	@Override
	public Block getPlant(IBlockAccess world, int X, int Y, int Z) {
		return theBlockPlant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int X, int Y, int Z) {
		return 0;
	}

	public Block getSoilId() {
		return soil;
	}

}
