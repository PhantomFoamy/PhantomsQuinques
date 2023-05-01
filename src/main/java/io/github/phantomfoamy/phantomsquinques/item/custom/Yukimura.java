package io.github.phantomfoamy.phantomsquinques.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.advancements.critereon.DamageSourcePredicate;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Yukimura extends Quinque{
    CompoundTag nbtdata = new CompoundTag();
    int counter = 0;
    public Yukimura(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties, String description, String type, String rate, String ghoul) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties, description, type, rate, ghoul);
        nbtdata.putBoolean("phantomsquinques.has_blood_bonus", false);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        if(nbtdata.getBoolean("phantomsquinques.has_blood_bonus")){
            pTarget.hurt(DamageSource.MAGIC, 1000);
        }
        pAttacker.sendMessage(new TextComponent("Hit Enemy"), pAttacker.getUUID());
        nbtdata.putBoolean("phantomsquinques.has_blood_bonus", true);
        counter = 0;
        pAttacker.sendMessage(new TextComponent("has blood bonus tag: "+nbtdata.getBoolean("phantomsquinques.has_blood_bonus")), pAttacker.getUUID());
        pStack.setTag(nbtdata);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }


    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        //pEntity.sendMessage(new TextComponent(String.valueOf(counter)), pEntity.getUUID());
        if(nbtdata.getBoolean("phantomsquinques.has_blood_bonus")) {
            counter++;
            if (counter == 40) {
                nbtdata.putBoolean("phantomsquinques.has_blood_bonus", false);
                pEntity.sendMessage(new TextComponent("Bonus finished"), pEntity.getUUID());
                counter = 0;
                pEntity.sendMessage(new TextComponent("has blood bonus tag: "+nbtdata.getBoolean("phantomsquinques.has_blood_bonus")), pEntity.getUUID());
                pStack.setTag(nbtdata);
            }
       }
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }
}
