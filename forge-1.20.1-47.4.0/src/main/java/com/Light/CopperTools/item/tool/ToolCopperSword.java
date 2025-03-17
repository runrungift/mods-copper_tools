package com.Light.CopperTools.item.tool;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ToolCopperSword extends SwordItem {
    public ToolCopperSword() {
        super(Tiers.IRON,3,-2.4F,new Properties().durability(200));
    }
}
