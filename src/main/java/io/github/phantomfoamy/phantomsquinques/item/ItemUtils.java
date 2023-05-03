package io.github.phantomfoamy.phantomsquinques.item;

import net.minecraft.world.item.ItemStack;

public class ItemUtils {

    public static ItemStack replaceItem(ItemStack pEmptyStack, ItemStack pFilledStack) {
        pEmptyStack.shrink(1);
        return pFilledStack;
    }
}
