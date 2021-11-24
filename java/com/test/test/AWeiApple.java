package com.test.test;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class AWeiApple extends Item {
    private static EffectInstance effectInstance = new EffectInstance(Effects.STRENGTH, 10 * 20, 114);
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(effectInstance, 1)
            .build();

    public AWeiApple() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }

}
