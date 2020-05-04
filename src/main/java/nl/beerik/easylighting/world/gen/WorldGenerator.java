package nl.beerik.easylighting.world.gen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IWorldGenerator;
import nl.beerik.easylighting.EasyLighting;
import nl.beerik.easylighting.init.ELBlocks;

public class WorldGenerator implements IWorldGenerator {

	public WorldGenerator() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		generateOverworld(random, chunkX, chunkZ, world);
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		generateOre(ELBlocks.STAR_WORM_COBBLE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, EasyLighting.INSTANCE.config.veinSize, EasyLighting.INSTANCE.config.veinPerChunk);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
