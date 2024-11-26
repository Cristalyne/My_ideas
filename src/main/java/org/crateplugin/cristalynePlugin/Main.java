package org.crateplugin.cristalynePlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String pluginPrefix = "§8[§9My_ideas§8] §7";

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getConsoleSender().sendMessage(pluginPrefix + "le plugin est §alancé!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getConsoleSender().sendMessage(pluginPrefix + "le plugin est §carreté!");

    }
}
