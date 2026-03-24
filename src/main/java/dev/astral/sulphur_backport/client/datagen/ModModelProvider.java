package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.registerSimpleFlatItemModel(SBBlocks.CHISELED_SULPHUR);
        blockModelGenerators.registerSimpleFlatItemModel(SBBlocks.CHISELED_CINNABAR);

        blockModelGenerators.registerSimpleFlatItemModel(SBBlocks.POTENT_SULPHUR);

//        BlockModelGenerators.BlockFamilyProvider CINNABAR = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.CINNABAR_BLOCK);
//        CINNABAR.slab(SBBlocks.CINNABAR_SLAB);
//        CINNABAR.stairs(SBBlocks.CINNABAR_STAIRS);
//        CINNABAR.wall(SBBlocks.CINNABAR_WALL);
//
//        blockModelGenerators.BlockTexturePool SULPHURP = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.SULPHUR_BLOCK);
//        SULPHURP.slab(SBBlocks.SULPHUR_SLAB);
//        SULPHURP.stairs(SBBlocks.SULPHUR_STAIRS);
//        SULPHURP.wall(SBBlocks.SULPHUR_WALL);
//
//        blockModelGenerators.BlockTexturePool CINNABARP = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.POLISHED_CINNABAR);
//        CINNABARP.slab(SBBlocks.POLISHED_CINNABAR_SLAB);
//        CINNABARP.stairs(SBBlocks.POLISHED_CINNABAR_STAIRS);
//        CINNABARP.wall(SBBlocks.POLISHED_CINNABAR_WALL);
//
//        blockModelGenerators.BlockTexturePool SULPHUR = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.POLISHED_SULPHUR);
//        SULPHUR.slab(SBBlocks.POLISHED_SULPHUR_SLAB);
//        SULPHUR.stairs(SBBlocks.POLISHED_SULPHUR_STAIRS);
//        SULPHUR.wall(SBBlocks.POLISHED_SULPHUR_WALL);
//
//        blockModelGenerators.BlockTexturePool CINNABARB = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.CINNABAR_BRICKS);
//        CINNABARB.slab(SBBlocks.CINNABAR_BRICK_SLAB);
//        CINNABARB.stairs(SBBlocks.CINNABAR_BRICK_STAIRS);
//
//        blockModelGenerators.BlockTexturePool SULPHURB = blockModelGenerators.registerCubeAllModelTexturePool(SBBlocks.SULPHUR_BRICKS);
//        SULPHURB.slab(SBBlocks.SULPHUR_BRICK_SLAB);
//        SULPHURB.stairs(SBBlocks.SULPHUR_BRICK_STAIRS);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
