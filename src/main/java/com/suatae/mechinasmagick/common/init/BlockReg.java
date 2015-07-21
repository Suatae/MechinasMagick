package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;

import com.suatae.mechinasmagick.common.block.BlockAncientDoorB;
import com.suatae.mechinasmagick.common.block.BlockAncientDoorT;
import com.suatae.mechinasmagick.common.block.BlockAncientSeedContainer;
import com.suatae.mechinasmagick.common.block.BlockAncientSteppingStone;
import com.suatae.mechinasmagick.common.block.BlockBranch;
import com.suatae.mechinasmagick.common.block.BlockCache;
import com.suatae.mechinasmagick.common.block.BlockCasing;
import com.suatae.mechinasmagick.common.block.BlockCatalyst;
import com.suatae.mechinasmagick.common.block.BlockCrystalBlock;
import com.suatae.mechinasmagick.common.block.BlockCrystalCrop;
import com.suatae.mechinasmagick.common.block.BlockCrystalOre;
import com.suatae.mechinasmagick.common.block.BlockFlint;
import com.suatae.mechinasmagick.common.block.BlockGoldCrop;
import com.suatae.mechinasmagick.common.block.BlockIronCrop;
import com.suatae.mechinasmagick.common.block.BlockLavaStone;
import com.suatae.mechinasmagick.common.block.BlockStoneBrick;
import com.suatae.mechinasmagick.common.block.ItemBlockCache;
import com.suatae.mechinasmagick.common.block.ItemBlockCasing;
import com.suatae.mechinasmagick.common.block.ItemBlockFlint;
import com.suatae.mechinasmagick.common.block.ItemBlockStoneBrick;
import com.suatae.mechinasmagick.common.block.blank.BlankEW;
import com.suatae.mechinasmagick.common.block.blank.BlankNE;
import com.suatae.mechinasmagick.common.block.blank.BlankNS;
import com.suatae.mechinasmagick.common.block.blank.BlankNW;
import com.suatae.mechinasmagick.common.block.blank.BlankSE;
import com.suatae.mechinasmagick.common.block.blank.BlankSW;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorT;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCache;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCasing;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCrystalCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityFlint;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockGoldCrop		= new BlockGoldCrop();
	public static final Block	blockIronCrop		= new BlockIronCrop();
	public static final Block	blockCrystalCrop	= new BlockCrystalCrop();

	public static final Block	blockLavaStone		= new BlockLavaStone();
	public static final Block	blockAStepping		= new BlockAncientSteppingStone();
	public static final Block	blockADoorB			= new BlockAncientDoorB();
	public static final Block	blockADoorT			= new BlockAncientDoorT();
	public static final Block	blockASContainer	= new BlockAncientSeedContainer();
	public static final Block	blockCatalyst		= new BlockCatalyst();

	public static final Block	blockStoneBrick		= new BlockStoneBrick();
	public static final Block	blockCasing			= new BlockCasing();
	public static final Block	blockBranch			= new BlockBranch();

	public static final Block	blockFlint			= new BlockFlint();
	public static final Block	blockCrystalBlock	= new BlockCrystalBlock();

	public static final Block	NS					= new BlankNS();
	public static final Block	EW					= new BlankEW();
	public static final Block	NE					= new BlankNE();
	public static final Block	SE					= new BlankSE();
	public static final Block	SW					= new BlankSW();
	public static final Block	NW					= new BlankNW();

	public static final Block	blockCache			= new BlockCache();
	public static final Block	blockCrystalOre		= new BlockCrystalOre();

	public static void init() {
		GameRegistry.registerBlock(blockGoldCrop, "blockGoldCrop");
		GameRegistry.registerBlock(blockIronCrop, "blockIronCrop");
		GameRegistry.registerBlock(blockCrystalCrop, "blockCrystalCrop");

		GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
		GameRegistry.registerBlock(blockAStepping, "blockAncientSteppingStone");
		GameRegistry.registerBlock(blockADoorB, "blockAncientDoorB");
		GameRegistry.registerBlock(blockADoorT, "blockAncientDoorT");
		GameRegistry.registerBlock(blockASContainer, "blockAncientContainer");
		GameRegistry.registerBlock(blockCatalyst, "blockCatalyst");
		GameRegistry.registerBlock(blockBranch, "blockBranch");
		GameRegistry.registerBlock(blockCrystalBlock, "blockCrystalBlock");
		GameRegistry.registerBlock(NS, "NS");
		GameRegistry.registerBlock(EW, "EW");
		GameRegistry.registerBlock(NE, "NE");
		GameRegistry.registerBlock(SE, "SE");
		GameRegistry.registerBlock(SW, "SW");
		GameRegistry.registerBlock(NW, "NW");

		GameRegistry.registerBlock(blockCrystalOre, "blockCrystalOre");

		// TileEntities
		GameRegistry.registerTileEntity(TileEntityAncientContainer.class,
				"TileEntityAncientContainer");
		GameRegistry.registerTileEntity(TileEntityCatalyst.class, "TileEntityCatalyst");
		GameRegistry.registerTileEntity(TileEntityCasing.class, "TileEntityGoldCasing");
		GameRegistry.registerTileEntity(TileEntityGoldCrop.class, "TileEntityGoldCrop");
		GameRegistry.registerTileEntity(TileEntityIronCrop.class, "TileEntityIronCrop");
		GameRegistry.registerTileEntity(TileEntityCrystalCrop.class, "TileEntityCrystalCrop");

		GameRegistry.registerTileEntity(TileEntityBranch.class, "TileEntityBranch");
		GameRegistry.registerTileEntity(TileEntityFlint.class, "TileEntityFlint01");

		GameRegistry.registerTileEntity(TileEntityCache.class, "TileEntityCache");

		GameRegistry.registerTileEntity(TileEntityAncientDoorB.class, "TileEntityAncientDoorB");
		GameRegistry.registerTileEntity(TileEntityAncientDoorT.class, "TileEntityAncientDoorT");

		GameRegistry.registerTileEntity(TileEntityOreE.class, "TileEntityOreE");

		GameRegistry.registerBlock(blockStoneBrick, ItemBlockStoneBrick.class, "blockStoneBrick");
		GameRegistry.registerBlock(blockCache, ItemBlockCache.class, "blockCache");
		GameRegistry.registerBlock(blockCasing, ItemBlockCasing.class, "blockCasing");
		GameRegistry.registerBlock(blockFlint, ItemBlockFlint.class, "blockFlint");

	}
}
