package dev.astral.sulpher_backport.common.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import static dev.astral.sulpher_backport.Sulpher_backport.MOD_ID;

public class SBBlocks {

    public static final Block SULFER_BLOCK = registerBlock("sulfer_block", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.RED)));

    public static final Block CHISELED_SULFER = registerBlock("chiseled_sulfer", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block CHISELED_CINNABAR = registerBlock("chiseled_cinnabar", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.RED)));

    public static final Block POLISHED_SULFER = registerBlock("polished_sulfer", new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_CINNABAR = registerBlock("polished_cinnabar", new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).mapColor(DyeColor.RED)));
    public static final Block POLISHED_SULFER_STAIRS = registerBlock("polished_sulfer_stairs", new StairsBlock(POLISHED_SULFER.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SULFER)));
    public static final Block POLISHED_SULFER_SLAB = registerBlock("polished_sulfer_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SULFER)));
    public static final Block POLISHED_SULFER_WALL = registerBlock("polished_sulfer_wall", new WallBlock(AbstractBlock.Settings.copy(POLISHED_SULFER)));
    public static final Block POLISHED_CINNABAR_STAIRS = registerBlock("polished_cinnabar_stairs", new StairsBlock(POLISHED_CINNABAR.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_CINNABAR)));
    public static final Block POLISHED_CINNABAR_SLAB = registerBlock("polished_cinnabar_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_CINNABAR)));
    public static final Block POLISHED_CINNABAR_WALL = registerBlock("polished_cinnabar_wall", new WallBlock(AbstractBlock.Settings.copy(POLISHED_CINNABAR)));

    public static final Block SULFER_BRICKS = registerBlock("sulfer_bricks", new Block(AbstractBlock.Settings.copy(POLISHED_SULFER).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BRICKS = registerBlock("cinnabar_bricks", new Block(AbstractBlock.Settings.copy(POLISHED_CINNABAR).mapColor(DyeColor.RED)));
    public static final Block SULFER_BRICK_STAIRS = registerBlock("sulfer_brick_stairs", new StairsBlock(POLISHED_SULFER.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SULFER)));
    public static final Block SULFER_BRICK_SLAB = registerBlock("sulfer_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SULFER)));
    public static final Block CINNABAR_BRICK_STAIRS = registerBlock("cinnabar_brick_stairs", new StairsBlock(POLISHED_CINNABAR.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_CINNABAR)));
    public static final Block CINNABAR_BRICK_SLAB = registerBlock("cinnabar_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_CINNABAR)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(SULFER_BLOCK);
            entries.add(CINNABAR_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(SULFER_BLOCK);
            entries.add(CINNABAR_BLOCK);

            entries.add(CHISELED_SULFER);
            entries.add(CHISELED_CINNABAR);

            entries.add(POLISHED_SULFER);
            entries.add(POLISHED_CINNABAR);
            entries.add(POLISHED_SULFER_STAIRS);
            entries.add(POLISHED_SULFER_SLAB);
            entries.add(POLISHED_SULFER_WALL);
            entries.add(POLISHED_CINNABAR_STAIRS);
            entries.add(POLISHED_CINNABAR_SLAB);
            entries.add(POLISHED_CINNABAR_WALL);

            entries.add(SULFER_BRICKS);
            entries.add(CINNABAR_BRICKS);
            entries.add(SULFER_BRICK_STAIRS);
            entries.add(SULFER_BRICK_SLAB);
            entries.add(CINNABAR_BRICK_STAIRS);
            entries.add(CINNABAR_BRICK_SLAB);
        });
    }
}
