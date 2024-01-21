package online.lxbs.minecraft.plugins.lobby.listeners;

import online.lxbs.minecraft.plugins.lobby.tools.Msg;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setGameMode(GameMode.SURVIVAL);
        player.setFoodLevel(20);
        player.setHealth(20);
        Msg.send(player, "&f __________________\n&f|                           |\n&f|   Welcome to &d§dLXBS&f    &f|\n&f|__________________|\n \n&fWebsite: &dlxbs.online\n&fDiscord: &ddiscord.lxbs.online\n&d#ff55ffForTheWin\n \n");

        ItemStack itemHead = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemStack itemCompass = new ItemStack(Material.COMPASS, 1);
        Inventory inv = player.getInventory();

        ItemMeta metaHead = itemHead.getItemMeta();
        metaHead.setDisplayName("My Profile");
        ArrayList<String> loreHead = new ArrayList<>();
        loreHead.add("Right click to open");
        loreHead.add("View your stats");
        metaHead.setLore(loreHead);
        itemHead.setItemMeta(metaHead);

        ItemMeta metaCompass = itemCompass.getItemMeta();
        metaCompass.setDisplayName("Game Selector");
        ArrayList<String> loreCompass = new ArrayList<>();
        loreCompass.add("Right click to open");
        loreCompass.add("Choose between Games");
        metaCompass.setLore(loreCompass);
        itemCompass.setItemMeta(metaCompass);

        inv.clear();
        inv.setItem(0, itemHead);
        inv.setItem(4, itemCompass);
    }
}
