package com.Malcolm.Machine.Util;

import com.Malcolm.Machine.Machine;
import com.Malcolm.Machine.Blocks.BlockItemBase;
import com.Malcolm.Machine.Blocks.SDBlock;
import com.Malcolm.Machine.Blocks.SDBubbleBlock;
import com.Malcolm.Machine.Blocks.SDIITBlock;
import com.Malcolm.Machine.Blocks.SDLeprechaunBlock;
import com.Malcolm.Machine.Blocks.SDModelBlock;
import com.Malcolm.Machine.Blocks.SDPartBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Machine.MODID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Machine.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items

    // Blocks
    public static final RegistryObject<Block> SD_BLOCK = BLOCKS.register("sd_block", SDBlock::new);
    public static final RegistryObject<Block> SDBubble_BLOCK = BLOCKS.register("sdbubble_block", SDBubbleBlock::new);
    public static final RegistryObject<Block> SDIIT_BLOCK = BLOCKS.register("sdiit_block", SDIITBlock::new);
    public static final RegistryObject<Block> SDLeprechaun_BLOCK = BLOCKS.register("sdleprechaun_block",
            SDLeprechaunBlock::new);
    public static final RegistryObject<Block> SDModel_BLOCK = BLOCKS.register("sdmodel_block", SDModelBlock::new);
    public static final RegistryObject<Block> SDPart_BLOCK = BLOCKS.register("sdpart_block", SDPartBlock::new);
    // Block Items
    public static final RegistryObject<Item> SD_BLOCK_ITEM = ITEMS.register("sd_block",
            () -> new BlockItemBase(SD_BLOCK.get()));
    public static final RegistryObject<Item> SDBubble_BLOCK_ITEM = ITEMS.register("sdbubble_block",
            () -> new BlockItemBase(SDBubble_BLOCK.get()));
    public static final RegistryObject<Item> SDIIT_BLOCK_ITEM = ITEMS.register("sdiit_block",
            () -> new BlockItemBase(SDIIT_BLOCK.get()));
    public static final RegistryObject<Item> SDLeprechaun_BLOCK_ITEM = ITEMS.register("sdleprechaun_block",
            () -> new BlockItemBase(SDLeprechaun_BLOCK.get()));
    public static final RegistryObject<Item> SDModel_BLOCK_ITEM = ITEMS.register("sdmodel_block",
            () -> new BlockItemBase(SDModel_BLOCK.get()));
    public static final RegistryObject<Item> SDPart_BLOCK_ITEM = ITEMS.register("sdpart_block",
            () -> new BlockItemBase(SDPart_BLOCK.get()));
}