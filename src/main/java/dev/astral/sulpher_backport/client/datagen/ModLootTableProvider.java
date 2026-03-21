package dev.astral.sulpher_backport.client.datagen;

import dev.astral.sulpher_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(SBBlocks.SULFER_BLOCK);
        addDrop(SBBlocks.CINNABAR_BLOCK);
        addDrop(SBBlocks.POLISHED_SULFER);
        addDrop(SBBlocks.POLISHED_CINNABAR);
        addDrop(SBBlocks.POLISHED_SULFER_SLAB);
        addDrop(SBBlocks.POLISHED_SULFER_STAIRS);
        addDrop(SBBlocks.POLISHED_CINNABAR_SLAB);
        addDrop(SBBlocks.POLISHED_CINNABAR_STAIRS);
    }

}