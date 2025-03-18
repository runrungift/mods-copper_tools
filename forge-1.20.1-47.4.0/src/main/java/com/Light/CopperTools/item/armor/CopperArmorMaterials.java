package com.Light.CopperTools.item.armor;

import com.Light.CopperTools.sound.ModSounds;
import net.minecraft.Util;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;

public class CopperArmorMaterials {

    public static final ModArmorMaterial COPPER = new ModArmorMaterial(
            "copper",
            12,
            Util.make(new EnumMap<>(ArmorItem.Type.class),
                    (type)->{
                type.put(ArmorItem.Type.HELMET,2);
                type.put(ArmorItem.Type.CHESTPLATE,6);
                type.put(ArmorItem.Type.LEGGINGS,5);
                type.put(ArmorItem.Type.BOOTS,2);

                    }),
            5,
            ModSounds.ARMOR_EQUIP_COPPER.get(),
            0.0F,
            0.0F,
            ()-> Ingredient.of(Items.WAXED_COPPER_BLOCK)
    );
}
