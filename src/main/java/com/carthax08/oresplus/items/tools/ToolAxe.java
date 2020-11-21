package com.carthax08.oresplus.items.tools;

import com.carthax08.oresplus.Main;
import com.carthax08.oresplus.init.ModItems;
import com.carthax08.oresplus.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, Item.ToolMaterial material)
    {
        super(material, 6.0f, -3.2f);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

