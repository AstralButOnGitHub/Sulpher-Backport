package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        SBBlocks.SULPHUR_BLOCK,
                        SBBlocks.CINNABAR_BLOCK,

                        SBBlocks.SULPHUR_STAIRS,
                        SBBlocks.SULPHUR_SLAB,
                        SBBlocks.SULPHUR_WALL,

                        SBBlocks.CINNABAR_STAIRS,
                        SBBlocks.CINNABAR_SLAB,
                        SBBlocks.CINNABAR_WALL,

                        SBBlocks.CHISELED_SULPHUR,
                        SBBlocks.CHISELED_CINNABAR,

                        SBBlocks.POLISHED_SULPHUR,
                        SBBlocks.POLISHED_CINNABAR,
                        SBBlocks.POLISHED_SULPHUR_STAIRS,
                        SBBlocks.POLISHED_SULPHUR_SLAB,
                        SBBlocks.POLISHED_SULPHUR_WALL,
                        SBBlocks.POLISHED_CINNABAR_STAIRS,
                        SBBlocks.POLISHED_CINNABAR_SLAB,
                        SBBlocks.POLISHED_CINNABAR_WALL,

                        SBBlocks.SULPHUR_BRICKS,
                        SBBlocks.CINNABAR_BRICKS,
                        SBBlocks.SULPHUR_BRICK_STAIRS,
                        SBBlocks.SULPHUR_BRICK_SLAB,
                        SBBlocks.CINNABAR_BRICK_STAIRS,
                        SBBlocks.CINNABAR_BRICK_SLAB
                );

        valueLookupBuilder(BlockTags.MOSS_REPLACEABLE)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.STONE_ORE_REPLACEABLES)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.SCULK_REPLACEABLE)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.SCULK_REPLACEABLE_WORLD_GEN)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.DRIPSTONE_REPLACEABLE)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.AZALEA_ROOT_REPLACEABLE)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.LUSH_GROUND_REPLACEABLE)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.NETHER_CARVER_REPLACEABLES)
                .add(SBBlocks.SULPHUR_BLOCK, SBBlocks.CINNABAR_BLOCK);

        valueLookupBuilder(BlockTags.WALLS)
                .add(
                        SBBlocks.CINNABAR_WALL,
                        SBBlocks.SULPHUR_WALL,
                        SBBlocks.POLISHED_SULPHUR_WALL,
                        SBBlocks.POLISHED_CINNABAR_WALL
                );
    }
}