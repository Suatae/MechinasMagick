package com.suatae.mechinasmagick.common.block.goldcasing;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingSeeded;





public class BlockGoldCasingSeeded extends BlockBase implements ITileEntityProvider {

	public BlockGoldCasingSeeded() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.GSCasing);
		this.setBlockTextureName(REF.NAME.BLOCK.GSCasing);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockBounds(0.35F, 0.05F, 0.35F, 0.65F, 0.60F, 0.65F);
		this.setBlockUnbreakable();
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGoldCasingSeeded();
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}

}
