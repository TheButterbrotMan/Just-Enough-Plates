package io.github.thebutterbrotman.just_enough_plates;

import io.github.thebutterbrotman.just_enough_plates.common.compatibilities.item.InterModItems;
import io.github.thebutterbrotman.just_enough_plates.common.compatibilities.resourcePack.InterModResourcePacks;
import io.github.thebutterbrotman.just_enough_plates.common.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JustEnoughPlates implements ModInitializer {

    public static final String MOD_ID = "just_enough_plates";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        InterModItems.registerItems();
        InterModResourcePacks.registerPacks();
    }
}
