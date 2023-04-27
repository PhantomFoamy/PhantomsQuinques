package io.github.phantomfoamy.phantomsquinques.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PHANTOMS_QUINQUES_TAB = new CreativeModeTab("phantomsquinques_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JASON.get());
        }
    };
}
