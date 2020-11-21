package com.carthax08.oresplus.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverBlock extends BlockBase{

    public SilverBlock(String name, Material material) {
        super(name, material);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.METAL);
        setHardness(6.0f);
        setResistance(9.0f);
        setHarvestLevel("pickaxe", 2);
    }
}
