package org.crateplugin.cristalynePlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.crateplugin.cristalynePlugin.InventoryList;

public class Settings implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if(sender instanceof Player player){

            player.openInventory(InventoryList.Menu1());

        }

        return false;
    }

}
