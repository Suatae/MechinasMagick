package com.suatae.mechinasmagick.common.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.AncientDoorBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;





public class BlockAncientDoorB extends AncientDoorBase implements ITileEntityProvider {

	public BlockAncientDoorB() {
		super();
		this.setBlockName(REF.NAME.BLOCK.ADOOR);
		this.setBlockTextureName(REF.NAME.BLOCK.ADOOR);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityAncientDoorB();
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {

		Block lava = world.getBlock(X, Y + 1, Z);
		if ((lava != REF.BLOCK.PILLAR.DoorT)) {
			world.func_147480_a(X, Y, Z, true);
		}
	};

	@Override
	public int getRenderType() {
		return -1;
	}

	public void addCollisionBoxesToList(World world, int X, int Y, int Z, AxisAlignedBB BB,
			List list, Entity entity) {
		super.addCollisionBoxesToList(world, X, Y, Z, BB, list, entity);
		this.setBlockBounds(0.06F, 0F, 0, 0.94F, 2.0F, 1.0F);
	}

	@Override
	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0.06F, 0F, 0, 0.94F, 2.0F, 1.0F);
	}

	@Override
	public void onBlockPlacedBy(World world, int X, int Y, int Z, EntityLivingBase Player,
			ItemStack itemstack) {
		world.setBlock(X, Y + 1, Z, BlockReg.blockAncientDoorT, 0, 2);
	}
}
