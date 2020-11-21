package com.carthax08.oresplus.items;

import com.carthax08.oresplus.Main;
import com.carthax08.oresplus.init.ModItems;
import com.carthax08.oresplus.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels()
    {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
