package org.crateplugin.cristalynePlugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryList {

    public static Inventory SettingsMenu = Bukkit.createInventory(null, 36, "§6§lSettings Menu");
    public static Inventory SettingsMenu2 = Bukkit.createInventory(null, 36, "§6§lSettings Menu");

    public static Inventory Menu1() {

        for (int i = 0; i < SettingsMenu.getSize(); i++) {
            SettingsMenu.setItem(i, item(Material.GRAY_STAINED_GLASS_PANE, " ", 1));

        }

        SettingsMenu.setItem(31, item(Material.DARK_OAK_DOOR, "§c§lQuitter", 1));
        SettingsMenu.setItem(32, item(Material.PAPER, "§6§lPage 2", 2));

        return SettingsMenu;
    }

    public static Inventory Menu2() {

        for (int i = 0; i < SettingsMenu2.getSize(); i++) {

            SettingsMenu2.setItem(i, item(Material.GRAY_STAINED_GLASS_PANE, " ", 1));

        }

        SettingsMenu2.setItem(30, item(Material.PAPER, "§6§lPage 1", 1));
        SettingsMenu2.setItem(31, item(Material.DARK_OAK_DOOR, "§c§lQuitter", 1));
        SettingsMenu2.setItem(32, item(Material.PAPER, "§6§lPage 3", 3));

        return SettingsMenu2;
    }


    public static ItemStack item(Material material, String string, int quantity) {

        ItemStack i = new ItemStack(material, quantity);
        ItemMeta imeta = i.getItemMeta();
        imeta.setDisplayName(string);
        i.setItemMeta(imeta);

        return i;
    }
}
