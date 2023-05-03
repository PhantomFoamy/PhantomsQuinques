package io.github.phantomfoamy.phantomsquinques.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class YukimuraItem extends Quinque{
    CompoundTag nbtdata = new CompoundTag();
    public YukimuraItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties, String description, String type, String rate, String ghoul) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties, description, type, rate, ghoul);
        nbtdata.putInt("phantomsquinques.blood_bonus_counter", 0);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        if(nbtdata.getInt("phantomsquinques.blood_bonus_counter") > 0){
            pTarget.hurt(DamageSource.MAGIC, 1000);
        }
        nbtdata.putInt("phantomsquinques.blood_bonus_counter", 80);
        pStack.setTag(nbtdata);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if(nbtdata.getInt("phantomsquinques.blood_bonus_counter") == 0) {
            pStack.setTag(nbtdata);
        }
        if(nbtdata.getInt("phantomsquinques.blood_bonus_counter") > 0) {
            nbtdata.putInt("phantomsquinques.blood_bonus_counter", nbtdata.getInt("phantomsquinques.blood_bonus_counter") - 1);
        }

    }
}
