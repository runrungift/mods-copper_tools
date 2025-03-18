package com.Light.CopperTools.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemCopperNugget extends Item {
    public ItemCopperNugget() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)
        );
    }
}
