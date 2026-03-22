package dev.astral.sulphur_backport.common.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import static dev.astral.sulphur_backport.Sulphur_backport.MOD_ID;

public class SBBlocks {

    public static final Block SULPHUR_BLOCK = registerBlock("sulphur_block", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.RED)));

    public static final Block SULPHUR_STAIRS = registerBlock("sulphur_stairs", new StairsBlock(SULPHUR_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SULPHUR_BLOCK)));
    public static final Block SULPHUR_SLAB = registerBlock("sulphur_slab", new SlabBlock(AbstractBlock.Settings.copy(SULPHUR_BLOCK)));
    public static final Block SULPHUR_WALL = registerBlock("sulphur_wall", new WallBlock(AbstractBlock.Settings.copy(SULPHUR_BLOCK)));

    public static final Block CINNABAR_STAIRS = registerBlock("cinnabar_stairs", new StairsBlock(CINNABAR_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CINNABAR_BLOCK)));
    public static final Block CINNABAR_SLAB = registerBlock("cinnabar_slab", new SlabBlock(AbstractBlock.Settings.copy(CINNABAR_BLOCK)));
    public static final Block CINNABAR_WALL = registerBlock("cinnabar_wall", new WallBlock(AbstractBlock.Settings.copy(CINNABAR_BLOCK)));


    public static final Block CHISELED_SULPHUR = registerBlock("chiseled_sulphur", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block CHISELED_CINNABAR = registerBlock("chiseled_cinnabar", new Block(AbstractBlock.Settings.copy(Blocks.DIORITE).mapColor(DyeColor.RED)));

    public static final Block POLISHED_SULPHUR = registerBlock("polished_sulphur", new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_CINNABAR = registerBlock("polished_cinnabar", new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).mapColor(DyeColor.RED)));
    public static final Block POLISHED_SULPHUR_STAIRS = registerBlock("polished_sulphur_stairs", new StairsBlock(POLISHED_SULPHUR.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SULPHUR)));
    public static final Block POLISHED_SULPHUR_SLAB = registerBlock("polished_sulphur_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SULPHUR)));
    public static final Block POLISHED_SULPHUR_WALL = registerBlock("polished_sulphur_wall", new WallBlock(AbstractBlock.Settings.copy(POLISHED_SULPHUR)));
    public static final Block POLISHED_CINNABAR_STAIRS = registerBlock("polished_cinnabar_stairs", new StairsBlock(POLISHED_CINNABAR.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_CINNABAR)));
    public static final Block POLISHED_CINNABAR_SLAB = registerBlock("polished_cinnabar_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_CINNABAR)));
    public static final Block POLISHED_CINNABAR_WALL = registerBlock("polished_cinnabar_wall", new WallBlock(AbstractBlock.Settings.copy(POLISHED_CINNABAR)));

    public static final Block SULPHUR_BRICKS = registerBlock("sulphur_bricks", new Block(AbstractBlock.Settings.copy(POLISHED_SULPHUR).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BRICKS = registerBlock("cinnabar_bricks", new Block(AbstractBlock.Settings.copy(POLISHED_CINNABAR).mapColor(DyeColor.RED)));
    public static final Block SULPHUR_BRICK_STAIRS = registerBlock("sulphur_brick_stairs", new StairsBlock(POLISHED_SULPHUR.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SULPHUR)));
    public static final Block SULPHUR_BRICK_SLAB = registerBlock("sulphur_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SULPHUR)));
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
            entries.addAfter(Blocks.CALCITE, SULPHUR_BLOCK);
            entries.addAfter(SULPHUR_BLOCK, CINNABAR_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(SULPHUR_BLOCK);
            entries.add(SULPHUR_STAIRS);
            entries.add(SULPHUR_SLAB);
            entries.add(SULPHUR_WALL);
            entries.add(CHISELED_SULPHUR);
            entries.add(POLISHED_SULPHUR);
            entries.add(POLISHED_SULPHUR_STAIRS);
            entries.add(POLISHED_SULPHUR_SLAB);
            entries.add(POLISHED_SULPHUR_WALL);
            entries.add(SULPHUR_BRICKS);
            entries.add(SULPHUR_BRICK_STAIRS);
            entries.add(SULPHUR_BRICK_SLAB);

            entries.add(CINNABAR_BLOCK);
            entries.add(CINNABAR_STAIRS);
            entries.add(CINNABAR_SLAB);
            entries.add(CINNABAR_WALL);
            entries.add(CHISELED_CINNABAR);
            entries.add(POLISHED_CINNABAR);
            entries.add(POLISHED_CINNABAR_STAIRS);
            entries.add(POLISHED_CINNABAR_SLAB);
            entries.add(POLISHED_CINNABAR_WALL);
            entries.add(CINNABAR_BRICKS);
            entries.add(CINNABAR_BRICK_STAIRS);
            entries.add(CINNABAR_BRICK_SLAB);
        });
    }
}
