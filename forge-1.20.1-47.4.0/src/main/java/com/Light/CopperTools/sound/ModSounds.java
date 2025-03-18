package com.Light.CopperTools.sound;

import com.Light.CopperTools.main.CopperTools;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CopperTools.MOD_ID);

    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_COPPER = SOUNDS.register("armor_equip_copper",()->SoundEvent.createVariableRangeEvent(new ResourceLocation(CopperTools.MOD_ID,"armor_equip_copper")));
}
