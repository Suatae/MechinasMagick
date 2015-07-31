package com.suatae.mechinasmagick.common.core.handler;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;





public class EventHandler {
	public static void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new BlockHarvestEventHandler());
		MinecraftForge.EVENT_BUS.register(new ChunkEventHandler());
	}

	public static void Init(FMLInitializationEvent event) {}

	public static void postInit(FMLPostInitializationEvent event) {}
}
