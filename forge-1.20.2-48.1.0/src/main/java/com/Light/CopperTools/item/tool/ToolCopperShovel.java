package com.Light.CopperTools.item.tool;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ToolCopperShovel extends ShovelItem {
    public ToolCopperShovel() {
        super(Tiers.IRON,1.5F,-3.0F,new Properties().durability(200));
    }
}
