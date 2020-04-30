package com.Malcolm.Machine.Blocks;

import net.minecraft.block.Block;
import net.minecraft.command.arguments.ItemArgument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
        // TODO Auto-generated constructor stub
    }

}