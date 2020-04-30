package com.Malcolm.Machine.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SDIITBlock extends Block {

    public SDIITBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.STONE)
                .harvestLevel(1).harvestTool(ToolType.PICKAXE));

    }
}