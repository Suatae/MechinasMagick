package com.suatae.mechinasmagick.common.block.core;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockMachineCore;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityMeu;





public class BlockCoreMeu extends BlockMachineCore implements ITileEntityProvider {

	public BlockCoreMeu() {
		this.setBlockName(REF.NAME.BLOCK.cMeu);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityMeu();
	}

}
