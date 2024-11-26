package org.crateplugin.cristalynePlugin.commands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.crateplugin.cristalynePlugin.InventoryList;
import org.crateplugin.cristalynePlugin.Main;

import static org.crateplugin.cristalynePlugin.InventoryList.SettingsMenu;
import static org.crateplugin.cristalynePlugin.InventoryList.SettingsMenu2;

public class EventListeners implements Listener {

    @EventHandler
    public void onInteract(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        Inventory clickedInventory = e.getClickedInventory();

        if (clickedInventory == SettingsMenu || clickedInventory == SettingsMenu2) {

            e.setCancelled(true);

            String currentItem = e.getCurrentItem().getItemMeta().getDisplayName();

            switch (currentItem) {

                case "§c§lQuitter":
                    player.closeInventory();
                    break;
                case "§6§lPage 2":
                    player.openInventory(InventoryList.Menu2());
                    break;
                case "§6§lPage 3":
                    player.sendMessage(STR."\{Main.pluginPrefix}il n'y a pas encore de page 3!");
                    break;
                case "§6§lPage 1":
                    player.openInventory(InventoryList.Menu1());
                default:
                    break;


            }

        }

    }

}
