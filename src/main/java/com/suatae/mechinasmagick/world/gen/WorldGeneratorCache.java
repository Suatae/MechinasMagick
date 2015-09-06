package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGeneratorCache implements IWorldGenerator {
	public static Block	AIR		= Blocks.air;
	public static Block	STONE	= Blocks.stone;
	public static Block	GRASS	= Blocks.grass;
	public static Block	SAND	= Blocks.sand;
	public static Block	GRAVEL	= Blocks.gravel;
	public static Block	CACHE	= BlockReg.blockCache;

	public static int	y		= -1;
	public static int	yy		= 1;
	public static int	zz		= 1;

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
		// Cache 01
		if (random.nextInt(2) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache01GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache01GenStone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache01GenSand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache01GenGravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Cache 02
		if (random.nextInt(8) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache02GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache02GenStone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache02GenSand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache02GenGravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Cache 03
		if (random.nextInt(64) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache03GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache03GenStone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache03GenSand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache03GenGravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Cache 04
		if (random.nextInt(128) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache04GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache04GenStone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache04GenSand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randx, randy, randz + zz);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randx, randy, randz - zz);
							if (!(blockz2 != AIR)) {
								cache04GenGravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
	}

	private void generateEnd(World world, int x, int z, Random random) {}

	// Cache 01
	private void cache01GenGrass(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRASS, 0, 2);
				}
	}

	private void cache01GenStone(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, STONE, 0, 2);
				}
	}

	private void cache01GenSand(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, SAND, 0, 2);
				}
	}

	private void cache01GenGravel(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRAVEL, 0, 2);
				}
	}

	// Cache 02
	private void cache02GenGrass(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRASS, 0, 2);
				}
	}

	private void cache02GenStone(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, STONE, 0, 2);
				}
	}

	private void cache02GenSand(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, SAND, 0, 2);
				}
	}

	private void cache02GenGravel(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRAVEL, 0, 2);
				}
	}

	// Cache 03
	private void cache03GenGrass(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRASS, 0, 2);
				}
	}

	private void cache03GenStone(World world, int x, int y, int z) {

		// cache Block
		world.setBlock(x, y, z, CACHE, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, STONE, 0, 2);
				}
	}

	private void cache03GenSand(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, SAND, 0, 2);
				}
	}

	private void cache03GenGravel(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRAVEL, 0, 2);
				}
	}

	// Cache 04
	private void cache04GenGrass(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRASS, 0, 2);
				}
	}

	private void cache04GenStone(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, STONE, 0, 2);
				}

	}

	private void cache04GenSand(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, SAND, 0, 2);
				}

	}

	private void cache04GenGravel(World world, int x, int y, int z) {

		// Cache Block
		world.setBlock(x, y, z, CACHE, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, GRAVEL, 0, 2);
				}
	}
}
