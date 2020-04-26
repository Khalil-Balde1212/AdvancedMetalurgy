package AdvancedMetalurgy.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(final ToolMaterial toolMaterial) {
        super(toolMaterial, -1, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}