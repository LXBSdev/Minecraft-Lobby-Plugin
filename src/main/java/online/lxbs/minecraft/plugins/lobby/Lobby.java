package online.lxbs.minecraft.plugins.lobby;

import online.lxbs.minecraft.plugins.lobby.commands.MenuCommand;
import online.lxbs.minecraft.plugins.lobby.commands.StatsCommand;
import online.lxbs.minecraft.plugins.lobby.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new MenuCommand());
        getCommand("stats").setExecutor(new StatsCommand());

        Bukkit.getPluginManager().registerEvents(new BlockInteractionsListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryInteractionListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerHungerChangeListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerHealthChangeListener(), this);

        System.out.println("LXBS is now online. Hello there!");
    }

    @Override
    public void onDisable() {
        System.out.println("LXBS is now offline. Till we meet again!");
    }
}
