package com.suatae.mechinasmagick.common.init.registry;

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
import com.suatae.mechinasmagick.common.block.BlockRoadDirt;
import com.suatae.mechinasmagick.common.block.BlockRoadDirtSlab;
import com.suatae.mechinasmagick.common.block.BlockRoadStone;
import com.suatae.mechinasmagick.common.block.BlockRoadStoneSlab;
import com.suatae.mechinasmagick.common.block.BlockStoneBrick;
import com.suatae.mechinasmagick.common.block.BlockVoid;
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
import com.suatae.mechinasmagick.common.block.compressed.BlockCobble;
import com.suatae.mechinasmagick.common.block.compressed.BlockDirt;
import com.suatae.mechinasmagick.common.block.compressed.BlockGravel;
import com.suatae.mechinasmagick.common.block.compressed.BlockSand;
import com.suatae.mechinasmagick.common.block.compressed.ItemBlockCompressed;
import com.suatae.mechinasmagick.common.block.core.BlockCoreASil;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAdam;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAld;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAlum;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAlumB;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAmo;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAng;
import com.suatae.mechinasmagick.common.block.core.BlockCoreAtl;
import com.suatae.mechinasmagick.common.block.core.BlockCoreBSteel;
import com.suatae.mechinasmagick.common.block.core.BlockCoreBrass;
import com.suatae.mechinasmagick.common.block.core.BlockCoreBron;
import com.suatae.mechinasmagick.common.block.core.BlockCoreCarm;
import com.suatae.mechinasmagick.common.block.core.BlockCoreCel;
import com.suatae.mechinasmagick.common.block.core.BlockCoreCeru;
import com.suatae.mechinasmagick.common.block.core.BlockCoreCon;
import com.suatae.mechinasmagick.common.block.core.BlockCoreCopp;
import com.suatae.mechinasmagick.common.block.core.BlockCoreDIron;
import com.suatae.mechinasmagick.common.block.core.BlockCoreDSteel;
import com.suatae.mechinasmagick.common.block.core.BlockCoreDesh;
import com.suatae.mechinasmagick.common.block.core.BlockCoreDesi;
import com.suatae.mechinasmagick.common.block.core.BlockCoreDia;
import com.suatae.mechinasmagick.common.block.core.BlockCoreElec;
import com.suatae.mechinasmagick.common.block.core.BlockCoreExi;
import com.suatae.mechinasmagick.common.block.core.BlockCoreGold;
import com.suatae.mechinasmagick.common.block.core.BlockCoreHad;
import com.suatae.mechinasmagick.common.block.core.BlockCoreHep;
import com.suatae.mechinasmagick.common.block.core.BlockCoreIg;
import com.suatae.mechinasmagick.common.block.core.BlockCoreInf;
import com.suatae.mechinasmagick.common.block.core.BlockCoreIno;
import com.suatae.mechinasmagick.common.block.core.BlockCoreInv;
import com.suatae.mechinasmagick.common.block.core.BlockCoreIron;
import com.suatae.mechinasmagick.common.block.core.BlockCoreKal;
import com.suatae.mechinasmagick.common.block.core.BlockCoreLap;
import com.suatae.mechinasmagick.common.block.core.BlockCoreLead;
import com.suatae.mechinasmagick.common.block.core.BlockCoreLem;
import com.suatae.mechinasmagick.common.block.core.BlockCoreLum;
import com.suatae.mechinasmagick.common.block.core.BlockCoreMan;
import com.suatae.mechinasmagick.common.block.core.BlockCoreMeu;
import com.suatae.mechinasmagick.common.block.core.BlockCoreMid;
import com.suatae.mechinasmagick.common.block.core.BlockCoreMith;
import com.suatae.mechinasmagick.common.block.core.BlockCoreNaq;
import com.suatae.mechinasmagick.common.block.core.BlockCoreNic;
import com.suatae.mechinasmagick.common.block.core.BlockCoreOric;
import com.suatae.mechinasmagick.common.block.core.BlockCoreOsm;
import com.suatae.mechinasmagick.common.block.core.BlockCoreOur;
import com.suatae.mechinasmagick.common.block.core.BlockCorePlat;
import com.suatae.mechinasmagick.common.block.core.BlockCorePro;
import com.suatae.mechinasmagick.common.block.core.BlockCoreQSil;
import com.suatae.mechinasmagick.common.block.core.BlockCoreRub;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSIron;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSSteel;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSang;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSig;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSil;
import com.suatae.mechinasmagick.common.block.core.BlockCoreSteel;
import com.suatae.mechinasmagick.common.block.core.BlockCoreTart;
import com.suatae.mechinasmagick.common.block.core.BlockCoreTin;
import com.suatae.mechinasmagick.common.block.core.BlockCoreVul;
import com.suatae.mechinasmagick.common.block.core.BlockCoreVyr;
import com.suatae.mechinasmagick.common.block.core.BlockCoreWood;
import com.suatae.mechinasmagick.common.block.core.BlockCoreZinc;
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
import com.suatae.mechinasmagick.common.tileentity.TileEntityRoad;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityASil;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAdam;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAld;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAlum;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAlumB;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAmo;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAng;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityAtl;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityBSteel;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityBrass;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityBron;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityCarm;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityCel;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityCeru;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityCon;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityCopp;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDIron;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDSteel;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDesh;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDesi;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityDia;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityElec;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityExi;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityGold;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityHad;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityHep;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityIg;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityInf;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityIno;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityInv;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityIron;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityKal;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityLap;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityLead;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityLem;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityLum;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityMan;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityMid;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityNaq;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityNic;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityOric;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityOsm;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityOur;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityPlat;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityPro;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityQSil;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityRub;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySIron;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySSteel;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySang;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySig;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySil;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntitySteel;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityTart;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityTin;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityVul;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityVyr;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityWood;
import com.suatae.mechinasmagick.common.tileentity.core.TileEntityZinc;
import com.suatae.mechinasmagick.utility.ConfigUtil;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockGoldCrop				= new BlockGoldCrop();
	public static final Block	blockIronCrop				= new BlockIronCrop();
	public static final Block	blockCrystalCrop			= new BlockCrystalCrop();

	public static final Block	blockLavaStone				= new BlockLavaStone();
	public static final Block	blockAncientSteppingStone	= new BlockAncientSteppingStone();
	public static final Block	blockAncientDoorB			= new BlockAncientDoorB();
	public static final Block	blockAncientDoorT			= new BlockAncientDoorT();
	public static final Block	blockAncientSeedContainer	= new BlockAncientSeedContainer();
	public static final Block	blockCatalyst				= new BlockCatalyst();

	public static final Block	blockStoneBrick				= new BlockStoneBrick();
	public static final Block	blockCobble					= new BlockCobble();
	public static final Block	blockDirt					= new BlockDirt();
	public static final Block	blockSand					= new BlockSand();
	public static final Block	blockGravel					= new BlockGravel();
	public static final Block	blockCasing					= new BlockCasing();
	public static final Block	blockBranch					= new BlockBranch();

	public static final Block	blockFlint					= new BlockFlint();
	public static final Block	blockCrystalBlock			= new BlockCrystalBlock();

	public static final Block	NS							= new BlankNS();
	public static final Block	EW							= new BlankEW();
	public static final Block	NE							= new BlankNE();
	public static final Block	SE							= new BlankSE();
	public static final Block	SW							= new BlankSW();
	public static final Block	NW							= new BlankNW();

	public static final Block	blockCache					= new BlockCache();
	public static final Block	blockCrystalOre				= new BlockCrystalOre();
	public static final Block	blockVoid					= new BlockVoid();

	// Core 00
	public static final Block	blockCoreWood				= new BlockCoreWood();
	// Core 01
	public static final Block	blockCoreAlum				= new BlockCoreAlum();
	public static final Block	blockCoreCopp				= new BlockCoreCopp();
	public static final Block	blockCoreIg					= new BlockCoreIg();
	public static final Block	blockCoreLap				= new BlockCoreLap();
	public static final Block	blockCoreLem				= new BlockCoreLem();
	public static final Block	blockCoreZinc				= new BlockCoreZinc();
	// Core 02
	public static final Block	blockCoreAlumB				= new BlockCoreAlumB();
	public static final Block	blockCoreBrass				= new BlockCoreBrass();
	public static final Block	blockCoreLum				= new BlockCoreLum();
	public static final Block	blockCoreSig				= new BlockCoreSig();
	public static final Block	blockCoreSil				= new BlockCoreSil();
	public static final Block	blockCoreTin				= new BlockCoreTin();
	// Core 03
	public static final Block	blockCoreBron				= new BlockCoreBron();
	public static final Block	blockCoreCon				= new BlockCoreCon();
	public static final Block	blockCoreDesh				= new BlockCoreDesh();
	public static final Block	blockCoreElec				= new BlockCoreElec();
	public static final Block	blockCoreHep				= new BlockCoreHep();
	public static final Block	blockCoreLead				= new BlockCoreLead();
	public static final Block	blockCoreNaq				= new BlockCoreNaq();
	public static final Block	blockCoreNic				= new BlockCoreNic();
	public static final Block	blockCoreOsm				= new BlockCoreOsm();
	// Core 04
	public static final Block	blockCoreDIron				= new BlockCoreDIron();
	public static final Block	blockCoreInv				= new BlockCoreInv();
	public static final Block	blockCoreIron				= new BlockCoreIron();
	public static final Block	blockCoreMan				= new BlockCoreMan();
	public static final Block	blockCoreSIron				= new BlockCoreSIron();
	// Core 05
	public static final Block	blockCoreAng				= new BlockCoreAng();
	public static final Block	blockCoreGold				= new BlockCoreGold();
	public static final Block	blockCoreMid				= new BlockCoreMid();
	// Core 06
	public static final Block	blockCoreDSteel				= new BlockCoreDSteel();
	public static final Block	blockCoreDia				= new BlockCoreDia();
	public static final Block	blockCoreSSteel				= new BlockCoreSSteel();
	public static final Block	blockCoreSteel				= new BlockCoreSteel();
	// Core 07
	public static final Block	blockCoreInf				= new BlockCoreInf();
	public static final Block	blockCorePro				= new BlockCorePro();
	// Core 08
	public static final Block	blockCoreBSteel				= new BlockCoreBSteel();
	// Core 09
	public static final Block	blockCoreAld				= new BlockCoreAld();
	public static final Block	blockCoreCeru				= new BlockCoreCeru();
	public static final Block	blockCorePlat				= new BlockCorePlat();
	public static final Block	blockCoreVyr				= new BlockCoreVyr();
	// Core 10
	public static final Block	blockCoreIno				= new BlockCoreIno();
	// Core 11
	public static final Block	blockCoreASil				= new BlockCoreASil();
	public static final Block	blockCoreOur				= new BlockCoreOur();
	// Core 12
	public static final Block	blockCoreExi				= new BlockCoreExi();
	public static final Block	blockCoreKal				= new BlockCoreKal();
	public static final Block	blockCoreMeu				= new BlockCoreMeu();
	public static final Block	blockCoreMith				= new BlockCoreMith();
	// Core 13
	public static final Block	blockCoreAmo				= new BlockCoreAmo();
	public static final Block	blockCoreQSil				= new BlockCoreQSil();
	// Core 14
	public static final Block	blockCoreCarm				= new BlockCoreCarm();
	public static final Block	blockCoreRub				= new BlockCoreRub();
	// Core 15
	public static final Block	blockCoreDesi				= new BlockCoreDesi();
	public static final Block	blockCoreHad				= new BlockCoreHad();
	// Core 16
	public static final Block	blockCoreOric				= new BlockCoreOric();
	public static final Block	blockCoreVul				= new BlockCoreVul();
	// Core 17
	public static final Block	blockCoreCel				= new BlockCoreCel();
	// Core 18
	public static final Block	blockCoreAdam				= new BlockCoreAdam();
	public static final Block	blockCoreSang				= new BlockCoreSang();
	// Core 19
	public static final Block	blockCoreAtl				= new BlockCoreAtl();
	// Core 20
	public static final Block	blockCoreTart				= new BlockCoreTart();

	public static final Block	blockRoadStone				= new BlockRoadStone();
	public static final Block	blockRoadStoneSlab			= new BlockRoadStoneSlab();

	public static final Block	blockRoaddirt				= new BlockRoadDirt();
	public static final Block	blockRoaddirtSlab			= new BlockRoadDirtSlab();

	public static void init() {
		GameRegistry.registerBlock(blockGoldCrop, "blockGoldCrop");
		GameRegistry.registerBlock(blockIronCrop, "blockIronCrop");
		GameRegistry.registerBlock(blockCrystalCrop, "blockCrystalCrop");

		GameRegistry.registerBlock(blockAncientSteppingStone, "blockAncientSteppingStone");
		GameRegistry.registerBlock(blockAncientDoorB, "blockAncientDoorB");
		GameRegistry.registerBlock(blockAncientDoorT, "blockAncientDoorT");
		GameRegistry.registerBlock(blockAncientSeedContainer, "blockAncientContainer");
		GameRegistry.registerBlock(blockCatalyst, "blockCatalyst");
		GameRegistry.registerBlock(blockCrystalBlock, "blockCrystalBlock");

		GameRegistry.registerBlock(blockCrystalOre, "blockCrystalOre");

		if (ConfigUtil.MachineBlocks) {
			// 00
			GameRegistry.registerBlock(blockCoreWood, "blockCoreWood");
			// 01
			GameRegistry.registerBlock(blockCoreAlum, "blockCoreAlum");
			GameRegistry.registerBlock(blockCoreCopp, "blockCoreCopp");
			GameRegistry.registerBlock(blockCoreIg, "blockCoreIg");
			GameRegistry.registerBlock(blockCoreLap, "blockCoreLap");
			GameRegistry.registerBlock(blockCoreLem, "blockCoreLem");
			GameRegistry.registerBlock(blockCoreZinc, "blockCoreZinc");
			// 02
			GameRegistry.registerBlock(blockCoreAlumB, "blockCoreAlumB");
			GameRegistry.registerBlock(blockCoreBrass, "blockCoreBrass");
			GameRegistry.registerBlock(blockCoreLum, "blockCoreLum");
			GameRegistry.registerBlock(blockCoreSig, "blockCoreSig");
			GameRegistry.registerBlock(blockCoreSil, "blockCoreSil");
			GameRegistry.registerBlock(blockCoreTin, "blockCoreTin");
			// 03
			GameRegistry.registerBlock(blockCoreBron, "blockCoreBron");
			GameRegistry.registerBlock(blockCoreCon, "blockCoreCon");
			GameRegistry.registerBlock(blockCoreDesh, "blockCoreDesh");
			GameRegistry.registerBlock(blockCoreElec, "blockCoreElec");
			GameRegistry.registerBlock(blockCoreHep, "blockCoreHep");
			GameRegistry.registerBlock(blockCoreLead, "blockCoreLead");
			GameRegistry.registerBlock(blockCoreNaq, "blockCoreNaq");
			GameRegistry.registerBlock(blockCoreNic, "blockCoreNic");
			GameRegistry.registerBlock(blockCoreOsm, "blockCoreOsm");
			// 04
			GameRegistry.registerBlock(blockCoreDIron, "blockCoreDIron");
			GameRegistry.registerBlock(blockCoreInv, "blockCoreInv");
			GameRegistry.registerBlock(blockCoreIron, "blockCoreIron");
			GameRegistry.registerBlock(blockCoreMan, "blockCoreMan");
			GameRegistry.registerBlock(blockCoreSIron, "blockCoreSIron");
			// 05
			GameRegistry.registerBlock(blockCoreAng, "blockCoreAng");
			GameRegistry.registerBlock(blockCoreGold, "blockCoreGold");
			GameRegistry.registerBlock(blockCoreMid, "blockCoreMid");
			// 06
			GameRegistry.registerBlock(blockCoreDSteel, "blockCoreDSteel");
			GameRegistry.registerBlock(blockCoreDia, "blockCoreDia");
			GameRegistry.registerBlock(blockCoreSSteel, "blockCoreSSteel");
			GameRegistry.registerBlock(blockCoreSteel, "blockCoreSteel");
			// 07
			GameRegistry.registerBlock(blockCoreInf, "blockCoreInf");
			GameRegistry.registerBlock(blockCorePro, "blockCorePro");
			// 08
			GameRegistry.registerBlock(blockCoreBSteel, "blockCoreBSteel");
			// 09
			GameRegistry.registerBlock(blockCoreAld, "blockCoreAld");
			GameRegistry.registerBlock(blockCoreCeru, "blockCoreCeru");
			GameRegistry.registerBlock(blockCorePlat, "blockCorePlat");
			GameRegistry.registerBlock(blockCoreVyr, "blockCoreVyr");
			// 10
			GameRegistry.registerBlock(blockCoreIno, "blockCoreIno");
			// 11
			GameRegistry.registerBlock(blockCoreASil, "blockCoreASil");
			GameRegistry.registerBlock(blockCoreOur, "blockCoreOur");
			// 12
			GameRegistry.registerBlock(blockCoreExi, "blockCoreExi");
			GameRegistry.registerBlock(blockCoreKal, "blockCoreKal");
			GameRegistry.registerBlock(blockCoreMeu, "blockCoreMeu");
			GameRegistry.registerBlock(blockCoreMith, "blockCoreMith");
			// 13
			GameRegistry.registerBlock(blockCoreAmo, "blockCoreAmo");
			GameRegistry.registerBlock(blockCoreQSil, "blockCoreQSil");
			// 14
			GameRegistry.registerBlock(blockCoreCarm, "blockCoreCarm");
			GameRegistry.registerBlock(blockCoreRub, "blockCoreRub");
			// 15
			GameRegistry.registerBlock(blockCoreDesi, "blockCoreDesi");
			GameRegistry.registerBlock(blockCoreHad, "blockCoreHad");
			// 16
			GameRegistry.registerBlock(blockCoreOric, "blockCoreOric");
			GameRegistry.registerBlock(blockCoreVul, "blockCoreVul");
			// 17
			GameRegistry.registerBlock(blockCoreCel, "blockCoreCel");
			// 18
			GameRegistry.registerBlock(blockCoreAdam, "blockCoreAdam");
			GameRegistry.registerBlock(blockCoreSang, "blockCoreSang");
			// 19
			GameRegistry.registerBlock(blockCoreAtl, "blockCoreAtl");
			// 20
			GameRegistry.registerBlock(blockCoreTart, "blockCoreTart");
		}
		else {

		}

		if (ConfigUtil.FlintModule) {
			GameRegistry.registerBlock(NS, "NS");
			GameRegistry.registerBlock(EW, "EW");
			GameRegistry.registerBlock(NE, "NE");
			GameRegistry.registerBlock(SE, "SE");
			GameRegistry.registerBlock(SW, "SW");
			GameRegistry.registerBlock(NW, "NW");
		}
		else {

		}

		if (ConfigUtil.BedRockModule) {
			GameRegistry.registerBlock(blockVoid, "blockVoid");
		}
		else {

		}

		if (ConfigUtil.LavaModule) {
			GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
		}
		else {

		}

		if (ConfigUtil.BranchModule) {
			GameRegistry.registerBlock(blockBranch, "blockBranch");
		}
		else {

		}

		if (ConfigUtil.RoadModule) {
			GameRegistry.registerBlock(blockRoadStone, "blockRoadStone");
			GameRegistry.registerBlock(blockRoadStoneSlab, "blockRoadStoneSlab");

			GameRegistry.registerBlock(blockRoaddirt, "blockRoaddirt");
			GameRegistry.registerBlock(blockRoaddirtSlab, "blockRoaddirtSlab");
		}
		else {

		}

		// TileEntities
		GameRegistry.registerTileEntity(TileEntityAncientContainer.class,
				"TileEntityAncientContainer");
		GameRegistry.registerTileEntity(TileEntityCatalyst.class, "TileEntityCatalyst");
		GameRegistry.registerTileEntity(TileEntityCasing.class, "TileEntityGoldCasing");
		GameRegistry.registerTileEntity(TileEntityGoldCrop.class, "TileEntityGoldCrop");
		GameRegistry.registerTileEntity(TileEntityIronCrop.class, "TileEntityIronCrop");
		GameRegistry.registerTileEntity(TileEntityCrystalCrop.class, "TileEntityCrystalCrop");
		GameRegistry.registerTileEntity(TileEntityAncientDoorB.class, "TileEntityAncientDoorB");
		GameRegistry.registerTileEntity(TileEntityAncientDoorT.class, "TileEntityAncientDoorT");
		GameRegistry.registerTileEntity(TileEntityOreE.class, "TileEntityOreE");

		if (ConfigUtil.MachineBlocks) {
			GameRegistry.registerTileEntity(TileEntityAdam.class, "TileEntityAdam");
			GameRegistry.registerTileEntity(TileEntityAld.class, "TileEntityAld");
			GameRegistry.registerTileEntity(TileEntityAlum.class, "TileEntityAlum");
			GameRegistry.registerTileEntity(TileEntityAlumB.class, "TileEntityAlumB");
			GameRegistry.registerTileEntity(TileEntityAmo.class, "TileEntityAmo");
			GameRegistry.registerTileEntity(TileEntityAng.class, "TileEntityAng");
			GameRegistry.registerTileEntity(TileEntityASil.class, "TileEntityASil");
			GameRegistry.registerTileEntity(TileEntityAtl.class, "TileEntityAtl");
			GameRegistry.registerTileEntity(TileEntityBrass.class, "TileEntityBrass");
			GameRegistry.registerTileEntity(TileEntityBron.class, "TileEntityBron");
			GameRegistry.registerTileEntity(TileEntityBSteel.class, "TileEntityBSteel");
			GameRegistry.registerTileEntity(TileEntityCarm.class, "TileEntityCarm");
			GameRegistry.registerTileEntity(TileEntityCel.class, "TileEntityCel");
			GameRegistry.registerTileEntity(TileEntityCeru.class, "TileEntityCeru");
			GameRegistry.registerTileEntity(TileEntityCon.class, "TileEntityCon");
			GameRegistry.registerTileEntity(TileEntityCopp.class, "TileEntityCopp");
			GameRegistry.registerTileEntity(TileEntityDesh.class, "TileEntityDesh");
			GameRegistry.registerTileEntity(TileEntityDesi.class, "TileEntityDesi");
			GameRegistry.registerTileEntity(TileEntityDia.class, "TileEntityDia");
			GameRegistry.registerTileEntity(TileEntityDIron.class, "TileEntityDIron");
			GameRegistry.registerTileEntity(TileEntityDSteel.class, "TileEntityDSteel");
			GameRegistry.registerTileEntity(TileEntityElec.class, "TileEntityElec");
			GameRegistry.registerTileEntity(TileEntityExi.class, "TileEntityExi");
			GameRegistry.registerTileEntity(TileEntityGold.class, "TileEntityGold");
			GameRegistry.registerTileEntity(TileEntityHad.class, "TileEntityHad");
			GameRegistry.registerTileEntity(TileEntityHep.class, "TileEntityHep");
			GameRegistry.registerTileEntity(TileEntityIg.class, "TileEntityIg");
			GameRegistry.registerTileEntity(TileEntityInf.class, "TileEntityInf");
			GameRegistry.registerTileEntity(TileEntityIno.class, "TileEntityIno");
			GameRegistry.registerTileEntity(TileEntityInv.class, "TileEntityInv");
			GameRegistry.registerTileEntity(TileEntityIron.class, "TileEntityIron");
			GameRegistry.registerTileEntity(TileEntityKal.class, "TileEntityKal");
			GameRegistry.registerTileEntity(TileEntityLap.class, "TileEntityLap");
			GameRegistry.registerTileEntity(TileEntityLead.class, "TileEntityLead");
			GameRegistry.registerTileEntity(TileEntityLem.class, "TileEntityLem");
			GameRegistry.registerTileEntity(TileEntityLum.class, "TileEntityLum");
			GameRegistry.registerTileEntity(TileEntityMan.class, "TileEntityMan");
			GameRegistry.registerTileEntity(TileEntityMid.class, "TileEntityMid");
			GameRegistry.registerTileEntity(TileEntityNaq.class, "TileEntityNaq");
			GameRegistry.registerTileEntity(TileEntityNic.class, "TileEntityNic");
			GameRegistry.registerTileEntity(TileEntityOric.class, "TileEntityOric");
			GameRegistry.registerTileEntity(TileEntityOsm.class, "TileEntityOsm");
			GameRegistry.registerTileEntity(TileEntityOur.class, "TileEntityOur");
			GameRegistry.registerTileEntity(TileEntityPlat.class, "TileEntityPlat");
			GameRegistry.registerTileEntity(TileEntityPro.class, "TileEntityPro");
			GameRegistry.registerTileEntity(TileEntityQSil.class, "TileEntityQSil");
			GameRegistry.registerTileEntity(TileEntityRub.class, "TileEntityRub");
			GameRegistry.registerTileEntity(TileEntitySang.class, "TileEntitySang");
			GameRegistry.registerTileEntity(TileEntitySig.class, "TileEntitySig");
			GameRegistry.registerTileEntity(TileEntitySil.class, "TileEntitySil");
			GameRegistry.registerTileEntity(TileEntitySIron.class, "TileEntitySIron");
			GameRegistry.registerTileEntity(TileEntitySSteel.class, "TileEntitySSteel");
			GameRegistry.registerTileEntity(TileEntitySteel.class, "TileEntitySteel");
			GameRegistry.registerTileEntity(TileEntityTart.class, "TileEntityTart");
			GameRegistry.registerTileEntity(TileEntityTin.class, "TileEntityTin");
			GameRegistry.registerTileEntity(TileEntityVul.class, "TileEntityVul");
			GameRegistry.registerTileEntity(TileEntityVyr.class, "TileEntityVyr");
			GameRegistry.registerTileEntity(TileEntityWood.class, "TileEntityWood");
			GameRegistry.registerTileEntity(TileEntityZinc.class, "TileEntityZinc");
		}
		else {

		}

		if (ConfigUtil.FlintModule) {
			GameRegistry.registerTileEntity(TileEntityFlint.class, "TileEntityFlint01");
		}
		else {

		}

		if (ConfigUtil.BranchModule) {
			GameRegistry.registerTileEntity(TileEntityBranch.class, "TileEntityBranch");
		}
		else {

		}

		if (ConfigUtil.RoadModule) {
			GameRegistry.registerTileEntity(TileEntityRoad.class, "TileEntityRoad");
		}
		else {

		}

		if (ConfigUtil.CacheModule) {
			GameRegistry.registerTileEntity(TileEntityCache.class, "TileEntityCache");
		}
		else {

		}

		GameRegistry.registerBlock(blockStoneBrick, ItemBlockStoneBrick.class, "blockStoneBrick");
		GameRegistry.registerBlock(blockCasing, ItemBlockCasing.class, "blockCasing");
		if (ConfigUtil.FlintModule) {
			GameRegistry.registerBlock(blockFlint, ItemBlockFlint.class, "blockFlint");
		}
		else {

		}
		if (ConfigUtil.CompressedModule) {
			GameRegistry.registerBlock(blockCobble, ItemBlockCompressed.class, "blockCobble");
			GameRegistry.registerBlock(blockDirt, ItemBlockCompressed.class, "blockDirt");
			GameRegistry.registerBlock(blockSand, ItemBlockCompressed.class, "blockSand");
			GameRegistry.registerBlock(blockGravel, ItemBlockCompressed.class, "blockGravel");
		}
		else {

		}

		if (ConfigUtil.CacheModule) {
			GameRegistry.registerBlock(blockCache, ItemBlockCache.class, "blockCache");
		}
		else {

		}

	}
}
