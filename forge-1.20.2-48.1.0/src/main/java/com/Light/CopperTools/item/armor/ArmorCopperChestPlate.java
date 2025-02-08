package com.Light.CopperTools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;

public class ArmorCopperChestPlate extends ArmorItem {
    public ArmorCopperChestPlate() {
        super(ArmorMaterials.IRON,Type.CHESTPLATE,new Properties().durability(200));
    }
}
