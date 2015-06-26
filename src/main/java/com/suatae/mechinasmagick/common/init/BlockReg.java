package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;

import com.suatae.mechinasmagick.common.block.BlockAncientDoorB;
import com.suatae.mechinasmagick.common.block.BlockAncientDoorT;
import com.suatae.mechinasmagick.common.block.BlockAncientSeedContainer;
import com.suatae.mechinasmagick.common.block.BlockAncientSteppingStone;
import com.suatae.mechinasmagick.common.block.BlockBranch;
import com.suatae.mechinasmagick.common.block.BlockCatalyst;
import com.suatae.mechinasmagick.common.block.BlockGoldAncient;
import com.suatae.mechinasmagick.common.block.BlockIronAncient;
import com.suatae.mechinasmagick.common.block.BlockLavaStone;
import com.suatae.mechinasmagick.common.block.BlockOreE;
import com.suatae.mechinasmagick.common.block.BlockStoneBrick;
import com.suatae.mechinasmagick.common.block.ItemBlockStoneBrick;
import com.suatae.mechinasmagick.common.block.blank.BlankEW;
import com.suatae.mechinasmagick.common.block.blank.BlankNE;
import com.suatae.mechinasmagick.common.block.blank.BlankNS;
import com.suatae.mechinasmagick.common.block.blank.BlankNW;
import com.suatae.mechinasmagick.common.block.blank.BlankSE;
import com.suatae.mechinasmagick.common.block.blank.BlankSW;
import com.suatae.mechinasmagick.common.block.cache.BlockCacheC;
import com.suatae.mechinasmagick.common.block.cache.BlockCacheE;
import com.suatae.mechinasmagick.common.block.cache.BlockCacheR;
import com.suatae.mechinasmagick.common.block.cache.BlockCacheU;
import com.suatae.mechinasmagick.common.block.flint.BlockFlint01;
import com.suatae.mechinasmagick.common.block.flint.BlockFlint02;
import com.suatae.mechinasmagick.common.block.flint.BlockFlint03;
import com.suatae.mechinasmagick.common.block.flint.BlockFlint04;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasing;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasingFinal;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasingSeeded;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasing;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasingFinal;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasingSeeded;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorT;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheCommon;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheElite;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheRare;
import com.suatae.mechinasmagick.common.tileentity.cache.TileEntityCacheUncommon;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint01;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint02;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint03;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint04;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasing;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingSeeded;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasing;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingSeeded;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockAncientGold		= new BlockGoldAncient();
	public static final Block	blockAncientIron		= new BlockIronAncient();
	public static final Block	blockLavaStone			= new BlockLavaStone();
	public static final Block	blockAStepping			= new BlockAncientSteppingStone();
	public static final Block	blockADoorB				= new BlockAncientDoorB();
	public static final Block	blockADoorT				= new BlockAncientDoorT();
	public static final Block	blockASContainer		= new BlockAncientSeedContainer();
	public static final Block	blockCatalyst			= new BlockCatalyst();

	public static final Block	blockStoneBrick			= new BlockStoneBrick();
	public static final Block	blockGoldCasing			= new BlockGoldCasing();
	public static final Block	blockGoldCasingSeeded	= new BlockGoldCasingSeeded();
	public static final Block	blockGoldCasingFinal	= new BlockGoldCasingFinal();
	public static final Block	blockIronCasing			= new BlockIronCasing();
	public static final Block	blockIronCasingSeeded	= new BlockIronCasingSeeded();
	public static final Block	blockIronCasingFinal	= new BlockIronCasingFinal();
	public static final Block	blockBranch				= new BlockBranch();

	public static final Block	blockFlint01			= new BlockFlint01();
	public static final Block	blockFlint02			= new BlockFlint02();
	public static final Block	blockFlint03			= new BlockFlint03();
	public static final Block	blockFlint04			= new BlockFlint04();

	public static final Block	NS						= new BlankNS();
	public static final Block	EW						= new BlankEW();
	public static final Block	NE						= new BlankNE();
	public static final Block	SE						= new BlankSE();
	public static final Block	SW						= new BlankSW();
	public static final Block	NW						= new BlankNW();

	public static final Block	blockCacheC				= new BlockCacheC();
	public static final Block	blockCacheU				= new BlockCacheU();
	public static final Block	blockCacheR				= new BlockCacheR();
	public static final Block	blockCacheE				= new BlockCacheE();

	public static final Block	OREe					= new BlockOreE();

	public static void init() {
		GameRegistry.registerBlock(blockAncientGold, "blockGoldAncient");
		GameRegistry.registerBlock(blockAncientIron, "blockIronAncient");
		GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
		GameRegistry.registerBlock(blockAStepping, "blockAncientSteppingStone");
		GameRegistry.registerBlock(blockADoorB, "blockAncientDoorB");
		GameRegistry.registerBlock(blockADoorT, "blockAncientDoorT");
		GameRegistry.registerBlock(blockASContainer, "blockAncientContainer");
		GameRegistry.registerBlock(blockCatalyst, "blockCatalyst");
		GameRegistry.registerBlock(blockGoldCasing, "blockGoldCasing");
		GameRegistry.registerBlock(blockGoldCasingSeeded, "blockGoldCasingSeeded");
		GameRegistry.registerBlock(blockGoldCasingFinal, "blockGoldCasingFinal");
		GameRegistry.registerBlock(blockIronCasing, "blockIronCasing");
		GameRegistry.registerBlock(blockIronCasingSeeded, "blockIronCasingSeeded");
		GameRegistry.registerBlock(blockIronCasingFinal, "blockIronCasingFinal");
		GameRegistry.registerBlock(blockBranch, "blockBranch");
		GameRegistry.registerBlock(blockFlint01, "blockFlint01");
		GameRegistry.registerBlock(blockFlint02, "blockFlint02");
		GameRegistry.registerBlock(blockFlint03, "blockFlint03");
		GameRegistry.registerBlock(blockFlint04, "blockFlint04");
		GameRegistry.registerBlock(NS, "NS");
		GameRegistry.registerBlock(EW, "EW");
		GameRegistry.registerBlock(NE, "NE");
		GameRegistry.registerBlock(SE, "SE");
		GameRegistry.registerBlock(SW, "SW");
		GameRegistry.registerBlock(NW, "NW");

		GameRegistry.registerBlock(blockCacheC, "blockCacheC");
		GameRegistry.registerBlock(blockCacheU, "blockCacheU");
		GameRegistry.registerBlock(blockCacheR, "blockCacheR");
		GameRegistry.registerBlock(blockCacheE, "blockCacheE");

		GameRegistry.registerBlock(OREe, "OREe");

		GameRegistry.registerTileEntity(TileEntityAncientContainer.class,
				"TileEntityAncientContainer");
		GameRegistry.registerTileEntity(TileEntityCatalyst.class, "TileEntityCatalyst");
		GameRegistry.registerTileEntity(TileEntityGoldCasing.class, "TileEntityGoldCasing");
		GameRegistry.registerTileEntity(TileEntityGoldCasingSeeded.class,
				"TileEntityGoldCasingSeeded");
		GameRegistry.registerTileEntity(TileEntityGoldCasingFinal.class,
				"TileEntityGoldCasingFinal");
		GameRegistry.registerTileEntity(TileEntityGoldCrop.class, "TileEntityGoldCrop");
		GameRegistry.registerTileEntity(TileEntityIronCasing.class, "TileEntityIronCasing");
		GameRegistry.registerTileEntity(TileEntityIronCasingSeeded.class,
				"TileEntityIronCasingSeeded");
		GameRegistry.registerTileEntity(TileEntityIronCasingFinal.class,
				"TileEntityIronCasingFinal");
		GameRegistry.registerTileEntity(TileEntityIronCrop.class, "TileEntityIronCrop");
		GameRegistry.registerTileEntity(TileEntityBranch.class, "TileEntityBranch");
		GameRegistry.registerTileEntity(TileEntityFlint01.class, "TileEntityFlint01");
		GameRegistry.registerTileEntity(TileEntityFlint02.class, "TileEntityFlint02");
		GameRegistry.registerTileEntity(TileEntityFlint03.class, "TileEntityFlint03");
		GameRegistry.registerTileEntity(TileEntityFlint04.class, "TileEntityFlint04");

		GameRegistry.registerTileEntity(TileEntityCacheCommon.class, "TileEntityCacheCommon");
		GameRegistry.registerTileEntity(TileEntityCacheUncommon.class, "TileEntityCacheUncommon");
		GameRegistry.registerTileEntity(TileEntityCacheRare.class, "TileEntityCacheRare");
		GameRegistry.registerTileEntity(TileEntityCacheElite.class, "TileEntityCacheElite");

		GameRegistry.registerTileEntity(TileEntityAncientDoorB.class, "TileEntityAncientDoorB");
		GameRegistry.registerTileEntity(TileEntityAncientDoorT.class, "TileEntityAncientDoorT");

		GameRegistry.registerTileEntity(TileEntityOreE.class, "TileEntityOreE");

		GameRegistry.registerBlock(blockStoneBrick, ItemBlockStoneBrick.class, "blockStoneBrick");

	}
}
