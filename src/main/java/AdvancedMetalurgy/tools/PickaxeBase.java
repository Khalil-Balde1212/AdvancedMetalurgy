package AdvancedMetalurgy.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial toolMaterial){
        super(toolMaterial, -1, -1f, new FabricItemSettings().group(ItemGroup.TOOLS));
    }
}