package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.TESRAncientDoorB;
import com.suatae.mechinasmagick.client.renders.TESRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.TESRBlockCache;
import com.suatae.mechinasmagick.client.renders.TESRBranch;
import com.suatae.mechinasmagick.client.renders.TESRCasing;
import com.suatae.mechinasmagick.client.renders.TESRCatalyst;
import com.suatae.mechinasmagick.client.renders.TESRCrystalCrop;
import com.suatae.mechinasmagick.client.renders.TESRCrystalOre;
import com.suatae.mechinasmagick.client.renders.TESRGoldCrop;
import com.suatae.mechinasmagick.client.renders.TESRIronCrop;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreASil;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAdam;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAld;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAlum;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAlumB;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAmo;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAng;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreAtl;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreBSteel;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreBrass;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreBron;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreCarm;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreCel;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreCeru;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreCon;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreCopp;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreDIron;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreDSteel;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreDesh;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreDesi;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreDia;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreElec;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreExi;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreGold;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreHad;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreHep;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreIg;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreInf;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreIno;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreInv;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreIron;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreKal;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreLap;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreLead;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreLem;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreLum;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreMan;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreMeu;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreMid;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreMith;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreNaq;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreNic;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreOric;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreOsm;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreOur;
import com.suatae.mechinasmagick.client.renders.core.TESRCorePlat;
import com.suatae.mechinasmagick.client.renders.core.TESRCorePro;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreQSil;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreRub;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSIron;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSSteel;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSang;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSig;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSil;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreSteel;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreTart;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreTin;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreVul;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreVyr;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreWood;
import com.suatae.mechinasmagick.client.renders.core.TESRCoreZinc;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint;
import com.suatae.mechinasmagick.client.renders.ir.IRFruitGold;
import com.suatae.mechinasmagick.client.renders.ir.IRFruitIron;
import com.suatae.mechinasmagick.client.renders.ir.IRSeed;
import com.suatae.mechinasmagick.client.renders.ir.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRAncientDoorB;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRBranch;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCache;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCatalyst;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCore;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IROreE;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCache;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCasing;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCrystalCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityFlint;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityMeu;
import com.suatae.mechinasmagick.common.tileentity.TileEntityMith;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;
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

import cpw.mods.fml.client.registry.ClientRegistry;





public class ClientProxy extends CommonProxy {

	TileEntitySpecialRenderer	adb			= new TESRAncientDoorB();
	TileEntitySpecialRenderer	asc			= new TESRAncientSeedContainer();
	TileEntitySpecialRenderer	b			= new TESRBranch();
	TileEntitySpecialRenderer	c			= new TESRCatalyst();
	TileEntitySpecialRenderer	c1			= new TESRCasing();
	TileEntitySpecialRenderer	c2			= new TESRBlockCache();
	TileEntitySpecialRenderer	dc			= new TESRCrystalCrop();
	TileEntitySpecialRenderer	f1			= new TESRBlockFlint();
	TileEntitySpecialRenderer	gc			= new TESRGoldCrop();
	TileEntitySpecialRenderer	ic			= new TESRIronCrop();
	TileEntitySpecialRenderer	o			= new TESRCrystalOre();

	// 00
	TileEntitySpecialRenderer	coreWood	= new TESRCoreWood();
	// 01
	TileEntitySpecialRenderer	coreAlum	= new TESRCoreAlum();
	TileEntitySpecialRenderer	coreCopp	= new TESRCoreCopp();
	TileEntitySpecialRenderer	coreIg		= new TESRCoreIg();
	TileEntitySpecialRenderer	coreLap		= new TESRCoreLap();
	TileEntitySpecialRenderer	coreLem		= new TESRCoreLem();
	TileEntitySpecialRenderer	coreZinc	= new TESRCoreZinc();
	// 02
	TileEntitySpecialRenderer	coreAlumB	= new TESRCoreAlumB();
	TileEntitySpecialRenderer	coreBrass	= new TESRCoreBrass();
	TileEntitySpecialRenderer	coreLum		= new TESRCoreLum();
	TileEntitySpecialRenderer	coreSig		= new TESRCoreSig();
	TileEntitySpecialRenderer	coreSil		= new TESRCoreSil();
	TileEntitySpecialRenderer	coreTin		= new TESRCoreTin();
	// 03
	TileEntitySpecialRenderer	coreBron	= new TESRCoreBron();
	TileEntitySpecialRenderer	coreCon		= new TESRCoreCon();
	TileEntitySpecialRenderer	coreDesh	= new TESRCoreDesh();
	TileEntitySpecialRenderer	coreElec	= new TESRCoreElec();
	TileEntitySpecialRenderer	coreHep		= new TESRCoreHep();
	TileEntitySpecialRenderer	coreLead	= new TESRCoreLead();
	TileEntitySpecialRenderer	coreNaq		= new TESRCoreNaq();
	TileEntitySpecialRenderer	coreNic		= new TESRCoreNic();
	TileEntitySpecialRenderer	coreOsm		= new TESRCoreOsm();
	// 04
	TileEntitySpecialRenderer	coreDIron	= new TESRCoreDIron();
	TileEntitySpecialRenderer	coreInv		= new TESRCoreInv();
	TileEntitySpecialRenderer	coreIron	= new TESRCoreIron();
	TileEntitySpecialRenderer	coreMan		= new TESRCoreMan();
	TileEntitySpecialRenderer	coreSIron	= new TESRCoreSIron();
	// 05
	TileEntitySpecialRenderer	coreAng		= new TESRCoreAng();
	TileEntitySpecialRenderer	coreGold	= new TESRCoreGold();
	TileEntitySpecialRenderer	coreMid		= new TESRCoreMid();
	// 06
	TileEntitySpecialRenderer	coreDSteel	= new TESRCoreDSteel();
	TileEntitySpecialRenderer	coreDia		= new TESRCoreDia();
	TileEntitySpecialRenderer	coreSSteel	= new TESRCoreSSteel();
	TileEntitySpecialRenderer	coreSteel	= new TESRCoreSteel();
	// 07
	TileEntitySpecialRenderer	coreInf		= new TESRCoreInf();
	TileEntitySpecialRenderer	corePro		= new TESRCorePro();
	// 08
	TileEntitySpecialRenderer	coreBSteel	= new TESRCoreBSteel();
	// 09
	TileEntitySpecialRenderer	coreAld		= new TESRCoreAld();
	TileEntitySpecialRenderer	coreCeru	= new TESRCoreCeru();
	TileEntitySpecialRenderer	corePlat	= new TESRCorePlat();
	TileEntitySpecialRenderer	coreVyr		= new TESRCoreVyr();
	// 10
	TileEntitySpecialRenderer	coreIno		= new TESRCoreIno();
	// 11
	TileEntitySpecialRenderer	coreASil	= new TESRCoreASil();
	TileEntitySpecialRenderer	coreOur		= new TESRCoreOur();
	// 12
	TileEntitySpecialRenderer	coreExi		= new TESRCoreExi();
	TileEntitySpecialRenderer	coreKal		= new TESRCoreKal();
	TileEntitySpecialRenderer	coreMeu		= new TESRCoreMeu();
	TileEntitySpecialRenderer	coreMith	= new TESRCoreMith();
	// 13
	TileEntitySpecialRenderer	coreAmo		= new TESRCoreAmo();
	TileEntitySpecialRenderer	coreQSil	= new TESRCoreQSil();
	// 14
	TileEntitySpecialRenderer	coreCarm	= new TESRCoreCarm();
	TileEntitySpecialRenderer	coreRub		= new TESRCoreRub();
	// 15
	TileEntitySpecialRenderer	coreDesi	= new TESRCoreDesi();
	TileEntitySpecialRenderer	coreHad		= new TESRCoreHad();
	// 16
	TileEntitySpecialRenderer	coreOric	= new TESRCoreOric();
	TileEntitySpecialRenderer	coreVul		= new TESRCoreVul();
	// 17
	TileEntitySpecialRenderer	coreCel		= new TESRCoreCel();
	// 18
	TileEntitySpecialRenderer	coreAdam	= new TESRCoreAdam();
	TileEntitySpecialRenderer	coreSang	= new TESRCoreSang();
	// 19
	TileEntitySpecialRenderer	coreAtl		= new TESRCoreAtl();
	// 20
	TileEntitySpecialRenderer	coreTart	= new TESRCoreTart();

	@Override
	public void registerTESRender() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientContainer.class, asc);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientDoorB.class, adb);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBranch.class, b);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatalyst.class, c);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCasing.class, c1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCache.class, c2);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystalCrop.class, dc);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint.class, f1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCrop.class, gc);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCrop.class, ic);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOreE.class, o);

		// 00
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWood.class, coreWood);
		// 01
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlum.class, coreAlum);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopp.class, coreCopp);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIg.class, coreIg);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLap.class, coreLap);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLem.class, coreLem);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityZinc.class, coreZinc);
		// 02
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlumB.class, coreAlumB);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBrass.class, coreBrass);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLum.class, coreLum);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySig.class, coreSig);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySil.class, coreSil);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTin.class, coreTin);
		// 03
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBron.class, coreBron);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCon.class, coreCon);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDesh.class, coreDesh);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityElec.class, coreElec);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHep.class, coreHep);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLead.class, coreLead);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNaq.class, coreNaq);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNic.class, coreNic);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOsm.class, coreOsm);
		// 04
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDIron.class, coreDIron);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInv.class, coreInv);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIron.class, coreIron);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMan.class, coreMan);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySIron.class, coreSIron);
		// 05
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAng.class, coreAng);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGold.class, coreGold);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMid.class, coreMid);
		// 06
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDSteel.class, coreDSteel);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDia.class, coreDia);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySSteel.class, coreSSteel);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySteel.class, coreSteel);
		// 07
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInf.class, coreInf);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPro.class, corePro);
		// 08
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBSteel.class, coreBSteel);
		// 09
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAld.class, coreAld);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCeru.class, coreCeru);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlat.class, corePlat);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVyr.class, coreVyr);
		// 10
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIno.class, coreIno);
		// 11
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityASil.class, coreASil);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOur.class, coreOur);
		// 12
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExi.class, coreExi);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKal.class, coreKal);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMeu.class, coreMeu);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMith.class, coreMith);
		// 13
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmo.class, coreAmo);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityQSil.class, coreQSil);
		// 14
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCarm.class, coreCarm);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRub.class, coreRub);
		// 15
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDesi.class, coreDesi);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHad.class, coreHad);
		// 16
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOric.class, coreOric);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVul.class, coreVul);
		// 17
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCel.class, coreCel);
		// 18
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAdam.class, coreAdam);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySang.class, coreSang);
		// 19
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAtl.class, coreAtl);
		// 20
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTart.class, coreTart);

	}

	@Override
	public void registerItemRender() {

		// Items
		MinecraftForgeClient.registerItemRenderer(ItemReg.woodMallet, new IRToolWoodMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.stoneMallet, new IRToolStoneMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.ironsteelMallet,
				new IRToolIronSteelMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.itemSeed, new IRSeed());
		MinecraftForgeClient.registerItemRenderer(ItemReg.itemAncientFruitGold, new IRFruitGold());
		MinecraftForgeClient.registerItemRenderer(ItemReg.itemAncientFruitIron, new IRFruitIron());

		// 00
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreWood),
				new IRCore(coreWood, new TileEntityWood()));
		// 01
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAlum),
				new IRCore(coreAlum, new TileEntityAlum()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreCopp),
				new IRCore(coreCopp, new TileEntityCopp()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreIg),
				new IRCore(coreIg, new TileEntityIg()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreLap),
				new IRCore(coreLap, new TileEntityLap()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreLem),
				new IRCore(coreLem, new TileEntityLem()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreZinc),
				new IRCore(coreZinc, new TileEntityZinc()));
		// 02
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAlumB),
				new IRCore(coreAlumB, new TileEntityAlumB()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreBrass),
				new IRCore(coreBrass, new TileEntityBrass()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreLum),
				new IRCore(coreLum, new TileEntityLum()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSig),
				new IRCore(coreSig, new TileEntitySig()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSil),
				new IRCore(coreSil, new TileEntitySil()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreTin),
				new IRCore(coreTin, new TileEntityTin()));
		// 03
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreBron),
				new IRCore(coreBron, new TileEntityBron()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreCon),
				new IRCore(coreCon, new TileEntityCon()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreDesh),
				new IRCore(coreDesh, new TileEntityDesh()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreElec),
				new IRCore(coreElec, new TileEntityElec()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreHep),
				new IRCore(coreHep, new TileEntityHep()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreLead),
				new IRCore(coreLead, new TileEntityLead()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreNaq),
				new IRCore(coreNaq, new TileEntityNaq()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreNic),
				new IRCore(coreNic, new TileEntityNic()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreOsm),
				new IRCore(coreOsm, new TileEntity()));
		// 04
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreDIron),
				new IRCore(coreDIron, new TileEntityDIron()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreInv),
				new IRCore(coreInv, new TileEntityInv()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreIron),
				new IRCore(coreIron, new TileEntityIron()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreMan),
				new IRCore(coreMan, new TileEntityMan()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSIron),
				new IRCore(coreSIron, new TileEntitySIron()));
		// 05
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAng),
				new IRCore(coreAng, new TileEntityAng()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreGold),
				new IRCore(coreGold, new TileEntityGold()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreMid),
				new IRCore(coreMid, new TileEntityMid()));
		// 06
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreDSteel),
				new IRCore(coreDSteel, new TileEntityDSteel()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreDia),
				new IRCore(coreDia, new TileEntityDia()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSSteel),
				new IRCore(coreSSteel, new TileEntitySSteel()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSteel),
				new IRCore(coreSteel, new TileEntitySteel()));
		// 07
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreInf),
				new IRCore(coreInf, new TileEntityInf()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCorePro),
				new IRCore(corePro, new TileEntityPro()));
		// 08
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreBSteel),
				new IRCore(coreBSteel, new TileEntityBSteel()));
		// 09
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAld),
				new IRCore(coreAld, new TileEntityAld()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreCeru),
				new IRCore(coreCeru, new TileEntityCeru()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCorePlat),
				new IRCore(corePlat, new TileEntityPlat()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreVyr),
				new IRCore(coreVyr, new TileEntityVyr()));
		// 10
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreIno),
				new IRCore(coreIno, new TileEntityIno()));
		// 11
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreASil),
				new IRCore(coreASil, new TileEntityASil()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreOur),
				new IRCore(coreOur, new TileEntityOur()));
		// 12
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreExi),
				new IRCore(coreExi, new TileEntityExi()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreKal),
				new IRCore(coreKal, new TileEntityKal()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreMeu),
				new IRCore(coreMeu, new TileEntityMeu()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreMith),
				new IRCore(coreMith, new TileEntityMith()));
		// 13
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAmo),
				new IRCore(coreAmo, new TileEntityAmo()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreQSil),
				new IRCore(coreQSil, new TileEntityQSil()));
		// 14
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreCarm),
				new IRCore(coreCarm, new TileEntityCarm()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreRub),
				new IRCore(coreRub, new TileEntityRub()));
		// 15
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreDesi),
				new IRCore(coreDesi, new TileEntityDesi()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreHad),
				new IRCore(coreHad, new TileEntityHad()));
		// 16
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreOric),
				new IRCore(coreOric, new TileEntityOric()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreVul),
				new IRCore(coreVul, new TileEntity()));
		// 17
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreCel),
				new IRCore(coreCel, new TileEntityCel()));
		// 18
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAdam),
				new IRCore(coreAdam, new TileEntityAdam()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreSang),
				new IRCore(coreSang, new TileEntitySang()));
		// 19
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreAtl),
				new IRCore(coreAtl, new TileEntityAtl()));
		// 20
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCoreTart),
				new IRCore(coreTart, new TileEntityTart()));

		// Cache
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCache),
				new IRCache(c2, new TileEntityCache()));

		// Doors
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockADoorB),
				new IRAncientDoorB(adb, new TileEntityAncientDoorB()));

		// Flints
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint),
		// new IRBlockFlint(f1, new TileEntityFlint()));
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint02),
		// new IRBlockFlint02(f2, new TileEntityFlint02()));
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint03),
		// new IRBlockFlint03(f3, new TileEntityFlint03()));
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint04),
		// new IRBlockFlint04(f4, new TileEntityFlint04()));

		// Crops
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientGold),
		// new IRGoldCrop(r2, new TileEntityGoldCrop()));
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientIron),
		// new IRIronCrop(r3, new TileEntityIronCrop()));

		// Other
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockASContainer),
				new IRAncientSeedContainer(asc, new TileEntityAncientContainer()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCatalyst),
				new IRCatalyst(c, new TileEntityCatalyst()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockBranch),
				new IRBranch(b, new TileEntityBranch()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCrystalOre),
				new IROreE(o, new TileEntityOreE()));

	}
}
