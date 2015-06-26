package com.suatae.mechinasmagick.common.init;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class FlintBase extends BlockBase {
	public static Item	FLINT_DROP	= Items.flint;

	public FlintBase() {
		super(Material.wood);
		this.setHardness(0.2f);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(FLINT_DROP, world.rand.nextInt(5) + 1));
		if (world.rand.nextFloat() < 0.10F)
			drops.add(new ItemStack(FLINT_DROP));
		return drops;
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
	public int getRenderType() {
		return -1;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int X, int Y, int Z) {
		return null;
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return world.isSideSolid(x - 1, y, z, EAST, true)
				|| world.isSideSolid(x + 1, y, z, WEST, true)
				|| world.isSideSolid(x, y, z - 1, SOUTH, true)
				|| world.isSideSolid(x, y, z + 1, NORTH, true) || func_150107_m(world, x, y - 1, z);
	}

	private boolean func_150107_m(World world, int x, int y, int z) {
		if (World.doesBlockHaveSolidTopSurface(world, x, y, z)) {
			return true;
		}
		else {
			Block block = world.getBlock(x, y, z);
			return block.canPlaceTorchOnTop(world, x, y, z);
		}
	}

	@Override
	public void onBlockDestroyedByExplosion(World world, int X, int Y, int Z, Explosion p_149723_5_) {
		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block air = world.getBlock(X, Y, Z + d.offsetZ);
			Block air1 = world.getBlock(X, Y, Z - d.offsetZ);
			Block air2 = world.getBlock(X + d.offsetX, Y, Z);
			Block air3 = world.getBlock(X - d.offsetX, Y, Z);
			if (air == Blocks.air || air1 == Blocks.air || air2 == Blocks.air || air3 == Blocks.air) {
				world.func_147480_a(X, Y, Z, true);
				world.func_147480_a(X + 1, Y, Z, true);
				world.func_147480_a(X - 1, Y, Z, true);
				world.func_147480_a(X, Y, Z + 1, true);
				world.func_147480_a(X, Y, Z - 1, true);
			}

		}
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int X, int Y, int Z, int p_149664_5_) {
		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block air = world.getBlock(X, Y, Z + d.offsetZ);
			Block air1 = world.getBlock(X, Y, Z - d.offsetZ);
			Block air2 = world.getBlock(X + d.offsetX, Y, Z);
			Block air3 = world.getBlock(X - d.offsetX, Y, Z);
			if (air == Blocks.air || air1 == Blocks.air || air2 == Blocks.air || air3 == Blocks.air) {
				world.func_147480_a(X, Y, Z, true);
				world.func_147480_a(X + 1, Y, Z, true);
				world.func_147480_a(X - 1, Y, Z, true);
				world.func_147480_a(X, Y, Z + 1, true);
				world.func_147480_a(X, Y, Z - 1, true);
			}

		}
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {
		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block air = world.getBlock(X, Y, Z + d.offsetZ);
			Block air1 = world.getBlock(X, Y, Z - d.offsetZ);
			Block air2 = world.getBlock(X + d.offsetX, Y, Z);
			Block air3 = world.getBlock(X - d.offsetX, Y, Z);
			if (air == Blocks.air || air1 == Blocks.air || air2 == Blocks.air || air3 == Blocks.air) {
				world.func_147480_a(X, Y, Z, true);
				world.func_147480_a(X + 1, Y, Z, true);
				world.func_147480_a(X - 1, Y, Z, true);
				world.func_147480_a(X, Y, Z + 1, true);
				world.func_147480_a(X, Y, Z - 1, true);
			}

		}
	};

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int X, int Y, int Z) {
		return Items.flint;
	}
}
