package com.Light.CopperTools.regi;

import com.Light.CopperTools.item.ItemCopperNugget;
import com.Light.CopperTools.main.CopperTools;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CopperToolsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperTools.MOD_ID);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemCopperNugget::new);
}
