package com.suatae.mechinasmagick.common.block;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;





public class BlockBranch extends BlockBase implements ITileEntityProvider {

	public BlockBranch() {
		super(Material.wood);
		this.setBlockName(REF.NAME.BLOCK.BRANCH);
		this.setBlockTextureName(REF.NAME.BLOCK.BRANCH);
		this.setStepSound(Block.soundTypeWood);
		this.setHardness(1.0F);
		this.setResistance(2.5F);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
		this.setBlockBounds(0, 0, 0, 1.0F, 0.20F, 1.0F);
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
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof EntityPlayer && !world.isRemote) {
			world.func_147480_a(x, y, z, true);
		}
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof EntityPlayer && !world.isRemote) {
			world.func_147480_a(x, y, z, true);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityBranch();
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
		return true;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

		// drops.add(new ItemStack(this.LEAF(), world.rand.nextInt(3) + 1, 0));
		drops.add(new ItemStack(this.STICK(), world.rand.nextInt(10), 0));

		return drops;
	}

	// protected Item LEAF() {
	// return ItemReg.itemLeaf;
	// }

	protected Item STICK() {
		return Items.stick;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int X, int Y, int Z) {
		return null;
	}
}
