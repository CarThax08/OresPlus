package com.carthax08.oresplus.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumOre extends BlockBase {


    public TitaniumOre(String name, Material material) {
        super(name, material);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.STONE);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 3);
    }
}
