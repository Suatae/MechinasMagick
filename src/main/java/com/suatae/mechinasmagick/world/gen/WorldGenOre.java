package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int x, int z, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 0:
				genOverworld(random, world, x * 16, z * 16);
				break;
			case 1:
				genEnd(random, world, x * 16, z * 16);
				break;
			case -1:
				genNether(random, world, x * 16, z * 16);
				break;
			default:
				genOverworld(random, world, x * 16, z * 16);
		}
	}

	private void genNether(Random random, World world, int x, int z) {}

	private void genEnd(Random random, World world, int x, int z) {
		addstone(BlockReg.blockCrystalOre, world, random, x, z, 20, 30, 12, 0, 200);
	}

	private void genOverworld(Random random, World world, int x, int z) {}

	private void addstone(Block block, World world, Random random, int PosX, int PosZ,
			int minVeinSize, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		WorldGenMinable minable = new WorldGenMinable(block, chanceToSpawn, Blocks.end_stone);
		for (int i = 0; i < chanceToSpawn; i++) {

			int x = PosX + random.nextInt(16);
			int z = PosZ + random.nextInt(16);
			int y = minY + random.nextInt(maxY - minY);
			minable.generate(world, random, x, y, z);
		}
	}

}
