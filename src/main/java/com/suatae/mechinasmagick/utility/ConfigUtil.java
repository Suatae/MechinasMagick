package com.suatae.mechinasmagick.utility;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class ConfigUtil {
	public static Configuration	configuration;

	public static String		debug			= "DEV MODE";
	public static String		modules			= "Modules";

	// Debug
	public static boolean		DebugMode;
	public static final boolean	Debug			= false;
	public static final String	Debug_comment	= "Set to true if you want log checks.";

	// Multiplayer
	public static boolean		Multiplayer;
	public static final boolean	Multi			= false;
	public static final String	Multi_comment	= "Set to true if you are playing Multiplayer Edition of the Official Pack.";

	// Machine
	public static boolean		MachineBlocks;
	public static final boolean	Machine			= false;
	public static final String	Machine_comment	= "Set to true to enable Machine Blocks(All Recipes are set in modpack only).";

	// Flint
	public static boolean		FlintModule;
	public static final boolean	Flint			= true;
	public static final String	Flint_comment	= "Set to true to enable Flint Blocks.";

	// Compressed
	public static boolean		CompressedModule;
	public static final boolean	Comp			= true;
	public static final String	Comp_comment	= "Set to true to enable Compressed Blocks.";

	// Bedrock
	public static boolean		BedRockModule;
	public static final boolean	Bedrock			= true;
	public static final String	Bedrock_comment	= "Set to true to replace bedrock with void.";

	// LavaRock
	public static boolean		LavaModule;
	public static final boolean	Lava			= true;
	public static final String	Lava_comment	= "Set to true to enable lava bubbles.";

	// Branch
	public static boolean		BranchModule;
	public static final boolean	Branch			= true;
	public static final String	Branch_comment	= "Set to true to enable Branch Blocks.";

	// Road
	public static boolean		RoadModule;
	public static final boolean	Road			= true;
	public static final String	Road_comment	= "Set to true to enable Road Blocks.";

	// Leaf
	public static boolean		LeafModule;
	public static final boolean	Leaf			= false;
	public static final String	Leaf_comment	= "Set to true to enable Leaf(WIP).";

	// Cache
	public static boolean		CacheModule;
	public static final boolean	Cache			= true;
	public static final String	Cache_comment	= "Set to true to enable Cache Blocks.";

	// Cache
	public static boolean		DirtModule;
	public static final boolean	Dirt			= true;
	public static final String	Dirt_comment	= "Set to true to enable Hardened Dirt.";

	public static void init(File configFile) // Create the configuration object
												// from the given configuration
												// file
	{
		if (configuration == null) {
			try {
				configuration = new Configuration(configFile);
			}
			catch (Exception e) {
				LogHelper.info("Config file already exists");
			}
			finally {
				loadConfiguration();
				LogHelper.info("Config file LOADED");
			}
		}
	}

	@SubscribeEvent
	// Load configuration file
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(REF.MOD_ID)) {
			try {
				loadConfiguration();
				LogHelper.info("Config file LOADED");
			}
			catch (Exception e) {
				LogHelper.info("Config file --ERROR--");
			}
		}
	}

	private static void loadConfiguration() // Configuration Elements
	{
		if (ConfigUtil.DebugMode) {
			LogHelper.info("Config Parameters --- BEGIN ---");
		}
		else {}

		// Debug Mode
		DebugMode = configuration.getBoolean("DebugMode", debug, Debug, Debug_comment);

		// Modules
		Multiplayer = configuration.getBoolean("Multiplayer", modules, Multi, Multi_comment);
		MachineBlocks = configuration.getBoolean("Machine Blocks", modules, Machine,
				Machine_comment);
		FlintModule = configuration.getBoolean("Flint Blocks", modules, Flint, Flint_comment);
		CompressedModule = configuration.getBoolean("Compressed Blocks", modules, Comp,
				Comp_comment);
		BedRockModule = configuration.getBoolean("Bedrock", modules, Bedrock, Bedrock_comment);
		LavaModule = configuration.getBoolean("Lava Block", modules, Lava, Lava_comment);
		BranchModule = configuration.getBoolean("Branch Block", modules, Branch, Branch_comment);
		RoadModule = configuration.getBoolean("Road Block", modules, Road, Road_comment);
		CacheModule = configuration.getBoolean("Cache Blocks", modules, Cache, Cache_comment);
		LeafModule = configuration.getBoolean("Test", modules, Leaf, Leaf_comment);
		DirtModule = configuration.getBoolean("Dirt", modules, Dirt, Dirt_comment);

		if (ConfigUtil.DebugMode) {
			LogHelper.info("Debug Mode: " + DebugMode);

			LogHelper.info("Config Parameters --- END ---");
		}

		if (ConfigUtil.Multiplayer) {
			LogHelper.info("Multiplayer is active");
		}
		else {}

		if (configuration.hasChanged()) // Save the configuration file
		{
			configuration.save();
			LogHelper.info("Config Saved");
		}
	}
}
