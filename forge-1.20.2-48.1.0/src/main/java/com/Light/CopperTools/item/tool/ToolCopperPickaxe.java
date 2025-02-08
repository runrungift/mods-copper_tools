package com.Light.CopperTools.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ToolCopperPickaxe extends PickaxeItem {
    public ToolCopperPickaxe() {
        super(Tiers.IRON,1,-2.8F,new Properties().durability(200));
    }
}
