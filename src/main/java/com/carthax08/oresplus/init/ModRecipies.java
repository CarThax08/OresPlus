package com.carthax08.oresplus.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipies
{



    public static void init()
    {
        GameRegistry.addSmelting(ModBlocks.COBALT_ORE, new ItemStack(ModItems.COBALT_CHUNK, 1), 1.0f);
        GameRegistry.addSmelting(ModItems.COBALT_CHUNK, new ItemStack(ModItems.COBALT_PIECE, 1), 2.0f);
        GameRegistry.addSmelting(ModItems.COBALT_PIECE, new ItemStack(ModItems.COBALT_NUGGET, 1), 3.0f);
        GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_NUGGET, 1), 1);








    }
}
