package AdvancedMetalurgy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import AdvancedMetalurgy.items.CopperIngot;
import AdvancedMetalurgy.tools.AxeBase;
import AdvancedMetalurgy.tools.CustomToolMaterial;
import AdvancedMetalurgy.tools.HoeBase;
import AdvancedMetalurgy.tools.PickaxeBase;
import AdvancedMetalurgy.tools.ShovelBase;
import AdvancedMetalurgy.armor.CustomArmorMaterial;
import AdvancedMetalurgy.blocks.CopperBlock;
import AdvancedMetalurgy.blocks.CopperOre;
import AdvancedMetalurgy.blocks.SteelBlock;

public class AdvancedMetalurgyMain implements ModInitializer {
    //mod settings
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "adv-metal";
    public static final String MOD_NAME = "AdvancedMetalurgy";

    //items
    public static final Item COPPER_INGOT_ITEM = new CopperIngot();
    public static final Item STEEL_INGOT_ITEM = new CopperIngot();

    //blocks
    public static final Block COPPER_ORE_BLOCK = new CopperOre();
    public static final Block COPPER_BLOCK_BLOCK = new CopperBlock();
    public static final Block STEEL_BLOCK_BLOCK = new SteelBlock();

    //armor
    public static final Item COPPER_HELMET_ARMOR = new ArmorItem(CustomArmorMaterial.COPPER, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_CHESTPLATE_ARMOR = new ArmorItem(CustomArmorMaterial.COPPER, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_LEGGINGS_ARMOR = new ArmorItem(CustomArmorMaterial.COPPER, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_BOOTS_ARMOR = new ArmorItem(CustomArmorMaterial.COPPER, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item STEEL_HELMET_ARMOR = new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item STEEL_CHESTPLATE_ARMOR = new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item STEEL_LEGGINGS_ARMOR = new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item STEEL_BOOTS_ARMOR = new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));  

    //tools
    public static final Item COPPER_PICKAXE_TOOL = new PickaxeBase(CustomToolMaterial.COPPER);
    public static final Item COPPER_SHOVEL_TOOL = new ShovelBase(CustomToolMaterial.COPPER);
    public static final Item COPPER_AXE_TOOL = new AxeBase(CustomToolMaterial.COPPER);
    public static final Item COPPER_HOE_TOOL = new HoeBase(CustomToolMaterial.COPPER);

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        //ingots
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_ingot"), COPPER_INGOT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), STEEL_INGOT_ITEM);

        //copper ore
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "copper_ore"), COPPER_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_ore"), new BlockItem(COPPER_ORE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
        
        //copper block
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "copper_block"), COPPER_BLOCK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_block"), new BlockItem(COPPER_BLOCK_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

        //steel block
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
        
        //copper armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_helmet"), COPPER_HELMET_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_leggings"), COPPER_LEGGINGS_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_boots"), COPPER_BOOTS_ARMOR);

        //copper items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_pickaxe"), COPPER_PICKAXE_TOOL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_shovel"), COPPER_SHOVEL_TOOL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_axe"), COPPER_AXE_TOOL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_hoe"), COPPER_HOE_TOOL);

        //steel armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_helmet"), STEEL_HELMET_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_chestplate"), STEEL_CHESTPLATE_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_leggings"), STEEL_LEGGINGS_ARMOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_boots"), STEEL_BOOTS_ARMOR);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}