package online.lxbs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new Menu(this));

        Bukkit.getPluginManager().registerEvents(new BlockInteractions(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerEvents(this), this);



        System.out.println("LXBS is now online. Hello there!");
    }

    @Override
    public void onDisable() {
        System.out.println("LXBS is now offline. Till we meet again!");
    }
}
