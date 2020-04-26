package AdvancedMetalurgy.tools;

import AdvancedMetalurgy.AdvancedMetalurgyMain;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum CustomToolMaterial implements ToolMaterial {
    COPPER(1.5f, 5, 100, 15, 2, Ingredient.ofItems(AdvancedMetalurgyMain.COPPER_INGOT_ITEM));
    ;
    float attackDamage;
    float miningSpeed;
    int durability;
    int enchantability;
    int miningLevel;
    Ingredient repairMaterial;

    CustomToolMaterial(float attackDamage, float miningSpeed, int durability, int enchantability, int miningLevel, Ingredient repairMaterial){
        this.attackDamage = attackDamage;
        this.miningSpeed = miningSpeed;
        this.durability = durability;
        this.enchantability = enchantability;
        this.miningLevel = miningLevel;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeed() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }

    
}