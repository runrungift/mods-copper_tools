package com.Light.CopperTools.item.tool;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ToolCopperAxe extends AxeItem {
    public ToolCopperAxe() {
        super(Tiers.IRON,6.0F,-3.1F,new Properties().durability(200));
    }
}
