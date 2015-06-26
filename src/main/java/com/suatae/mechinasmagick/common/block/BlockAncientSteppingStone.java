package com.suatae.mechinasmagick.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockAncientSteppingStone extends BlockBase {

	protected static Random	ran	= new Random();

	public BlockAncientSteppingStone() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.ASTEPPING);
		this.setBlockTextureName(REF.NAME.BLOCK.ASTEPPING);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockUnbreakable();
		this.setTickRandomly(true);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {

		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block lava = world.getBlock(X + d.offsetX, Y + d.offsetY, Z + d.offsetZ);
			if (!(lava != REF.BLOCK.lava)) {
				world.func_147480_a(X, Y, Z, false);
				world.setBlock(X, Y, Z, REF.BLOCK.lava);
			}
		}

	};

	@Override
	public void onEntityWalking(World world, int X, int Y, int Z, Entity entity) {
		world.func_147480_a(X, Y, Z, false);
		world.setBlock(X, Y, Z, REF.BLOCK.lava);
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}
}
