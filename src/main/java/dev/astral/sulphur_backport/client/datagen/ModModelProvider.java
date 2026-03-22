package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.CHISELED_SULPHUR);
        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.CHISELED_CINNABAR);

        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.POTENT_SULPHUR);

        BlockStateModelGenerator.BlockTexturePool CINNABAR = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.CINNABAR_BLOCK);
        CINNABAR.slab(SBBlocks.CINNABAR_SLAB);
        CINNABAR.stairs(SBBlocks.CINNABAR_STAIRS);
        CINNABAR.wall(SBBlocks.CINNABAR_WALL);

        BlockStateModelGenerator.BlockTexturePool SULPHURP = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.SULPHUR_BLOCK);
        SULPHURP.slab(SBBlocks.SULPHUR_SLAB);
        SULPHURP.stairs(SBBlocks.SULPHUR_STAIRS);
        SULPHURP.wall(SBBlocks.SULPHUR_WALL);

        BlockStateModelGenerator.BlockTexturePool CINNABARP = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.POLISHED_CINNABAR);
        CINNABARP.slab(SBBlocks.POLISHED_CINNABAR_SLAB);
        CINNABARP.stairs(SBBlocks.POLISHED_CINNABAR_STAIRS);
        CINNABARP.wall(SBBlocks.POLISHED_CINNABAR_WALL);

        BlockStateModelGenerator.BlockTexturePool SULPHUR = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.POLISHED_SULPHUR);
        SULPHUR.slab(SBBlocks.POLISHED_SULPHUR_SLAB);
        SULPHUR.stairs(SBBlocks.POLISHED_SULPHUR_STAIRS);
        SULPHUR.wall(SBBlocks.POLISHED_SULPHUR_WALL);

        BlockStateModelGenerator.BlockTexturePool CINNABARB = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.CINNABAR_BRICKS);
        CINNABARB.slab(SBBlocks.CINNABAR_BRICK_SLAB);
        CINNABARB.stairs(SBBlocks.CINNABAR_BRICK_STAIRS);
        CINNABARB.wall(SBBlocks.CINNABAR_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool SULPHURB = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.SULPHUR_BRICKS);
        SULPHURB.slab(SBBlocks.SULPHUR_BRICK_SLAB);
        SULPHURB.stairs(SBBlocks.SULPHUR_BRICK_STAIRS);
        SULPHURB.wall(SBBlocks.SULPHUR_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}
