package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockRoadBase extends Block {
	public final String		tool;
	public final int		harvestlvl;
	public final Float		speed;
	public final Float		max;
	public final Float		hardness;
	public final Float		resistance;
	public final SoundType	sound;

	public BlockRoadBase(Material mat, String Tool, int HarvestLVL, Float Speed, Float Max,
			Float Hardness, Float Resistance, SoundType Sound) {
		super(mat);
		tool = Tool;
		harvestlvl = HarvestLVL;
		speed = Speed;
		max = Max;
		hardness = Hardness;
		resistance = Resistance;
		sound = Sound;
		setTickRandomly(true);
		setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
		setLightOpacity(1);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, harvestlvl);
		setStepSound(sound);

	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(
				this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
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
	public boolean isToolEffective(String type, int metadata) {
		return type.equals(tool);
	}

	@Override
	public void onEntityWalking(World world, int X, int Y, int Z, Entity entity) {

		double motionX = Math.abs(entity.motionX);
		double motionZ = Math.abs(entity.motionZ);

		if (entity instanceof EntityPlayer) {
			if (entity.motionX < max) {
				entity.motionX *= speed;
			}
			if (entity.motionZ < max) {
				entity.motionZ *= speed;
			}
		}
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
	}
}
