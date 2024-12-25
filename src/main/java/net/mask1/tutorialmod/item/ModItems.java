package net.mask1.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mask1.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  // ITEMS
  public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

  // FUNCTIONS
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
  }
  public static void RegisterModItems() {
    TutorialMod.LOGGER.info("(Tutorial Mod) := registering mod items");
  }
}
