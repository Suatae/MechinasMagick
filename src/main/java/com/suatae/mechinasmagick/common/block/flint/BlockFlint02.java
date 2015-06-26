package com.suatae.mechinasmagick.common.block.flint;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.FlintBase;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint02;





public class BlockFlint02 extends FlintBase implements ITileEntityProvider {

	public BlockFlint02() {
		super();
		this.setBlockName(REF.NAME.BLOCK.F_02_NAME);
		this.setBlockTextureName(REF.NAME.BLOCK.F_02_NAME);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityFlint02();
	}
}
