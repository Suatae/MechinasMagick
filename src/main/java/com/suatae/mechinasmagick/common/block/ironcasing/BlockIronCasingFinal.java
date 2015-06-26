package com.suatae.mechinasmagick.common.block.ironcasing;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingFinal;





public class BlockIronCasingFinal extends BlockBase implements ITileEntityProvider {

	public BlockIronCasingFinal() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.IFCasing);
		this.setBlockTextureName(REF.NAME.BLOCK.IFCasing);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockBounds(0.35F, 0.05F, 0.35F, 0.65F, 0.60F, 0.65F);
		this.setBlockUnbreakable();
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityIronCasingFinal();
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
	public void onBlockClicked(World world, int X, int Y, int Z, EntityPlayer Player) {
		Item star = Items.nether_star;
		Item seed = ItemReg.itemPrimedIron;
		if (Player.inventory.hasItem(star)) {
			world.setBlock(X, Y, Z, Blocks.air);
			Player.inventory.consumeInventoryItem(star);
			Player.inventory.func_70439_a(seed, 1);
			world.createExplosion(Player, X, Y, Z, 1f, true);
			Player.addPotionEffect(new PotionEffect(15, 20 * 20, 2));
		}
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}
}
