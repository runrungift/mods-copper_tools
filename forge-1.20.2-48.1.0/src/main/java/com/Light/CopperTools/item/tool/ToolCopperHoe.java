package com.Light.CopperTools.item.tool;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ToolCopperHoe extends HoeItem {
    public ToolCopperHoe() {
        super(Tiers.IRON,-2,-1.0F,new Properties().durability(200));
    }
}
