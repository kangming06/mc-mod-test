package com.test.test;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "test");
    public static RegistryObject<Block> niceLookBlock = BLOCKS.register("nicelook_block", () -> {
        return new NiceLookBlock();
    });
}
