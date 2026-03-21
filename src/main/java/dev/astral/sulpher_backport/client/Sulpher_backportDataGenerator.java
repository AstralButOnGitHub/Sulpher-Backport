package dev.astral.sulpher_backport.client;

import dev.astral.sulpher_backport.client.datagen.ModBlockTagProvider;
import dev.astral.sulpher_backport.client.datagen.ModLootTableProvider;
import dev.astral.sulpher_backport.client.datagen.ModModelProvider;
import dev.astral.sulpher_backport.client.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Sulpher_backportDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
    }
}
