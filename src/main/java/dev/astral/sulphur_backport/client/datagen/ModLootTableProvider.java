package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    protected ModLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(SBBlocks.SULPHUR_BLOCK);
        dropSelf(SBBlocks.CINNABAR_BLOCK);

        dropSelf(SBBlocks.SULPHUR_STAIRS);
        createSlabItemTable(SBBlocks.SULPHUR_SLAB);
        dropSelf(SBBlocks.SULPHUR_WALL);

        dropSelf(SBBlocks.CINNABAR_STAIRS);
        createSlabItemTable(SBBlocks.CINNABAR_SLAB);
        dropSelf(SBBlocks.CINNABAR_WALL);

        dropSelf(SBBlocks.CHISELED_SULPHUR);
        dropSelf(SBBlocks.CHISELED_CINNABAR);

        dropSelf(SBBlocks.POLISHED_SULPHUR);
        dropSelf(SBBlocks.POLISHED_CINNABAR);
        dropSelf(SBBlocks.POLISHED_SULPHUR_STAIRS);
        createSlabItemTable(SBBlocks.POLISHED_SULPHUR_SLAB);
        dropSelf(SBBlocks.POLISHED_SULPHUR_WALL);
        dropSelf(SBBlocks.POLISHED_CINNABAR_STAIRS);
        createSlabItemTable(SBBlocks.POLISHED_CINNABAR_SLAB);
        dropSelf(SBBlocks.POLISHED_CINNABAR_WALL);

        dropSelf(SBBlocks.SULPHUR_BRICKS);
        dropSelf(SBBlocks.CINNABAR_BRICKS);
        dropSelf(SBBlocks.SULPHUR_BRICK_STAIRS);
        createSlabItemTable(SBBlocks.SULPHUR_BRICK_SLAB);
        dropSelf(SBBlocks.CINNABAR_BRICK_STAIRS);
        createSlabItemTable(SBBlocks.CINNABAR_BRICK_SLAB);

    }
}