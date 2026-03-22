package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        add(BlockTags.PICKAXE_MINEABLE,
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

        add(BlockTags.MOSS_REPLACEABLE,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.STONE_ORE_REPLACEABLES,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.SCULK_REPLACEABLE,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.SCULK_REPLACEABLE_WORLD_GEN,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.DRIPSTONE_REPLACEABLE_BLOCKS,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.AZALEA_ROOT_REPLACEABLE,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.LUSH_GROUND_REPLACEABLE,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.BASE_STONE_OVERWORLD,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.OVERWORLD_CARVER_REPLACEABLES,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.MOSS_REPLACEABLE,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.NETHER_CARVER_REPLACEABLES,
                SBBlocks.SULPHUR_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.WALLS,
                SBBlocks.CINNABAR_WALL,
                SBBlocks.SULPHUR_WALL,
                SBBlocks.POLISHED_SULPHUR_WALL,
                SBBlocks.POLISHED_SULPHUR_WALL
        );
    }

    private void add(TagKey<Block> tag, Block... blocks) {
        getOrCreateTagBuilder(tag).add(blocks);
    }
}