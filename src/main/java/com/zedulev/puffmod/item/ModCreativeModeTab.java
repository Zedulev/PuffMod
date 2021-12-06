package com.zedulev.puffmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FLOWER_TAB = new CreativeModeTab("puffFlower") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PINEAPPLE_EXPRESS_FL.get());
        }
    };

    public static final CreativeModeTab SEED_TAB = new CreativeModeTab("puffSeeds") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PINEAPPLE_EXPRESS_SD.get());
        }
    };

}
