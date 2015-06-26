package com.suatae.mechinasmagick.common.block.blank;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlankBase;





public class BlankSW extends BlankBase {

	public BlankSW() {
		super();
		this.setBlockName(REF.NAME.BLOCK.nul);
		this.setBlockTextureName(REF.NAME.BLOCK.nul);
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {
		Block air = world.getBlock(X + 1, Y, Z);
		Block air1 = world.getBlock(X, Y, Z + 1);
		if (air == Blocks.air || air1 == Blocks.air) {
			world.func_147480_a(X, Y, Z, true);
		}

	};

}
