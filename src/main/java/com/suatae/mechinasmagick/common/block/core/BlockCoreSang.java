package com.suatae.mechinasmagick.common.block.core;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockMachineCore;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySang;





public class BlockCoreSang extends BlockMachineCore implements ITileEntityProvider {

	public BlockCoreSang() {
		this.setBlockName(REF.NAME.BLOCK.cSang);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntitySang();
	}

}
