package dev.astral.sulpher_backport.client.datagen;

import dev.astral.sulpher_backport.common.init.SBBlocks;
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
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK,

                SBBlocks.CHISELED_SULFER,
                SBBlocks.CHISELED_CINNABAR,

                SBBlocks.POLISHED_SULFER,
                SBBlocks.POLISHED_CINNABAR,
                SBBlocks.POLISHED_SULFER_STAIRS,
                SBBlocks.POLISHED_SULFER_SLAB,
                SBBlocks.POLISHED_SULFER_WALL,
                SBBlocks.POLISHED_CINNABAR_STAIRS,
                SBBlocks.POLISHED_CINNABAR_SLAB,
                SBBlocks.POLISHED_CINNABAR_WALL,

                SBBlocks.SULFER_BRICKS,
                SBBlocks.CINNABAR_BRICKS,
                SBBlocks.SULFER_BRICK_STAIRS,
                SBBlocks.SULFER_BRICK_SLAB,
                SBBlocks.CINNABAR_BRICK_STAIRS,
                SBBlocks.CINNABAR_BRICK_SLAB
        );

        add(BlockTags.MOSS_REPLACEABLE,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.STONE_ORE_REPLACEABLES,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.SCULK_REPLACEABLE,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.SCULK_REPLACEABLE_WORLD_GEN,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.DRIPSTONE_REPLACEABLE_BLOCKS,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.AZALEA_ROOT_REPLACEABLE,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.LUSH_GROUND_REPLACEABLE,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.BASE_STONE_OVERWORLD,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.OVERWORLD_CARVER_REPLACEABLES,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.MOSS_REPLACEABLE,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.NETHER_CARVER_REPLACEABLES,
                SBBlocks.SULFER_BLOCK,
                SBBlocks.CINNABAR_BLOCK
        );
        add(BlockTags.WALLS,
                SBBlocks.POLISHED_CINNABAR_WALL,
                SBBlocks.POLISHED_SULFER_WALL
        );
    }

    private void add(TagKey<Block> tag, Block... blocks) {
        getOrCreateTagBuilder(tag).add(blocks);
    }
}