package io.github.phantomfoamy.phantomsquinques.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DoujimaKaiItem extends Quinque{
    public DoujimaKaiItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties,
                          String description, String type, String rate, String ghoul) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties, description, type, rate, ghoul);
    }
}
