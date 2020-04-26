package AdvancedMetalurgy.tools;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial){
        super(toolMaterial, -1, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}