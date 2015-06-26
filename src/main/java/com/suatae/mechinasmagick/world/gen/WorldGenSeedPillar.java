package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGenSeedPillar implements IWorldGenerator {

	public static int	Y	= -1;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int X = chunkX * 16;
		int Z = chunkZ * 16;
		switch (world.provider.dimensionId) {
			case -1:
				generateNether(world, X, Z, random);
				break;
			case 0:
				generateSurface(world, X, Z, random);
				break;
			case 1:
				generateEnd(world, X, Z, random);
				break;
			default:
				generateSurface(world, X, Z, random);
		}

	}

	private void generateNether(World world, int X, int Z, Random random) {}

	private void generateSurface(World world, int X, int Z, Random random) {
		// Pillar
		if (random.nextInt(128) == 0) {
			int randX = X + random.nextInt(16);
			int randY = world.getTopSolidOrLiquidBlock(X, Z);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randX, randY + Y, randZ);
				if (!(block != REF.BLOCK.grass)) {
					GenPillar(world, randX, randY, randZ, random);
				}
				Block block1 = world.getBlock(randX, randY + Y, randZ);
				if (!(block != REF.BLOCK.stone01)) {
					GenPillar(world, randX, randY, randZ, random);
				}
				// Block block2 = world.getBlock(randX, randY + Y, randZ);
				// if (!(block != REF.BLOCK.sand)) {
				// GenPillar(world, randX, randY, randZ, random);
				// }
				Block block3 = world.getBlock(randX, randY + Y, randZ);
				if (!(block != REF.BLOCK.mush)) {
					GenPillar(world, randX, randY, randZ, random);
				}
			}
		}
	}

	private void generateEnd(World world, int X, int Z, Random random) {}

	private void GenPillar(World world, int X, int Y, int Z, Random random) {
		// Bottom-to-Top
		// BASE
		for (int i = 0; i < 7; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Layer -4
						// Center
						world.setBlock(X + 3 + -i, Y - 4, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(X + 2 + -ii, Y - 4, Z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 + -ii, Y - 4, Z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -3
						// Center
						world.setBlock(X + 3 + -i, Y - 3, Z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(X + 2 + -ii, Y - 3, Z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 + -ii, Y - 3, Z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -2
						// Center
						world.setBlock(X + 3 + -i, Y - 2, Z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(X + 2 + -ii, Y - 2, Z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 + -ii, Y - 2, Z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer -1
						// Center
						world.setBlock(X + 3 + -i, Y - 1, Z + 2 + -ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(X + 2 + -ii, Y - 1, Z + 4 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 + -ii, Y - 1, Z - 3 + -ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 0
						// Center
						world.setBlock(X + 2 + -ii, Y, Z + 3 + -i, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corners
						world.setBlock(X + 3, Y, Z + 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X + 3, Y, Z - 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X - 3, Y, Z + 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X - 3, Y, Z - 2, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X + 2, Y, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X + 2, Y, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X - 2, Y, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						world.setBlock(X - 2, Y, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						// ALT
						world.setBlock(X + 3, Y, Z + 1 + -e, REF.BLOCK.PILLAR.Design, 2, 2);
						world.setBlock(X - 3, Y, Z + 1 + -e, REF.BLOCK.PILLAR.Design, 2, 2);
						world.setBlock(X + 1 + -e, Y, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
						world.setBlock(X + 1 + -e, Y, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
						// Layer 1
						// Center
						world.setBlock(X + 2 + -ee, Y + 1, Z, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(X - 2 + ee, Y + 1, Z, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(X + 1 + -e, Y + 1, Z + 1 + ee, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(X + 1 + -e, Y + 1, Z - 1 + -ee, REF.BLOCK.PILLAR.Step, 0, 2);
						world.setBlock(X, Y + 1, Z, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
						// Inner
						world.setBlock(X + 2, Y + 1, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 1, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 1, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 1, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Corner
						world.setBlock(X + 2 - ii, Y + 1, Z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 - ii, Y + 1, Z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 1, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 1, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 2
						// Inner
						world.setBlock(X + 1, Y + 2, Z, REF.BLOCK.air, 0, 2);
						world.setBlock(X + 2, Y + 2, Z, REF.BLOCK.PILLAR.DoorB, 0, 2);
						world.setBlock(X + 2, Y + 3, Z, REF.BLOCK.PILLAR.DoorT, 0, 2);
						world.setBlock(X - 1, Y + 2, Z, REF.BLOCK.air, 0, 2);
						world.setBlock(X - 2, Y + 2, Z, REF.BLOCK.PILLAR.DoorB, 0, 2);
						world.setBlock(X - 2, Y + 3, Z, REF.BLOCK.PILLAR.DoorT, 0, 2);
						world.setBlock(X + 1 - e, Y + 2, Z + 2 - ee, REF.BLOCK.air, 0, 2);
						world.setBlock(X + 1 - e, Y + 2, Z - 1 - ee, REF.BLOCK.air, 0, 2);
						// Center
						world.setBlock(X, Y + 2, Z, REF.BLOCK.PILLAR.Catalyst, 0, 2);
						// Outer
						world.setBlock(X + 2, Y + 2, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 2, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 2, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 2, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 1 - e, Y + 2, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 1 - e, Y + 2, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 3
						// Inner
						world.setBlock(X + 1, Y + 3, Z, REF.BLOCK.air, 0, 2);
						world.setBlock(X - 1, Y + 3, Z, REF.BLOCK.air, 0, 2);
						world.setBlock(X + 1 - e, Y + 3, Z + 2 - ee, REF.BLOCK.air, 0, 2);
						world.setBlock(X + 1 - e, Y + 3, Z - 1 - ee, REF.BLOCK.air, 0, 2);
						// Center
						world.setBlock(X, Y + 3, Z, REF.BLOCK.PILLAR.Core, 0, 2);
						// Outer
						world.setBlock(X + 2, Y + 3, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 3, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 3, Z + 2 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 3, Z - 1 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 1 - e, Y + 3, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 1 - e, Y + 3, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Layer 4
						// Outer
						world.setBlock(X + 2, Y + 4, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 4, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 - ii, Y + 4, Z + 4 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2 - ii, Y + 4, Z - 3 - ee, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

					}
		// AIR CORE
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int iii = 0; iii < 14; iii++) {
					// Inner
					world.setBlock(X + 1 + -i, Y + 17 - iii, Z + 2 - ii, REF.BLOCK.air, 0, 2);
				}
		// Tier
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 13; ii++)
				for (int e = 0; e < 12; e++) {
					// Outer 01
					world.setBlock(X + 2 - i, Y + 17 - ii, Z + 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X + 2 - i, Y + 17 - ii, Z - 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					// Outer 02
					world.setBlock(X + 2, Y + 16 - e, Z + 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X - 2, Y + 16 - e, Z + 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X + 2, Y + 16 - e, Z - 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X - 2, Y + 16 - e, Z - 4, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
				}
		for (int i = 0; i < 11; i++)
			for (int ii = 0; ii < 3; ii++) {
				// Outer Inner
				world.setBlock(X, Y + 15 - i, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X, Y + 15 - i, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				// Outer Design 01
				world.setBlock(X + 1, Y + 15, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 14, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 13, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 12, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 11, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 10, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 9, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 8, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 7, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 6, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 5, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				// Outer Design 02
				world.setBlock(X - 1, Y + 15, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 14, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 13, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 12, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 11, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 10, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 9, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 8, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 7, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 6, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 5, Z + 4, REF.BLOCK.PILLAR.Design, 2, 2);
				// Outer Design 03
				world.setBlock(X + 1, Y + 15, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 14, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 13, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 12, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 11, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 10, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 9, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 8, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 7, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X + 1, Y + 6, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X + 1, Y + 5, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				// Outer Design 04
				world.setBlock(X - 1, Y + 15, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 14, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 13, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 12, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 11, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 10, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 9, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 8, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 7, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				world.setBlock(X - 1, Y + 6, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
				world.setBlock(X - 1, Y + 5, Z - 4, REF.BLOCK.PILLAR.Design, 2, 2);
				// Outer Top
				world.setBlock(X + 1 - ii, Y + 16, Z + 4, REF.BLOCK.PILLAR.Main, random.nextInt(),
						2);
				world.setBlock(X + 1 - ii, Y + 16, Z - 4, REF.BLOCK.PILLAR.Main, random.nextInt(),
						2);
			}
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 5; ii++)
				for (int e = 0; e < 3; e++) {
					// Top
					world.setBlock(X + 2 - i, Y + 18, Z + 2 - ii, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X + 1 - e, Y + 18, Z + 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
					world.setBlock(X + 1 - e, Y + 18, Z - 3, REF.BLOCK.PILLAR.Main,
							random.nextInt(), 2);
				}
		for (int i = 0; i < 13; i++)
			for (int ii = 0; ii < 11; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 9; ee++) {
						// Center
						world.setBlock(X + 2, Y + 17 - i, Z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 17 - i, Z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 17 - i, Z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 17 - i, Z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 17, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 17, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 5, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 5, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Corners
						world.setBlock(X + 2, Y + 6, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 6, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 6, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 6, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 16, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 16, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 2, Y + 16, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 2, Y + 16, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

						world.setBlock(X + 2, Y + 16 - ii, Z, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(X + 2, Y + 15 - ee, Z + 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(X + 2, Y + 15 - ee, Z - 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(X - 2, Y + 16 - ii, Z, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(X - 2, Y + 15 - ee, Z + 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);
						world.setBlock(X - 2, Y + 15 - ee, Z - 1, REF.BLOCK.PILLAR.Glyph,
								random.nextInt(2), 2);

						// Center Outer
						world.setBlock(X + 3, Y + 17 - i, Z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 17 - i, Z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 17 - i, Z + 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 17 - i, Z - 2, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 17, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 17, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 5, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 5, Z + 1 - e, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Corners
						world.setBlock(X + 3, Y + 6, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 6, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 6, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 6, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 16, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 16, Z + 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 16, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 16, Z - 1, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						// Center Outer Corners
						world.setBlock(X + 3, Y + 6, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 6, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 11, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 11, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 16, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 16, Z + 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);

						world.setBlock(X + 3, Y + 6, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 6, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 11, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 11, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X + 3, Y + 16, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
						world.setBlock(X - 3, Y + 16, Z - 3, REF.BLOCK.PILLAR.Main,
								random.nextInt(), 2);
					}
		for (int i = 0; i < 4; i++) {
			// Center Outer Stone
			world.setBlock(X + 3, Y + 15 - i, Z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X - 3, Y + 15 - i, Z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X + 3, Y + 15 - i, Z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X - 3, Y + 15 - i, Z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);

			world.setBlock(X + 3, Y + 10 - i, Z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X - 3, Y + 10 - i, Z + 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X + 3, Y + 10 - i, Z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
			world.setBlock(X - 3, Y + 10 - i, Z - 3, REF.BLOCK.PILLAR.Main, random.nextInt(), 2);
		}
	}
}
