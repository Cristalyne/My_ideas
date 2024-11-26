package org.crateplugin.cristalynePlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Settings implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player player){

            Inventory SettingsMenu = Bukkit.createInventory(null, 27, "§6§lSettings Menu");

            for(int i = 0; i < SettingsMenu.getSize(); i++){

                    SettingsMenu.setItem(i, item(Material.GRAY_STAINED_GLASS_PANE, " ", 1));

            }

            player.openInventory(SettingsMenu);

        }

        return false;
    }

    public static ItemStack item(Material material, String string, int quantity){

        ItemStack i = new ItemStack(material, quantity);
        ItemMeta imeta = i.getItemMeta();
        imeta.setDisplayName(string);
        i.setItemMeta(imeta);

        return i;
    }

}
