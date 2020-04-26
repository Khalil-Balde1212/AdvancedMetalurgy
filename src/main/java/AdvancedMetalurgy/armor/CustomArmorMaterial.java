package AdvancedMetalurgy.armor;

import AdvancedMetalurgy.AdvancedMetalurgyMain;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum CustomArmorMaterial implements ArmorMaterial {
    COPPER("copper", 7, new int[]{1,3,2,1}, 15, SoundEvents.BLOCK_WOOL_PLACE, 0.0F, Ingredient.ofItems(AdvancedMetalurgyMain.COPPER_INGOT_ITEM)),
    STEEL("steel", 20, new int[]{1,3,2,1}, 10, SoundEvents.BLOCK_WOOL_PLACE, 0.0f, Ingredient.ofItems(AdvancedMetalurgyMain.STEEL_INGOT_ITEM));

    private static final int[] baseDurability = {13, 15, 16, 11};
    private static final int[] protectionAmounts = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Ingredient repairIngredient;

    CustomArmorMaterial(final String name, final int durabilityMultiplier, final int[] armorValueArr, final int enchantability, final SoundEvent soundEvent, final float toughness, final Ingredient repairIngredient){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorValues = armorValueArr;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(final EquipmentSlot slot) {
        return baseDurability[slot.getEntitySlotId()] * durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(final EquipmentSlot slot) {
        return protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }
    
}