package io.github.phantomfoamy.phantomsquinques.item;
import io.github.phantomfoamy.phantomsquinques.PhantomsQuinques;
import io.github.phantomfoamy.phantomsquinques.item.custom.Quinque;
import io.github.phantomfoamy.phantomsquinques.item.custom.Yukimura;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PhantomsQuinques.MOD_ID);

    //quinques
    public static final RegistryObject<Item> JASON = ITEMS.register("13s_jason",
            ()-> new Quinque(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Can produce a Kagune from its blade","Rinkaku","S+",
                    "Yamori Jason (Omori Yakumo)"));
    /*public static final RegistryObject<Item> YUKIMURA = ITEMS.register("yukimura",
            ()-> new Yukimura(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Becomes stronger after dealing damage","Koukaku","B",
                    "Unknown"));*/

    public static final RegistryObject<Item> YUKIMURA = ITEMS.register("yukimura",
            ()-> new Yukimura(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Becomes stronger after dealing damage","Koukaku","B",
                    "Unknown"));

    //misc
    public static final RegistryObject<Item> KAGUNE = ITEMS.register("kagune",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
