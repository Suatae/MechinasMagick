package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGeneratorBranch implements IWorldGenerator {
	public static Block	air		= Blocks.air;
	public static Block	grass	= Blocks.grass;
	public static Block	branch	= BlockReg.blockBranch;

	@Override
	public void generate(Random random, int chunkx, int chunkz, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int x = chunkx * 16;
		int z = chunkz * 16;
		switch (world.provider.dimensionId) {
			case -1:
				generateNether(world, x, z, random);
				break;
			case 0:
				generateSurface(world, x, z, random);
				break;
			case 1:
				generateEnd(world, x, z, random);
				break;
			default:
				generateSurface(world, x, z, random);
		}

	}

	private void generateNether(World world, int x, int z, Random random) {}

	private void generateSurface(World world, int x, int z, Random random) {

		if (random.nextInt(1) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy - 1, randz);
				Block blocka = world.getBlock(randx, randy, randz);
				if (!(block != grass) && !(blocka != air)) {

					branchGen(world, randx, randy, randz);
				}
			}
		}

	}

	private void generateEnd(World world, int x, int z, Random random) {}

	private void branchGen(World world, int x, int y, int z) {

		world.setBlock(x, y, z, branch, 0, 2);
	}
}
