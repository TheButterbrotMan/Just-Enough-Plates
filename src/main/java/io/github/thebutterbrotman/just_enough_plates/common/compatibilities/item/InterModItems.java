package io.github.thebutterbrotman.just_enough_plates.common.compatibilities.item;

import io.github.thebutterbrotman.just_enough_plates.JustEnoughPlates;
import io.github.thebutterbrotman.just_enough_plates.common.compatibilities.util.IMUtils;
import io.github.thebutterbrotman.just_enough_plates.common.item.impl.PlateItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class InterModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustEnoughPlates.MOD_ID, name), item);

    }

    public static void registerItems() {

        //Dirtmonds
        if (IMUtils.DIRTMONDS_LOADED) {
            IMUtils.logInterModRegStatus(IMUtils.DIRTMONDS_MODNAME, IMUtils.REG, false);

            Item DIRTMOND_PLATE = registerItem("dirtmond_plate"
                    , new PlateItem());

            IMUtils.logInterModRegStatus(IMUtils.DIRTMONDS_MODNAME, IMUtils.REG, true);
        }
        //Therrassium
        if (IMUtils.THERRASSIUM_LOADED) {
            IMUtils.logInterModRegStatus(IMUtils.THERRASSIUM_MODNAME, IMUtils.REG, false);

            Item THERRASSIUM_PLATE = registerItem("therrassium_plate"
                    , new PlateItem());
        }
            //Amethyst Equipment
        if (IMUtils.AMETHYSTEQUIPMENT_LOADED) {
            IMUtils.logInterModRegStatus(IMUtils.AMETHYSTEQUIPMENT_MODNAME, IMUtils.REG, false);

            Item AMETHYSTEQUIPMENT_PLATE = registerItem("amethyst_plate"
                    , new PlateItem());
        }
        //AdventureZ
        if (IMUtils.ADVENTUREZ_LOADED) {
            IMUtils.logInterModRegStatus(IMUtils.ADVENTUREZ_MODNAME, IMUtils.REG, false);

            Item GILDED_NETHERITE_PLATE = registerItem("gilded_netherite_plate"
                    , new PlateItem());
        }
        //Minecraft Comes Alive
        if (IMUtils.MCA_LOADED) {
            IMUtils.logInterModRegStatus(IMUtils.MCA_MODNAME, IMUtils.REG, false);

            Item ROSE_GOLD_PLATE = registerItem("rose_gold_plate"
                    , new PlateItem());
        }
                    IMUtils.logInterModRegStatus(IMUtils.ADVENTUREZ_MODNAME, IMUtils.REG, true);
                }
            }

