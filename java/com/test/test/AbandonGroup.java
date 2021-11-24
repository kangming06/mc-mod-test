package com.test.test;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AbandonGroup extends ItemGroup {
    public AbandonGroup() {
        super("abandon_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.aWeiApple.get());
    }
}