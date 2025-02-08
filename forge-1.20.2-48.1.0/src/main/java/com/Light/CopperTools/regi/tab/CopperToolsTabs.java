package com.Light.CopperTools.regi.tab;

import com.Light.CopperTools.main.CopperTools;
import com.Light.CopperTools.regi.CopperToolsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CopperToolsTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CopperTools.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COPPERTOOLS_MAIN = MOD_TABS.register("coppertools_main",
            ()->{return CreativeModeTab.builder()
                    .icon(()->new ItemStack(CopperToolsItems.COPPER_NUGGET.get()))
                    .title(Component.translatable("itemGroup.coppertools_main"))
                    .displayItems((param,output)->{
                        for (Item item:CopperToolsMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
}
