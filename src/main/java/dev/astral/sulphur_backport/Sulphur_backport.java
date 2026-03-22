package dev.astral.sulphur_backport;

import dev.astral.sulphur_backport.common.init.SBBlocks;
import net.fabricmc.api.ModInitializer;

public class Sulphur_backport implements ModInitializer {
    public static final String MOD_ID = "sulphur_backport";

    @Override
    public void onInitialize() {
        SBBlocks.init();
    }
}
