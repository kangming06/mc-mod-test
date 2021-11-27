package com.test.test;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "test");
    public static RegistryObject<Item> blackBlockDing = ITEMS.register("blackblock_ding", () -> {
        return new BlackBlockDing();
    });
    public static RegistryObject<Item> aWeiApple = ITEMS.register("awei_apple", () -> {
        return new AWeiApple();
    });
    public static RegistryObject<Item> eXGalibang = ITEMS.register("ex_galibang", () -> {
        return new EXGalibang();
    });
    public static RegistryObject<Item> niceLookBlock = ITEMS.register("nicelook_block", () -> {
        return new BlockItem(BlockRegistry.niceLookBlock.get(), new Item.Properties().group(ModGroup.itemgroup));
    });
    public static RegistryObject<Item> jieGeBlock = ITEMS.register("jiege_block",()->{
        return new BlockItem(BlockRegistry.jieGeBlock.get(), new Item.Properties().group(ModGroup.itemgroup));
    });
}