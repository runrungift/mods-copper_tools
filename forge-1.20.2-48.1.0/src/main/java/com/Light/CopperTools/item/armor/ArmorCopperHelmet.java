package com.Light.CopperTools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;

public class ArmorCopperHelmet extends ArmorItem {
    public ArmorCopperHelmet() {
        super(ArmorMaterials.IRON,Type.HELMET,new Properties().durability(150));
    }
}
