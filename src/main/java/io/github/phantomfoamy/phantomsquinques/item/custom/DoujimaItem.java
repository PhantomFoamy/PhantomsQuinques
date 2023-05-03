package io.github.phantomfoamy.phantomsquinques.item.custom;

import io.github.phantomfoamy.phantomsquinques.item.ItemUtils;
import io.github.phantomfoamy.phantomsquinques.item.ModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DoujimaItem extends Quinque{
    public DoujimaItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties,
                       String description, String type, String rate, String ghoul) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties, description, type, rate, ghoul);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.knockback(1.4f, -pAttacker.getLookAngle().x, -pAttacker.getLookAngle().z);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        InteractionHand mainHand = InteractionHand.MAIN_HAND;
        ItemStack itemStack = pPlayer.getMainHandItem();
        if (pUsedHand.equals(mainHand)) {
            ItemStack itemstack2;
            if (itemStack.is(ModItems.DOUJIMA.get())) {
                itemstack2 = ItemUtils.replaceItem(itemStack, ModItems.DOUJIMA_KAI.get().getDefaultInstance());
            } else {
                itemstack2 = ItemUtils.replaceItem(itemStack, ModItems.DOUJIMA.get().getDefaultInstance());
            }
            return InteractionResultHolder.sidedSuccess(itemstack2, pLevel.isClientSide());
        } else {
            return InteractionResultHolder.pass(itemStack);
        }
    }
}
