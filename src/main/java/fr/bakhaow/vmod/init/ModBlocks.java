package fr.bakhaow.vmod.init;

import fr.bakhaow.vmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	//registerer
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

    //blocks
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
    
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> STEEL_ORE = BLOCKS.register("steel_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
}