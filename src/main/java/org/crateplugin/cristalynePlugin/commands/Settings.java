package org.crateplugin.cristalynePlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Settings implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player player){

            Inventory SettingsMenu = Bukkit.createInventory(null, 27, "§6§lSettings Menu");

            player.openInventory(SettingsMenu);

        }

        return false;
    }
}
