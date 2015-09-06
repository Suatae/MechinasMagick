package com.suatae.mechinasmagick.common.core.handler;

import com.suatae.mechinasmagick.utility.ConfigUtil;
import com.suatae.mechinasmagick.world.gen.WorldGenLavaBubble;
import com.suatae.mechinasmagick.world.gen.WorldGenOre;
import com.suatae.mechinasmagick.world.gen.WorldGenSeedPillar;
import com.suatae.mechinasmagick.world.gen.WorldGeneratorBranch;
import com.suatae.mechinasmagick.world.gen.WorldGeneratorCache;
import com.suatae.mechinasmagick.world.gen.WorldGeneratorFlint;

import cpw.mods.fml.common.registry.GameRegistry;





public class GenHandler {
	public static void preInit() {
		if (ConfigUtil.FlintModule) {
			GameRegistry.registerWorldGenerator(new WorldGeneratorFlint(), 0);
		}
		else {

		}

		if (ConfigUtil.LavaModule) {
			GameRegistry.registerWorldGenerator(new WorldGenLavaBubble(), 0);
		}
		else {

		}

		if (ConfigUtil.BranchModule) {
			GameRegistry.registerWorldGenerator(new WorldGeneratorBranch(), 0);
		}
		else {

		}

		if (ConfigUtil.CacheModule) {
			GameRegistry.registerWorldGenerator(new WorldGeneratorCache(), 0);
		}
		else {

		}
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenSeedPillar(), 0);

	}

	public static void Init() {}

	public static void postInit() {}
}
