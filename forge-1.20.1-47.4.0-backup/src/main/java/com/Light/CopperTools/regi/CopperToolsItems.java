package com.Light.CopperTools.regi;

import com.Light.CopperTools.item.ItemCopperNugget;
import com.Light.CopperTools.item.armor.ArmorCopperBoots;
import com.Light.CopperTools.item.armor.ArmorCopperChestPlate;
import com.Light.CopperTools.item.armor.ArmorCopperHelmet;
import com.Light.CopperTools.item.armor.ArmorCopperLeggings;
import com.Light.CopperTools.item.tool.*;
import com.Light.CopperTools.main.CopperTools;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CopperToolsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperTools.MOD_ID);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemCopperNugget::new);

    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ToolCopperPickaxe::new);
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", ToolCopperAxe::new);
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", ToolCopperHoe::new);
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", ToolCopperShovel::new);
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", ToolCopperSword::new);

    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", ArmorCopperHelmet::new);
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ArmorCopperChestPlate::new);
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ArmorCopperLeggings::new);
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", ArmorCopperBoots::new);
}