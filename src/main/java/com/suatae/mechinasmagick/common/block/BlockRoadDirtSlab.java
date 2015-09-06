package com.suatae.mechinasmagick.common.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockRoadBase;
import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityRoad;
import com.suatae.mechinasmagick.utility.ConfigUtil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockRoadDirtSlab extends BlockRoadBase implements ITileEntityProvider {
	public BlockRoadDirtSlab() {
		super(Material.ground, "axe", 0, 2F, 0.4F, 0.5F, 0F, Block.soundTypeGrass);
		this.setBlockName(REF.NAME.BLOCK.ROADdirtslab);
		this.setBlockTextureName(REF.NAME.BLOCK.ROADdirtslab);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.45F, 1F);

	}

	public void addCollisionBoxesToList(World world, int X, int Y, int Z, AxisAlignedBB BB,
			List list, Entity entity) {
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.25F, 1.0F);
		this.setBlockBounds(0.1F, 0.25F, 0.1F, 0.9F, 0.45F, 0.9F);
		this.setBlockBounds(0.3F, 0.45F, 0.1F, 0.9F, 0.50F, 0.7F);
		super.addCollisionBoxesToList(world, X, Y, Z, BB, list, entity);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int X, int Y, int Z) {
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.45F, 1F);
		super.setBlockBoundsBasedOnState(world, X, Y, Z);
	}

	@Override
	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.45F, 1F);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityRoad();
	}

	@Override
	public boolean onBlockActivated(World world, int X, int Y, int Z, EntityPlayer Player,
			int side, float hitX, float hitY, float hitZ) {
		ItemStack playerItem = Player.getCurrentEquippedItem();
		if (!world.isRemote) {
			TileEntityRoad te = (TileEntityRoad) world.getTileEntity(X, Y, Z);
			if (te.getCamo() != null && Player.isSneaking() == true && !ConfigUtil.Multiplayer) {
				ItemStack camoStack = te.getCamo();
				te.setCamo(null);
				EntityItem itemEntity = new EntityItem(world, X + 0.5F, Y + 1, Z + 0.5F, camoStack);
				world.spawnEntityInWorld(itemEntity);
			}
			else {
				if (playerItem != null && te.getCamo() == null) {
					if (playerItem.getItem() != Item.getItemFromBlock(this)) {
						if (playerItem.getItem() != Item.getItemFromBlock(BlockReg.blockRoadStone)) {
							if (playerItem.getItem() != Item
									.getItemFromBlock(BlockReg.blockRoaddirt)) {
								if (playerItem.getItem() != Item
										.getItemFromBlock(BlockReg.blockRoadStoneSlab)) {
									if (playerItem.getItem() instanceof ItemBlock) {
										ItemStack camoStack = playerItem.splitStack(1);
										te.setCamo(camoStack);

									}
								}
							}
						}
					}
					else {
						if (playerItem.getItem() != Item.getItemFromBlock(BlockReg.blockRoadStone)) {
							if (playerItem.getItem() != Item
									.getItemFromBlock(BlockReg.blockRoaddirt)) {
								if (playerItem.getItem() != Item
										.getItemFromBlock(BlockReg.blockRoadStoneSlab)) {
									if (side == 1) {
										if (world.isAirBlock(X, Y + 1, Z)) {
											world.setBlock(X, Y, Z, BlockReg.blockRoaddirt);
											if (!Player.capabilities.isCreativeMode) {
												ItemStack camoStack = playerItem.splitStack(1);
											}

										}
									}
									if (side == 2) {
										while (world.getBlock(X, Y, Z).equals(this))
											Z++;
										if (world.isAirBlock(X, Y, Z)) {
											world.setBlock(X, Y, Z, this);
											if (!Player.capabilities.isCreativeMode) {
												ItemStack camoStack = playerItem.splitStack(1);
											}

										}
									}

									if (side == 3) {
										while (world.getBlock(X, Y, Z).equals(this))
											Z--;
										if (world.isAirBlock(X, Y, Z)) {
											world.setBlock(X, Y, Z, this);
											if (!Player.capabilities.isCreativeMode) {
												ItemStack camoStack = playerItem.splitStack(1);
											}
										}
									}

									if (side == 4) {
										while (world.getBlock(X, Y, Z).equals(this))
											X++;
										if (world.isAirBlock(X, Y, Z)) {
											world.setBlock(X, Y, Z, this);
											if (!Player.capabilities.isCreativeMode) {
												ItemStack camoStack = playerItem.splitStack(1);
											}
										}
									}

									if (side == 5) {
										while (world.getBlock(X, Y, Z).equals(this))
											X--;
										if (world.isAirBlock(X, Y, Z)) {
											world.setBlock(X, Y, Z, this);
											if (!Player.capabilities.isCreativeMode) {
												ItemStack camoStack = playerItem.splitStack(1);
											}
										}
									}

								}
							}
						}

					}
				}

			}

		}
		return true;
	}

	@Override
	public void onBlockHarvested(World world, int X, int Y, int Z, int meta, EntityPlayer player) {
		if (!world.isRemote) {
			TileEntityRoad te = (TileEntityRoad) world.getTileEntity(X, Y, Z);
			if (te.getCamo() != null) {
				ItemStack camoStack = te.getCamo();
				EntityItem itemEntity = new EntityItem(world, X + 0.5F, Y + 1, Z + 0.5F, camoStack);
				world.spawnEntityInWorld(itemEntity);
			}
		}

	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess world, int X, int Y, int Z, int side) {
		TileEntityRoad te = (TileEntityRoad) world.getTileEntity(X, Y, Z);
		ItemStack stack = te.getCamo();
		if (stack != null && stack.getItem() instanceof ItemBlock) {
			Block block = ((ItemBlock) stack.getItem()).field_150939_a;
			return block.getIcon(side, stack.getItemDamage());
		}
		else {
			return super.getIcon(world, X, Y, Z, side);
		}
	}
}
