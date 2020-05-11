package fr.bakhaow.vmod.init;

import fr.bakhaow.vmod.Main;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	//registerer
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);

    //items
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    
	public static final RegistryObject<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword",
			() -> new SwordItem(ModItemTiers.ALUMINIUM, 7, 5.0f,
					new Item.Properties().group(ModItemGroups.vCombat)));
	public static final RegistryObject<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe",
			() -> new PickaxeItem(ModItemTiers.ALUMINIUM, 4, 5.0f,
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
			() -> new ShovelItem(ModItemTiers.ALUMINIUM, 2, 5.0f,
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
			() -> new AxeItem(ModItemTiers.ALUMINIUM, 11, 3.0f, 
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
			() -> new HoeItem(ModItemTiers.ALUMINIUM, 5.0f, 
					new Item.Properties().group(ModItemGroups.vTools)));
	
	public static final RegistryObject<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
			() -> new ArmorItem(ModArmorTiers.ALUMINIUM, EquipmentSlotType.HEAD,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
			() -> new ArmorItem(ModArmorTiers.ALUMINIUM, EquipmentSlotType.CHEST,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
			() -> new ArmorItem(ModArmorTiers.ALUMINIUM, EquipmentSlotType.LEGS,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
			() -> new ArmorItem(ModArmorTiers.ALUMINIUM, EquipmentSlotType.FEET,
					new Item.Properties().group(ModItemGroups.vCombat)));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vItems)));
    
	public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
			() -> new SwordItem(ModItemTiers.STEEL, 7, 5.0f,
					new Item.Properties().group(ModItemGroups.vCombat)));
	public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
			() -> new PickaxeItem(ModItemTiers.STEEL, 4, 5.0f,
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
			() -> new ShovelItem(ModItemTiers.STEEL, 2, 5.0f,
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
			() -> new AxeItem(ModItemTiers.STEEL, 11, 3.0f, 
					new Item.Properties().group(ModItemGroups.vTools)));
	public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
			() -> new HoeItem(ModItemTiers.STEEL, 5.0f, 
					new Item.Properties().group(ModItemGroups.vTools)));
	
	public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
			() -> new ArmorItem(ModArmorTiers.STEEL, EquipmentSlotType.HEAD,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
			() -> new ArmorItem(ModArmorTiers.STEEL, EquipmentSlotType.CHEST,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
			() -> new ArmorItem(ModArmorTiers.STEEL, EquipmentSlotType.LEGS,
					new Item.Properties().group(ModItemGroups.vCombat)));

	public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
			() -> new ArmorItem(ModArmorTiers.STEEL, EquipmentSlotType.FEET,
					new Item.Properties().group(ModItemGroups.vCombat)));

    //food
    public static final RegistryObject<Item> ALUMINIUM_APPLE = ITEMS.register("aluminium_apple", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vFood).food(new Food.Builder().hunger(6).saturation(1.2F).setAlwaysEdible().fastToEat().effect(new EffectInstance(Effects.HASTE, 20*60*1, 1), 1).build())));
    public static final RegistryObject<Item> STEEL_APPLE = ITEMS.register("steel_apple", 
    		() -> new Item(new Item.Properties().group(ModItemGroups.vFood).food(new Food.Builder().hunger(6).saturation(1.2F).setAlwaysEdible().fastToEat().effect(new EffectInstance(Effects.HASTE, 20*60*2, 0), 1).build())));
    
    
    //itemBlocks
    public static final RegistryObject<Item> ALUMINIUM_BLOCK = ITEMS.register("aluminium_block", 
    		() -> new BlockItem(ModBlocks.ALUMINIUM_BLOCK.get(), new Item.Properties().group(ModItemGroups.vBlocks)));
    public static final RegistryObject<Item> ALUMINIUM_ORE = ITEMS.register("aluminium_ore", 
    		() -> new BlockItem(ModBlocks.ALUMINIUM_ORE.get(), new Item.Properties().group(ModItemGroups.vBlocks)));

    public static final RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block", 
    		() -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new Item.Properties().group(ModItemGroups.vBlocks)));
    public static final RegistryObject<Item> STEEL_ORE = ITEMS.register("steel_ore", 
    		() -> new BlockItem(ModBlocks.STEEL_ORE.get(), new Item.Properties().group(ModItemGroups.vBlocks)));

}