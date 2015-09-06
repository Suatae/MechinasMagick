package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;





public class BlockCompBaseFalling extends BlockFalling {
	public final String		tool;
	public final int		harvestlvl;
	public final Float		hardness;
	public final Float		resistance;
	public final SoundType	sound;

	public BlockCompBaseFalling(Material mat, String Tool, int HarvestLVL, Float Hardness,
			Float Resistance, SoundType Sound) {
		super(mat);
		tool = Tool;
		harvestlvl = HarvestLVL;
		hardness = Hardness;
		resistance = Resistance;
		sound = Sound;
		setCreativeTab(MechinasTabs.MechinasMagick_TABblocks);
		setLightOpacity(1);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, harvestlvl);
		setStepSound(sound);
	}

	@Override
	public boolean isToolEffective(String type, int metadata) {
		return type.equals(tool);
	}
}
