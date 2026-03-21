package dev.astral.sulpher_backport;

import dev.astral.sulpher_backport.common.init.SBBlocks;
import net.fabricmc.api.ModInitializer;

public class Sulpher_backport implements ModInitializer {
    public static final String MOD_ID = "sulpher_backport";

    @Override
    public void onInitialize() {
        SBBlocks.init();
    }
}
