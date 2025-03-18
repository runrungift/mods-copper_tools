package com.Light.CopperTools.main;

import com.Light.CopperTools.regi.CopperToolsItems;
import com.Light.CopperTools.regi.tab.CopperToolsTabs;
import com.Light.CopperTools.sound.ModSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.IModBusEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("coppertools")
//@Mod("半角英字のみ")

public class CopperTools {
    // MOD_IDの定義
    public static final String MOD_ID = "coppertools";

    public CopperTools(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CopperToolsItems.ITEMS.register(bus);
        CopperToolsTabs.MOD_TABS.register(bus);
        ModSounds.SOUNDS.register(bus);
    }
}
