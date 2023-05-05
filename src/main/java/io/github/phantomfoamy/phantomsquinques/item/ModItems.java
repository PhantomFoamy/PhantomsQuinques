package io.github.phantomfoamy.phantomsquinques.item;
import io.github.phantomfoamy.phantomsquinques.PhantomsQuinques;
import io.github.phantomfoamy.phantomsquinques.sound.ModSounds;
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
            ()-> new JasonItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Can produce a Kagune from its blade","Rinkaku","S+",
                    "Yamori Jason (Omori Yakumo)"));
    public static final RegistryObject<Item> DOUJIMA = ITEMS.register("doujima",
            ()-> new DoujimaItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Has high knock-back, and can be upgraded","Koukaku","Unknown",
                    "Unknown"));

    public static final RegistryObject<Item> DOUJIMA_KAI = ITEMS.register("doujima_kai",
            ()-> new DoujimaKaiItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Has boosting abilities","Koukaku/Bikaku","Unknown",
                    "Bin Brothers"));
    public static final RegistryObject<Item> KURA = ITEMS.register("kura",
            ()-> new KuraItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Can be split to be dual welded","Koukaku","Unknown",
                    "Unknown"));
    public static final RegistryObject<Item> KURA_L = ITEMS.register("kura_l",
            ()-> new KuraItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "The left half of Kura","Koukaku","Unknown",
                    "Unknown"));
    public static final RegistryObject<Item> KURA_R = ITEMS.register("kura_r",
            ()-> new KuraItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "The right half of Kura","Koukaku","Unknown",
                    "Unknown"));
    public static final RegistryObject<Item> ROTTEN_FOLLOW = ITEMS.register("rotten_follow",
            ()-> new RottenFollowItem(ModTiers.QUINQUE, 5, 5,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Chainsaw moment","Rinkaku","S",
                    "Rio's Brother"));
    public static final RegistryObject<Item> YUKIMURA = ITEMS.register("yukimura",
            ()-> new YukimuraItem(ModTiers.QUINQUE, 5, 8,  new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "Becomes stronger after dealing damage","Koukaku","B",
                    "Unknown"));

    public static final RegistryObject<Item> ROTTEN_FOLLOW = ITEMS.register("rotten_follow",
            () -> new RottenFollow(ModTiers.QUINQUE, 5, 8, new Item.Properties().stacksTo(1).fireResistant()
                    .tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB), "chainsaw man reference lmao", "Rinkaku", "S",
                    "Your mom"));

    //misc
    public static final RegistryObject<Item> KAGUNE = ITEMS.register("kagune",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB)));

    public static final RegistryObject<Item> UNRAVEL_RECORD = ITEMS.register("unravel_music_disc",
            () -> new RecordItem(4, ModSounds.UNRAVEL,
                    new Item.Properties().tab(ModCreativeModeTab.PHANTOMS_QUINQUES_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
