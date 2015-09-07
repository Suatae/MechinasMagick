package com.suatae.mechinasmagick.common.core.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;





public class REF {
	public static final String	MOD_ID				= "MechinasMagick";
	public static final String	MOD_NAME			= "Mechinas Magick";
	public static final String	VERSION				= "1.7.10-1.29";
	public static final String	CLIENTSIDE			= "com.suatae.mechinasmagick.proxy.ClientProxy";
	public static final String	SERVERSIDE			= "com.suatae.mechinasmagick.proxy.ServerProxy";
	public static final String	GUI_FACTORY_CLASS	= "com.suatae.mechinasmagick.client.gui.MMGuiFactory";

	public static class CACHEDROP {
		public static class LVL01 {
			public static final Item	d01	= Items.bone;
			public static final Item	d02	= Items.string;
			public static final Item	d03	= Items.cookie;
			public static final Item	d04	= Items.reeds;
			public static final Item	d05	= Items.carrot;
			public static final Item	d06	= Items.baked_potato;
			public static final Item	d07	= Items.poisonous_potato;
			public static final Item	d08	= Items.rotten_flesh;
			public static final Item	d09	= Items.melon_seeds;
			public static final Item	d10	= Items.pumpkin_seeds;
		}

		public static class LVL02 {
			public static final Item	D01	= Items.map;
			public static final Item	D02	= Items.ender_pearl;
			public static final Item	D03	= Items.blaze_rod;
			public static final Item	D04	= Items.leather;
			public static final Item	D05	= Items.glowstone_dust;
			public static final Item	D06	= Items.iron_ingot;
			public static final Item	D07	= Items.iron_horse_armor;
		}

		public static class LVL03 {
			public static final Item	D01	= Items.diamond;
			public static final Item	D02	= Items.lead;
			public static final Item	D03	= Items.golden_apple;
			public static final Item	D04	= Items.nether_wart;
			public static final Item	D05	= Items.golden_horse_armor;
		}

		public static class LVL04 {
			public static final Item	D01	= Items.ghast_tear;
			public static final Item	D02	= Items.redstone;
			public static final Item	D03	= Items.diamond_horse_armor;
		}

		public static class LVL05 {
			public static final Item	D01	= Items.nether_star;
		}
	}

	public static class BLOCK {
		public final static Block	stone	= Blocks.stonebrick;
		public final static Block	stone01	= Blocks.stone;
		public final static Block	log		= Blocks.log;
		public final static Block	sand	= Blocks.sand;
		public final static Block	dirt	= Blocks.dirt;
		public final static Block	grass	= Blocks.grass;
		public final static Block	mush	= Blocks.mycelium;
		public final static Block	gold	= Blocks.gold_block;
		public final static Block	air		= Blocks.air;
		public final static Block	nether	= Blocks.netherrack;
		public final static Block	fire	= Blocks.fire;
		public final static Block	lava	= Blocks.lava;
		public final static Block	gravel	= Blocks.gravel;
		public final static Block	lavaS	= BlockReg.blockLavaStone;

		public static class PILLAR {
			public final static Block	Main		= Blocks.stonebrick;
			public final static Block	Design		= BlockReg.blockStoneBrick;
			public final static Block	Glyph		= BlockReg.blockStoneBrick;
			public final static Block	Core		= BlockReg.blockAncientSeedContainer;
			public final static Block	Catalyst	= BlockReg.blockCatalyst;
			public final static Block	Step		= BlockReg.blockAncientSteppingStone;
			public final static Block	DoorT		= BlockReg.blockAncientDoorT;
			public final static Block	DoorB		= BlockReg.blockAncientDoorB;
		}

		public static class SEED {
			public final static Block	SOIL	= BlockReg.blockCatalyst;

			public static class GOLD {
				public final static Block	PLANT		= BlockReg.blockGoldCrop;
				public final static Block	CAP			= Blocks.gold_block;
				public final static Block	ACTIVATOR	= Blocks.air;
			}

			public static class IRON {
				public final static Block	PLANT		= BlockReg.blockIronCrop;
				public final static Block	CAP			= Blocks.iron_block;
				public final static Block	ACTIVATOR	= Blocks.air;

			}

		}

	}

	public static class ITEM {

	}

	public static class NAME {
		public static class ITEM {

			// Seed
			public final static String	SEED		= "itemSeed";

			// Gold Seed
			public final static String	SEEDGP		= "itemSeedPrimedGold";
			public final static String	FRUITG		= "fruitAncientGold";

			// Iron Seed
			public final static String	SEEDIP		= "itemSeedPrimedIron";
			public final static String	FRUITI		= "fruitAncientIron";

			// Crystal Seed
			public final static String	CRYSTAL		= "itemCrystal";

			// Tools
			public final static String	WMALLET		= "woodMallet";
			public final static String	SMallet		= "stoneMallet";
			public final static String	ISMallet	= "ironsteelMallet";

			// MIsc
			public final static String	LEAF		= "itemLeaf";
			public final static String	BRANCH		= "itemBranch";

			// Player Class
			public final static String	BUILDER		= "itemBuilder";
			public final static String	MAGE		= "itemMage";
			public final static String	ENGINEER	= "itemEngineer";
		}

		public static class BLOCK {

			// Gold Plant
			public final static String	GOLD			= "blockGoldCrop";
			public final static String	GOLD00			= "MechinasMagick:blockGoldCrop_0";

			// Iron PLant
			public final static String	IRON			= "blockIronCrop";
			public final static String	IRON00			= "MechinasMagick:blockIronCrop_0";

			// Dark Crystal Plant
			public final static String	CRYSTAL			= "blockCrystalCrop";
			public final static String	CRYSTAL00		= "MechinasMagick:blockCrystalCrop";

			// Flint
			public final static String	flint			= "blockFlint";
			public final static String	flint00			= "MechinasMagick:blockFlint";

			public final static String	nul				= "null";

			// Lava Stone
			public final static String	LAVA			= "blockLavaStone";

			// Ancient Blocks
			public final static String	ASTEPPING		= "blockAncientSteppingStone";
			public final static String	ADOOR			= "blockAncientDoor";
			public final static String	ASContainer		= "blockAncientSeedContainer";
			public final static String	BRICK			= "blockStoneBrick";
			public final static String	iBRICK			= "MechinasMagick:StoneBrick";
			public final static String	CATALYST		= "blockCatalyst";
			public final static String	Casing			= "blockCasing";
			public final static String	iCasing			= "MechinasMagick:blockCasing";
			public static final String	cache			= "blockCache";
			public static final String	icache			= "MechinasMagick:blockCache";
			public final static String	CRYSTALblock	= "blockCrystalBlock";

			// Misc
			public final static String	BRANCH			= "blockBranch";
			public final static String	crystalORE		= "blockCrystalOre";
			public final static String	VOID			= "blockVoid";
			public final static String	DIRT			= "blockHardenedDirt";

			// Core 00
			public final static String	cWood			= "blockCoreWood";
			// Core 01
			public final static String	cAlum			= "blockCoreAlum";
			public final static String	cCopp			= "blockCoreCopp";
			public final static String	cIg				= "blockCoreIg";
			public final static String	cLap			= "blockCoreLap";
			public final static String	cLem			= "blockCoreLem";
			public final static String	cZinc			= "blockCoreZinc";
			// Core 02
			public final static String	cAlumB			= "blockCoreAlumB";
			public final static String	cBrass			= "blockCoreBrass";
			public final static String	cLum			= "blockCoreLum";
			public final static String	cSig			= "blockCoreSig";
			public final static String	cSil			= "blockCoreSil";
			public final static String	cTin			= "blockCoreTin";
			// Core 03
			public final static String	cBron			= "blockCoreBron";
			public final static String	cCon			= "blockCoreCon";
			public final static String	cDesh			= "blockCoreDesh";
			public final static String	cElec			= "blockCoreElec";
			public final static String	cHep			= "blockCoreHep";
			public final static String	cLead			= "blockCoreLead";
			public final static String	cNaq			= "blockCoreNaq";
			public final static String	cNic			= "blockCoreNic";
			public final static String	cOsm			= "blockCoreOsm";
			// Core 04
			public final static String	cDiron			= "blockCoreDIron";
			public final static String	cInv			= "blockCoreInv";
			public final static String	cIron			= "blockCoreIron";
			public final static String	cMan			= "blockCoreMan";
			public final static String	cSiron			= "blockCoreSIron";
			// Core 05
			public final static String	cAng			= "blockCoreAng";
			public final static String	cGold			= "blockCoreGold";
			public final static String	cMid			= "blockCoreMid";
			// Core 06
			public final static String	cDSteel			= "blockCoreDSteel";
			public final static String	cDia			= "blockCoreDia";
			public final static String	cSSteel			= "blockCoreSSteel";
			public final static String	cSteel			= "blockCoreSteel";
			// Core 07
			public final static String	cInf			= "blockCoreInf";
			public final static String	cPro			= "blockCorePro";
			// Core 08
			public final static String	cBSteel			= "blockCoreBSteel";
			// Core 09
			public final static String	cAld			= "blockCoreAld";
			public final static String	cCeru			= "blockCoreCeru";
			public final static String	cPlat			= "blockCorePlat";
			public final static String	cVyr			= "blockCoreVyr";
			// Core 10
			public final static String	cIno			= "blockCoreIno";
			// Core 11
			public final static String	cASil			= "blockCoreASil";
			public final static String	cOur			= "blockCoreOur";
			// Core 12
			public final static String	cExi			= "blockCoreExi";
			public final static String	cKal			= "blockCoreKal";
			public final static String	cMeu			= "blockCoreMeu";
			public final static String	cMith			= "blockCoreMith";
			// Core 13
			public final static String	cAmo			= "blockCoreAmo";
			public final static String	cQSil			= "blockCoreQSil";
			// Core 14
			public final static String	cCarm			= "blockCoreCarm";
			public final static String	cRub			= "blockCoreRub";
			// Core 15
			public final static String	cDesi			= "blockCoreDesi";
			public final static String	cHad			= "blockCoreHad";
			// Core 16
			public final static String	cOric			= "blockCoreOric";
			public final static String	cVul			= "blockCoreVul";
			// Core 17
			public final static String	cCel			= "blockCoreCel";
			// Core 18
			public final static String	cAdam			= "blockCoreAdam";
			public final static String	cSang			= "blockCoreSang";
			// Core 19
			public final static String	cAtl			= "blockCoreAtl";
			// Core 20
			public final static String	cTart			= "blockCoreTart";

			public final static String	ROADStone		= "blockRoadStone";
			public final static String	ROADStoneslab	= "blockRoadStoneSlab";
			public final static String	ROADdirt		= "blockRoaddirt";
			public final static String	ROADdirtslab	= "blockRoaddirtSlab";

			public final static String	dirt1			= "blockDirt1";
			public final static String	dirt2			= "blockDirt2";
			public final static String	dirt3			= "blockDirt3";
			public final static String	dirt4			= "blockDirt4";
			public final static String	dirt5			= "blockDirt5";
			public final static String	dirt6			= "blockDirt6";
			public final static String	dirt7			= "blockDirt7";
			public final static String	dirt8			= "blockDirt8";

			public final static String	sand1			= "blockSand1";
			public final static String	sand2			= "blockSand2";
			public final static String	sand3			= "blockSand3";
			public final static String	sand4			= "blockSand4";
			public final static String	sand5			= "blockSand5";
			public final static String	sand6			= "blockSand6";
			public final static String	sand7			= "blockSand7";
			public final static String	sand8			= "blockSand8";

			public final static String	gravel1			= "blockGravel1";
			public final static String	gravel2			= "blockGravel2";
			public final static String	gravel3			= "blockGravel3";
			public final static String	gravel4			= "blockGravel4";
			public final static String	gravel5			= "blockGravel5";
			public final static String	gravel6			= "blockGravel6";
			public final static String	gravel7			= "blockGravel7";
			public final static String	gravel8			= "blockGravel8";

			public final static String	cobble			= "blockCobble";
			public final static String	icobble			= "MechinasMagick:blockCobble";
			public final static String	dirt			= "blockDirt";
			public final static String	idirt			= "MechinasMagick:blockDirt";
			public final static String	sand			= "blockSand";
			public final static String	isand			= "MechinasMagick:blockSand";
			public final static String	gravel			= "blockGravel";
			public final static String	igravel			= "MechinasMagick:blockGravel";
		}

	}

	public static class SOUND {
		public final static String	FAIL01		= "random.break";
		public final static String	FAIL02		= "random.break";
		public final static String	FAIL03		= "random.pop";
		public final static String	SUCCESS01	= "mob.zombie.unfect";
		public final static String	SUCCESS02	= "random.successful_hit";
		public final static String	LAVASTONE	= "liquid.lavapop";
		public final static String	MALLETHIT	= "random.anvil_land";
	}

}
