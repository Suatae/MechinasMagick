package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.block.BlockStoneBrick;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGenSeedPillar implements IWorldGenerator {

	public static int	y	= -1;

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
		// Pillar
		if (random.nextInt(128) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != REF.BLOCK.grass)) {
					GenPillar(world, randx, randy, randz, random);
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block != REF.BLOCK.stone01)) {
					GenPillar(world, randx, randy, randz, random);
				}
				// Block block2 = world.getBlock(randx, randy + y, randz);
				// if (!(block != REF.BLOCK.sand)) {
				// GenPillar(world, randx, randy, randz, random);
				// }
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block != REF.BLOCK.mush)) {
					GenPillar(world, randx, randy, randz, random);
				}
			}
		}
	}

	private void generateEnd(World world, int x, int z, Random random) {}

	private void GenPillar(World world, int x, int y, int z, Random random) {
		// Bottom-to-Top
		// BASE
		for (int i = 0; i < 7; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Layer -4
						// Center
						world.setBlock(x + 3 + -i, y - 4, z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(x + 2 + -ii, y - 4, z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 + -ii, y - 4, z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -3
						// Center
						world.setBlock(x + 3 + -i, y - 3, z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(x + 2 + -ii, y - 3, z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 + -ii, y - 3, z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -2
						// Center
						world.setBlock(x + 3 + -i, y - 2, z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(x + 2 + -ii, y - 2, z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 + -ii, y - 2, z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -1
						// Center
						world.setBlock(x + 3 + -i, y - 1, z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(x + 2 + -ii, y - 1, z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 + -ii, y - 1, z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 0
						// Center
						world.setBlock(x + 2 + -ii, y, z + 3 + -i, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(x + 3, y, z + 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x + 3, y, z - 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x - 3, y, z + 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x - 3, y, z - 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x + 2, y, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x + 2, y, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x - 2, y, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(x - 2, y, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						// ALT
						world.setBlock(x + 3, y, z + 1 + -e, REF.BLOCK.PILLAR.Design,
								random.nextInt(BlockStoneBrick.maxMeta), 2);
						world.setBlock(x - 3, y, z + 1 + -e, REF.BLOCK.PILLAR.Design,
								random.nextInt(BlockStoneBrick.maxMeta), 2);
						world.setBlock(x + 1 + -e, y, z + 4, REF.BLOCK.PILLAR.Design,
								random.nextInt(BlockStoneBrick.maxMeta), 2);
						world.setBlock(x + 1 + -e, y, z - 4, REF.BLOCK.PILLAR.Design,
								random.nextInt(BlockStoneBrick.maxMeta), 2);
						// Layer 1
						// Center
						world.setBlock(x + 2 + -ee, y + 1, z, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(x - 2 + ee, y + 1, z, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(x + 1 + -e, y + 1, z + 1 + ee, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(x + 1 + -e, y + 1, z - 1 + -ee, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(x, y + 1, z, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						// Inner
						world.setBlock(x + 2, y + 1, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 1, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 1, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 1, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corner
						world.setBlock(x + 2 - ii, y + 1, z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 - ii, y + 1, z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 1, z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 1, z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 2
						// Inner
						world.setBlock(x + 1, y + 2, z, REF.BLOCK.air, 0, 2);
						world.setBlock(x + 2, y + 2, z, REF.BLOCK.PILLAR.DoorB, 0, 2);
						world.setBlock(x + 2, y + 3, z, REF.BLOCK.PILLAR.DoorT, 0, 2);
						world.setBlock(x - 1, y + 2, z, REF.BLOCK.air, 0, 2);
						world.setBlock(x - 2, y + 2, z, REF.BLOCK.PILLAR.DoorB, 0, 2);
						world.setBlock(x - 2, y + 3, z, REF.BLOCK.PILLAR.DoorT, 0, 2);
						world.setBlock(x + 1 - e, y + 2, z + 2 - ee, REF.BLOCK.air, 0, 2);
						world.setBlock(x + 1 - e, y + 2, z - 1 - ee, REF.BLOCK.air, 0, 2);
						// Center
						world.setBlock(x, y + 2, z, REF.BLOCK.PILLAR.Catalyst, 0, 2);
						// Outer
						world.setBlock(x + 2, y + 2, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 2, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 2, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 2, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 1 - e, y + 2, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 1 - e, y + 2, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 3
						// Inner
						world.setBlock(x + 1, y + 3, z, REF.BLOCK.air, 0, 2);
						world.setBlock(x - 1, y + 3, z, REF.BLOCK.air, 0, 2);
						world.setBlock(x + 1 - e, y + 3, z + 2 - ee, REF.BLOCK.air, 0, 2);
						world.setBlock(x + 1 - e, y + 3, z - 1 - ee, REF.BLOCK.air, 0, 2);
						// Center
						world.setBlock(x, y + 3, z, REF.BLOCK.PILLAR.Core, 0, 2);
						// Outer
						world.setBlock(x + 2, y + 3, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 3, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 3, z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 3, z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 1 - e, y + 3, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 1 - e, y + 3, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 4
						// Outer
						world.setBlock(x + 2, y + 4, z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 4, z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 - ii, y + 4, z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2 - ii, y + 4, z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

					}
		// AIR CORE
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int iii = 0; iii < 14; iii++) {
					// Inner
					world.setBlock(x + 1 + -i, y + 17 - iii, z + 2 - ii, REF.BLOCK.air, 0, 2);
				}
		// Tier
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 13; ii++)
				for (int e = 0; e < 12; e++) {
					// Outer 01
					world.setBlock(x + 2 - i, y + 17 - ii, z + 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x + 2 - i, y + 17 - ii, z - 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					// Outer 02
					world.setBlock(x + 2, y + 16 - e, z + 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x - 2, y + 16 - e, z + 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x + 2, y + 16 - e, z - 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x - 2, y + 16 - e, z - 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
				}
		for (int i = 0; i < 11; i++)
			for (int ii = 0; ii < 3; ii++) {
				// Outer Inner
				world.setBlock(x, y + 15 - i, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x, y + 15 - i, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				// Outer Design 01
				world.setBlock(x + 1, y + 15, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 14, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 13, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 12, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 11, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 10, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 9, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 8, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 7, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 6, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 5, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				// Outer Design 02
				world.setBlock(x - 1, y + 15, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 14, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 13, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 12, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 11, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 10, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 9, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 8, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 7, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 6, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 5, z + 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				// Outer Design 03
				world.setBlock(x + 1, y + 15, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 14, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 13, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 12, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 11, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 10, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 9, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 8, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 7, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x + 1, y + 6, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x + 1, y + 5, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				// Outer Design 04
				world.setBlock(x - 1, y + 15, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 14, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 13, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 12, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 11, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 10, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 9, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 8, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 7, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				world.setBlock(x - 1, y + 6, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(x - 1, y + 5, z - 4, REF.BLOCK.PILLAR.Design,
						random.nextInt(BlockStoneBrick.maxMeta), 2);
				// Outer Top
				world.setBlock(x + 1 - ii, y + 16, z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(),
						2);
				world.setBlock(x + 1 - ii, y + 16, z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(),
						2);
			}
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int e = 0; e < 3; e++) {
					// Top
					world.setBlock(x + 2 - i, y + 18, z + 2 - ii, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x + 1 - e, y + 18, z + 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(x + 1 - e, y + 18, z - 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
				}
		for (int i = 0; i < 13; i++)
			for (int ii = 0; ii < 11; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 9; ee++) {
						// Center
						world.setBlock(x + 2, y + 17 - i, z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 17 - i, z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 17 - i, z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 17 - i, z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 17, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 17, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 5, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 5, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Corners
						world.setBlock(x + 2, y + 6, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 6, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 6, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 6, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 16, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 16, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 2, y + 16, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 2, y + 16, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

						world.setBlock(x + 2, y + 16 - ii, z, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(x + 2, y + 15 - ee, z + 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(x + 2, y + 15 - ee, z - 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(x - 2, y + 16 - ii, z, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(x - 2, y + 15 - ee, z + 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(x - 2, y + 15 - ee, z - 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);

						// Center Outer
						world.setBlock(x + 3, y + 17 - i, z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 17 - i, z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 17 - i, z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 17 - i, z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 17, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 17, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 5, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 5, z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Corners
						world.setBlock(x + 3, y + 6, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 6, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 6, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 6, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 16, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 16, z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 16, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 16, z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Outer Corners
						world.setBlock(x + 3, y + 6, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 6, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 11, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 11, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 16, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 16, z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

						world.setBlock(x + 3, y + 6, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 6, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 11, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 11, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x + 3, y + 16, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(x - 3, y + 16, z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
					}
		for (int i = 0; i < 4; i++) {
			// Center Outer Stone
			world.setBlock(x + 3, y + 15 - i, z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x - 3, y + 15 - i, z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x + 3, y + 15 - i, z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x - 3, y + 15 - i, z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);

			world.setBlock(x + 3, y + 10 - i, z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x - 3, y + 10 - i, z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x + 3, y + 10 - i, z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(x - 3, y + 10 - i, z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
		}
	}
}
