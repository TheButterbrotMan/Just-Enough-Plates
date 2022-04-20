package io.github.thebutterbrotman.just_enough_plates.common.item;

import io.github.thebutterbrotman.just_enough_plates.JustEnoughPlates;
import io.github.thebutterbrotman.just_enough_plates.common.item.impl.PlateItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Leather
    public static final Item LEATHER_PLATE = registerItem("leather_plate"
            , new PlateItem());
    //Iron
    public static final Item IRON_PLATE = registerItem("iron_plate"
            , new PlateItem());

    //Golden
    public static final Item GOLDEN_PLATE = registerItem("golden_plate"
            , new PlateItem());

    //Diamond
    public static final Item DIAMOND_PLATE = registerItem("diamond_plate"
            , new PlateItem());

    //Netherite
    public static final Item NETHERITE_PLATE = registerItem("netherite_plate"
            , new PlateItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustEnoughPlates.MOD_ID, name), item);
    }

    public static void registerItems() {

    }

}
