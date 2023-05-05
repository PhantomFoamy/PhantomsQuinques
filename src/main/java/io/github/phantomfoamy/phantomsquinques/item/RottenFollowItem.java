package io.github.phantomfoamy.phantomsquinques.item;

import io.github.phantomfoamy.phantomsquinques.PhantomsQuinques;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;

public class RottenFollowItem extends Quinque {
    private Method actuallyHurt;

    {
        try {
            actuallyHurt = LivingEntity.class.getDeclaredMethod("hurt", DamageSource.class, float.class);
            actuallyHurt.setAccessible(true);
        } catch (NoSuchMethodException e) {
            PhantomsQuinques.LOGGER.error(e.getMessage());
        }
    }

    public RottenFollowItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties, String description, String type, String rate, String ghoul) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties, description, type, rate, ghoul);
    }

    @Override
    public int getUseDuration(@NotNull ItemStack pStack) {
        return 72000;
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        return true;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, @NotNull InteractionHand pUsedHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pUsedHand);
        if (!pLevel.isClientSide()) return InteractionResultHolder.pass(itemStack);
        if (pUsedHand.equals(InteractionHand.MAIN_HAND)) {
            if (Minecraft.getInstance().crosshairPickEntity instanceof LivingEntity enemy) {
                PhantomsQuinques.LOGGER.info(pPlayer.distanceTo(enemy));
                if (pPlayer.distanceTo(enemy) <= 1.66 && enemy.isAttackable()) {
                    PhantomsQuinques.LOGGER.info("your mother");
                    //enemy.hurt(new DamageSource("yay"), 1.0F); TODO: Fix damaging mobs. This doesn't work. I have no clue why. aaaaaaaaa
                }
            } else {
                return InteractionResultHolder.pass(itemStack);
            }
            return InteractionResultHolder.success(itemStack);
        } else {
            return InteractionResultHolder.pass(itemStack);
        }
    }
}
