package com.suatae.mechinasmagick.common.block.blank;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlankBase;





public class BlankNS extends BlankBase {

	public BlankNS() {
		super();
		this.setBlockName(REF.NAME.BLOCK.nul);
		this.setBlockTextureName(REF.NAME.BLOCK.nul);
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {
		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block air = world.getBlock(X + d.offsetX, Y, Z);
			if (air == Blocks.air) {
				world.func_147480_a(X, Y, Z, true);
			}

		}

	};

}
