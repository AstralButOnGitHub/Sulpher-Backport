package dev.astral.sulphur_backport.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class PotentSulphurBlock extends Block {
    public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");

    public PotentSulphurBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(ACTIVATED, false));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVATED);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(ACTIVATED)) {
            double d = (double) pos.getX() + (double) 0.5F;
            double e = (double) pos.getY() + 2;
            double f = (double) pos.getZ() + (double) 0.5F;
            world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, d, e, f, 0.02F, 0.002F, 0.02F);
        }
    }


}
