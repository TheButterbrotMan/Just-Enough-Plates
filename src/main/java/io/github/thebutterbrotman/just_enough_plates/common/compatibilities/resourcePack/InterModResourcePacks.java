package io.github.thebutterbrotman.just_enough_plates.common.compatibilities.resourcePack;

import io.github.thebutterbrotman.just_enough_plates.JustEnoughPlates;
import io.github.thebutterbrotman.just_enough_plates.common.compatibilities.util.IMUtils;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

import static io.github.thebutterbrotman.just_enough_plates.common.compatibilities.util.IMUtils.jepPrefix;

public class InterModResourcePacks {
    public static void registerPacks() {
        if (IMUtils.DIRTMONDS_LOADED) lazyRegisterBuiltIn(IMUtils.DIRTMONDS_MODID, IMUtils.DIRTMONDS_MODNAME);
        if (IMUtils.THERRASSIUM_LOADED) lazyRegisterBuiltIn(IMUtils.THERRASSIUM_MODID, IMUtils.THERRASSIUM_MODNAME);
        if (IMUtils.AMETHYSTEQUIPMENT_LOADED) lazyRegisterBuiltIn(IMUtils.AMETHYSTEQUIPMENT_MODID, IMUtils.AMETHYSTEQUIPMENT_MODNAME);
        if (IMUtils.ADVENTUREZ_LOADED) lazyRegisterBuiltIn(IMUtils.ADVENTUREZ_MODID, IMUtils.ADVENTUREZ_MODNAME);
        if (IMUtils.MCA_LOADED) lazyRegisterBuiltIn(IMUtils.MCA_MODID, IMUtils.MCA_MODNAME);
    }
    public static void lazyRegisterBuiltIn(String modid, String modName) {
        IMUtils.logInterModRegStatus(modName, IMUtils.PACK, false);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(jepPrefix(modid)), FabricLoader.getInstance().getModContainer(JustEnoughPlates.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
        IMUtils.logInterModRegStatus(modName, IMUtils.PACK, true);
    }
}
