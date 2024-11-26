package org.crateplugin.cristalynePlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.crateplugin.cristalynePlugin.Main;

public class Settings implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player player){

            player.sendMessage(Main.pluginPrefix + "hello world");

        }

        return false;
    }
}
