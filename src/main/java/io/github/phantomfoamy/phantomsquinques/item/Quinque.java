package io.github.phantomfoamy.phantomsquinques.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Quinque extends SwordItem{
    public String description;
    public String type;
    public String rate;
    public String ghoul;
    public Quinque(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties, String description, String type, String rate, String ghoul) {
        super(pTier,pAttackDamageModifier,pAttackSpeedModifier,pProperties);
        this.description = description;
        this.type = type;
        this.rate = rate;
        this.ghoul = ghoul;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TextComponent(description).withStyle(ChatFormatting.GOLD));
        pTooltipComponents.add(new TextComponent("Type: "+type).withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(new TextComponent("Rate: "+rate).withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(new TextComponent("Ghoul: "+ghoul).withStyle(ChatFormatting.GRAY));
    }
}
