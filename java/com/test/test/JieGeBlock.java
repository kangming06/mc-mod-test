package com.test.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class JieGeBlock extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("face",0,1);
    public JieGeBlock(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(23));
        this.setDefaultState(this.stateContainer.getBaseState().with(STATE,0));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        super.fillStateContainer(builder);
    }
}
