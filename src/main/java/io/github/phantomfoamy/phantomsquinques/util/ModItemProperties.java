package io.github.phantomfoamy.phantomsquinques.util;

import io.github.phantomfoamy.phantomsquinques.PhantomsQuinques;
import io.github.phantomfoamy.phantomsquinques.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.YUKIMURA.get(), new ResourceLocation(PhantomsQuinques.MOD_ID, "has_blood_bonus"),
                ((pStack, pLevel, pEntity, pSeed) -> (pStack.getTag().getInt("phantomsquinques.blood_bonus_counter") > 0 ? 1f : 0f)));
                        //pStack.hasTag() ? 1f : 0f));
    }
}
