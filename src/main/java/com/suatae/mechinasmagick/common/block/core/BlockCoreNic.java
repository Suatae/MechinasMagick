package com.suatae.mechinasmagick.common.block.core;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockMachineCore;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityNic;





public class BlockCoreNic extends BlockMachineCore implements ITileEntityProvider {

	public BlockCoreNic() {
		this.setBlockName(REF.NAME.BLOCK.cNic);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityNic();
	}

}
