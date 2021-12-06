package com.zedulev.puffmod.item;

import com.zedulev.puffmod.PuffMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PuffMod.MOD_ID);

    //Flower Registry
    public static final RegistryObject<Item> PINEAPPLE_EXPRESS_FL = ITEMS.register("pineapple_express",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLOWER_TAB)));

    //Seed Registry
    public static final RegistryObject<Item> PINEAPPLE_EXPRESS_SD = ITEMS.register("pineapple_express_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SEED_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
