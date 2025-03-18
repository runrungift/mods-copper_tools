package com.Light.CopperTools.item.tool;

import com.Light.CopperTools.main.CopperTools;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class CopperTiers {
    public static final ForgeTier COPPRE = new ForgeTier(1,200,6.0F,0.0F,5, BlockTags.NEEDS_IRON_TOOL,()-> Ingredient.of(Items.WAXED_COPPER_BLOCK));

    static {
        TierSortingRegistry.registerTier(COPPRE,new ResourceLocation(CopperTools.MOD_ID,"copper"), List.of(Tiers.STONE),List.of(Tiers.IRON));
    }
}
