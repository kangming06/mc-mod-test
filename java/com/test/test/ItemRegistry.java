package com.test.test;


import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "test");
    public static RegistryObject<Item> blackblockding = ITEMS.register("blackblock_ding", () -> {
        return new BlackBlockDing();
    });
    public static RegistryObject<Item> aWeiApple = ITEMS.register("awei_apple", () -> {
        return new AWeiApple();
    });
    public static RegistryObject<Item> eXGalibang = ITEMS.register("ex_galibang", () -> {
        return new EXGalibang();
    });
}