package com.suatae.mechinasmagick;

import com.suatae.mechinasmagick.common.core.handler.EventHandler;
import com.suatae.mechinasmagick.common.core.handler.GenHandler;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.proxy.CommonProxy;
import com.suatae.mechinasmagick.utility.ConfigUtil;
import com.suatae.mechinasmagick.utility.LogHelper;
import com.suatae.mechinasmagick.utility.RecipeRemover;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;





@Mod(modid = REF.MOD_ID, name = REF.MOD_NAME, version = REF.VERSION,
		guiFactory = REF.GUI_FACTORY_CLASS)
public class MechinasMagick {
	@Mod.Instance(REF.MOD_ID)
	public static MechinasMagick	instance;

	@SidedProxy(clientSide = REF.CLIENTSIDE, serverSide = REF.COMMONSIDE)
	public static CommonProxy		proxy;
	public static EventHandler		event;

	@Mod.EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {

		GenHandler.preInit();
		EventHandler.preInit(event);

		BlockReg.init();
		ItemReg.init();
		proxy.registerTESRender();
		proxy.registerTESRGoldCasing();
		proxy.registerTESRIronCasing();
		proxy.registerItemRender();
		ConfigUtil.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigUtil());

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Pre-Initialization]: --- Loaded ---");
		}
		else {}

	}

	@Mod.EventHandler
	public static void Load(FMLInitializationEvent event) {

		GenHandler.Init();
		EventHandler.Init(event);
		RecipeRemover.voidRecipe();

		if (ConfigUtil.DebugMode) {
			LogHelper.info("The Monkey is ready with the Screwdriver");
			LogHelper.info("[Initialization]: --- Loaded ---");
		}
		else {}

	}

	@Mod.EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Post-Initialization]: --- Loaded---");
		}
		else {}
		GenHandler.postInit();
		EventHandler.postInit(event);

	}

}
