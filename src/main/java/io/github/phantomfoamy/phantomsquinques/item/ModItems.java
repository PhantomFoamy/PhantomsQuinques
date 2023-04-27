package io.github.phantomfoamy.phantomsquinques.item;
import io.github.phantomfoamy.phantomsquinques.PhantomsQuinques;
import io.github.phantomfoamy.phantomsquinques.item.custom.Quinque;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PhantomsQuinques.MOD_ID);

    public static final RegistryObject<Item> JASON = ITEMS.register("13s_jason",
            ()-> new Quinque("Can produce a Kagune from its blade","Rinkaku","S+",
                    "Yamori Jason (Omori Yakumo)", new Item.Properties().tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB)));
    public static final RegistryObject<Item> YUKIMURA = ITEMS.register("yukimura",
            ()-> new Quinque("Dual weild to gain extra abilities","Koukaku","B",
                    "Unknown", new Item.Properties().tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
