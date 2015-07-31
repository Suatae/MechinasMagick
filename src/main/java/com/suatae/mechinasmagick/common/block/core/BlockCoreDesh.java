package com.suatae.mechinasmagick.common.block.core;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockMachineCore;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDesh;





public class BlockCoreDesh extends BlockMachineCore implements ITileEntityProvider {

	public BlockCoreDesh() {
		this.setBlockName(REF.NAME.BLOCK.cDesh);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityDesh();
	}

}
