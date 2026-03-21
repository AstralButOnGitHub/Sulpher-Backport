package dev.astral.sulpher_backport.client.datagen;

import dev.astral.sulpher_backport.common.init.SBBlocks;
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
        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.SULFER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.CINNABAR_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.CHISELED_SULFER);
        blockStateModelGenerator.registerSimpleCubeAll(SBBlocks.CHISELED_CINNABAR);

        BlockStateModelGenerator.BlockTexturePool CINNABAR = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.POLISHED_CINNABAR);
        CINNABAR.slab(SBBlocks.POLISHED_CINNABAR_SLAB);
        CINNABAR.stairs(SBBlocks.POLISHED_CINNABAR_STAIRS);
        CINNABAR.wall(SBBlocks.POLISHED_CINNABAR_WALL);

        BlockStateModelGenerator.BlockTexturePool SULFER = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.POLISHED_SULFER);
        SULFER.slab(SBBlocks.POLISHED_SULFER_SLAB);
        SULFER.stairs(SBBlocks.POLISHED_SULFER_STAIRS);
        SULFER.wall(SBBlocks.POLISHED_SULFER_WALL);

        BlockStateModelGenerator.BlockTexturePool CINNABARB = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.CINNABAR_BRICKS);
        CINNABARB.slab(SBBlocks.CINNABAR_BRICK_SLAB);
        CINNABARB.stairs(SBBlocks.CINNABAR_BRICK_STAIRS);

        BlockStateModelGenerator.BlockTexturePool SULFERB = blockStateModelGenerator.registerCubeAllModelTexturePool(SBBlocks.SULFER_BRICKS);
        SULFERB.slab(SBBlocks.SULFER_BRICK_SLAB);
        SULFERB.stairs(SBBlocks.SULFER_BRICK_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}
