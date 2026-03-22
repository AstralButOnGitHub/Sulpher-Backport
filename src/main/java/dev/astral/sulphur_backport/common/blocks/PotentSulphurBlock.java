package dev.astral.sulphur_backport.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;

public class PotentSulphurBlock extends Block {
    public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");

    public PotentSulphurBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(ACTIVATED, false));
    }


    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state.with(ACTIVATED, world.isWater(pos.up()));
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return state.get(ACTIVATED);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextBetween(1, 100) == 1) {
            world.spawnParticles(
                    ParticleTypes.LARGE_SMOKE,
                    pos.getX(),
                    pos.getY(),
                    pos.getZ(),
                    0,
                    0,
                    0,
                    0,
                    0
            );
        }
        super.randomTick(state, world, pos, random);
    }


}
