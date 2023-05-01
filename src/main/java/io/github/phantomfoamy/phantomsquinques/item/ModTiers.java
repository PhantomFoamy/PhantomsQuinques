package io.github.phantomfoamy.phantomsquinques.item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier QUINQUE = new ForgeTier(4, 2031, 9.0F, 4.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.KAGUNE.get()));
}