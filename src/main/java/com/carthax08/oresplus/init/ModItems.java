package com.carthax08.oresplus.init;

import com.carthax08.oresplus.items.ItemBase;
import com.carthax08.oresplus.items.armor.ArmorBase;
import com.carthax08.oresplus.items.tools.*;
import com.carthax08.oresplus.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //Materials
    public static final ToolMaterial TITANIUM_MATERIAL = EnumHelper.addToolMaterial("material_titanium", 3, 9000, 10.0f, 4.0f, 10);
    public static final ItemArmor.ArmorMaterial TITANIUM_ARMOR_MATERIAL = new EnumHelper().addArmorMaterial("titanium_armor", Reference.MOD_ID + ":titanium", 1000, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
    //Items
    //public static final Item SILVER = new ItemBase("silver_ingot");
    //public static final Item COPPER = new ItemBase("copper_ingot");
    //public static final Item LEAD = new ItemBase("lead_ingot");
    //public static final Item AMETHYST = new ItemBase("amethyst");
    public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
    public static final Item TITANIUM_NUGGET = new ItemBase("titanium_nugget");
    public static final Item COBALT_CHUNK = new ItemBase("cobalt_chunk");
    //public static final Item TUNGSTEN = new ItemBase("tungsten_ingot");
    //public static final Item PLATINUM = new ItemBase("platinum_ingot");
    //public static final Item STEEL_NUGGET = new ItemBase("steel_nugget");
    //public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
    public static final Item COBALT_PIECE = new ItemBase("cobalt_piece");
    public static final Item COBALT_NUGGET = new ItemBase("cobalt_nugget");
    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
    //Tools
    public static final ItemSword TITANIUM_SWORD = new ToolSword("titanium_sword", TITANIUM_MATERIAL);
    public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", TITANIUM_MATERIAL);
    public static final ItemAxe TITANIUM_AXE = new ToolAxe("titanium_axe", TITANIUM_MATERIAL);
    public static final ItemSpade TITANIUM_SHOVEL = new ToolSpade("titanium_shovel", TITANIUM_MATERIAL);
    public static final ItemHoe TITANIUM_HOE = new ToolHoe("titanium_hoe", TITANIUM_MATERIAL);
    //Armor
    public static final Item TITANIUM_HELMET = new ArmorBase("titanium_helmet", TITANIUM_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item TITANIUM_CHESTPLATE = new ArmorBase("titanium_chestplate", TITANIUM_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item TITANIUM_LEGGINGS = new ArmorBase("titanium_leggings", TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item TITANIUM_BOOTS = new ArmorBase("titanium_boots", TITANIUM_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);
}