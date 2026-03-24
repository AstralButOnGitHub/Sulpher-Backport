package dev.astral.sulphur_backport.common.init;

import dev.astral.sulphur_backport.common.blocks.PotentSulphurBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.function.Function;

import static dev.astral.sulphur_backport.Sulphur_backport.MOD_ID;

public class SBBlocks {    
    public static final Block POTENT_SULPHUR = registerBlock("potent_sulphur", properties -> new PotentSulphurBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));

    public static final Block SULPHUR_BLOCK = registerBlock("sulphur_block", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));

    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));

    public static final Block SULPHUR_STAIRS = registerBlock("sulphur_stairs", properties -> new StairBlock(SULPHUR_BLOCK.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block SULPHUR_SLAB = registerBlock("sulphur_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block SULPHUR_WALL = registerBlock("sulphur_wall", properties -> new WallBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));

    public static final Block CINNABAR_STAIRS = registerBlock("cinnabar_stairs", properties -> new StairBlock(CINNABAR_BLOCK.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_SLAB = registerBlock("cinnabar_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_WALL = registerBlock("cinnabar_wall", properties -> new WallBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));


    public static final Block CHISELED_SULPHUR = registerBlock("chiseled_sulphur", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block CHISELED_CINNABAR = registerBlock("chiseled_cinnabar", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));

    public static final Block POLISHED_SULPHUR = registerBlock("polished_sulphur", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_CINNABAR = registerBlock("polished_cinnabar", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));
    public static final Block POLISHED_SULPHUR_STAIRS = registerBlock("polished_sulphur_stairs", properties -> new StairBlock(POLISHED_SULPHUR.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_SULPHUR_SLAB = registerBlock("polished_sulphur_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_SULPHUR_WALL = registerBlock("polished_sulphur_wall", properties -> new WallBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block POLISHED_CINNABAR_STAIRS = registerBlock("polished_cinnabar_stairs", properties -> new StairBlock(POLISHED_CINNABAR.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));
    public static final Block POLISHED_CINNABAR_SLAB = registerBlock("polished_cinnabar_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));
    public static final Block POLISHED_CINNABAR_WALL = registerBlock("polished_cinnabar_wall", properties -> new WallBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));

    public static final Block SULPHUR_BRICKS = registerBlock("sulphur_bricks", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BRICKS = registerBlock("cinnabar_bricks", properties -> new Block(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED).mapColor(DyeColor.RED)));
    public static final Block SULPHUR_BRICK_STAIRS = registerBlock("sulphur_brick_stairs", properties -> new StairBlock(POLISHED_SULPHUR.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block SULPHUR_BRICK_SLAB = registerBlock("sulphur_brick_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.YELLOW)));
    public static final Block CINNABAR_BRICK_STAIRS = registerBlock("cinnabar_brick_stairs", properties -> new StairBlock(POLISHED_CINNABAR.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));
    public static final Block CINNABAR_BRICK_SLAB = registerBlock("cinnabar_brick_slab", properties -> new SlabBlock(properties.instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).mapColor(DyeColor.RED)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .registryKey(RegistryKey.of(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static void init() {
//        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
//            entries.addAfter(Blocks.CALCITE, SULPHUR_BLOCK);
//            entries.addAfter(SULPHUR_BLOCK, CINNABAR_BLOCK);
//        });
//
//        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
//            entries.add(SULPHUR_BLOCK);
//            entries.add(SULPHUR_STAIRS);
//            entries.add(SULPHUR_SLAB);
//            entries.add(SULPHUR_WALL);
//            entries.add(CHISELED_SULPHUR);
//            entries.add(POLISHED_SULPHUR);
//            entries.add(POLISHED_SULPHUR_STAIRS);
//            entries.add(POLISHED_SULPHUR_SLAB);
//            entries.add(POLISHED_SULPHUR_WALL);
//            entries.add(SULPHUR_BRICKS);
//            entries.add(SULPHUR_BRICK_STAIRS);
//            entries.add(SULPHUR_BRICK_SLAB);
//
//            entries.add(CINNABAR_BLOCK);
//            entries.add(CINNABAR_STAIRS);
//            entries.add(CINNABAR_SLAB);
//            entries.add(CINNABAR_WALL);
//            entries.add(CHISELED_CINNABAR);
//            entries.add(POLISHED_CINNABAR);
//            entries.add(POLISHED_CINNABAR_STAIRS);
//            entries.add(POLISHED_CINNABAR_SLAB);
//            entries.add(POLISHED_CINNABAR_WALL);
//            entries.add(CINNABAR_BRICKS);
//            entries.add(CINNABAR_BRICK_STAIRS);
//            entries.add(CINNABAR_BRICK_SLAB);
//        });
    }
}
