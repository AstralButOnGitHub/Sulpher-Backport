package dev.astral.sulphur_backport.client.datagen;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(SBBlocks.POTENT_SULPHUR);

        addDrop(SBBlocks.SULPHUR_BLOCK);
        addDrop(SBBlocks.CINNABAR_BLOCK);

        addDrop(SBBlocks.SULPHUR_STAIRS);
        addDrop(SBBlocks.SULPHUR_SLAB, slabDrops(SBBlocks.SULPHUR_SLAB));
        addDrop(SBBlocks.SULPHUR_WALL);

        addDrop(SBBlocks.CINNABAR_STAIRS);
        addDrop(SBBlocks.CINNABAR_SLAB, slabDrops(SBBlocks.CINNABAR_SLAB));
        addDrop(SBBlocks.CINNABAR_WALL);

        addDrop(SBBlocks.CHISELED_SULPHUR);
        addDrop(SBBlocks.CHISELED_CINNABAR);

        addDrop(SBBlocks.POLISHED_SULPHUR);
        addDrop(SBBlocks.POLISHED_CINNABAR);
        addDrop(SBBlocks.POLISHED_SULPHUR_STAIRS);
        addDrop(SBBlocks.POLISHED_SULPHUR_SLAB, slabDrops(SBBlocks.POLISHED_SULPHUR_SLAB));
        addDrop(SBBlocks.POLISHED_SULPHUR_WALL);
        addDrop(SBBlocks.POLISHED_CINNABAR_STAIRS);
        addDrop(SBBlocks.POLISHED_CINNABAR_SLAB, slabDrops(SBBlocks.POLISHED_CINNABAR_SLAB));
        addDrop(SBBlocks.POLISHED_CINNABAR_WALL);

        addDrop(SBBlocks.SULPHUR_BRICKS);
        addDrop(SBBlocks.CINNABAR_BRICKS);
        addDrop(SBBlocks.SULPHUR_BRICK_STAIRS);
        addDrop(SBBlocks.SULPHUR_BRICK_SLAB, slabDrops(SBBlocks.SULPHUR_BRICK_SLAB));
        addDrop(SBBlocks.SULPHUR_BRICK_WALL);
        addDrop(SBBlocks.CINNABAR_BRICK_STAIRS);
        addDrop(SBBlocks.CINNABAR_BRICK_SLAB, slabDrops(SBBlocks.CINNABAR_BRICK_SLAB));
        addDrop(SBBlocks.CINNABAR_BRICK_WALL);
    }

}