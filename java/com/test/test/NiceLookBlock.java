package com.test.test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NiceLookBlock extends Block {
    public NiceLookBlock(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

}
