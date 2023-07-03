package online.lxbs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PlayerEvents implements Listener {

    public PlayerEvents(Lobby plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setGameMode(GameMode.SURVIVAL);
        Msg.send(player, "&c_______________________\n&c|                     |\n&c|   &0Welcome to &d§dLXBS&0!   &c|\n&c|                     |\n&c|_____________________|\n&0Website: &dhttp://lxbs.online\n&0Discord: &dhttp://discord.lxbs.online\n&d#ff55ffForTheWin");

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

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        GameMode gameMode = player.getGameMode();
        if (event.getCurrentItem() == null) {
            return;
        }
        if (event.getCurrentItem().getType() == Material.PLAYER_HEAD) {
            return;
        }
        if (event.getCurrentItem().getType() == Material.COMPASS) {
            Inventory inv = Bukkit.createInventory(player, 9 * 3, "Game Selector");

            inv.setItem(11, getItem(new ItemStack(Material.GRASS_BLOCK), "&dBuild Server", "&aClick to join", "&aBuild with your friends"));
            inv.setItem(13, getItem(new ItemStack(Material.MAGENTA_BED), "&dBed Wars", "&aClick to join", "&aFight your friends in this Classic Minigame"));
            inv.setItem(15, getItem(new ItemStack(Material.FISHING_ROD), "&dPiratecraft", "&aClick to join", "&aSave your ship in this fun Original"));

            player.openInventory(inv);
        }
        if (!(gameMode == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    private ItemStack getItem(ItemStack item, String name, String ... lore) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));

        List<String> lores = new ArrayList<>();
        for (String s : lore) {
            lores.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        meta.setLore(lores);

        item.setItemMeta(meta);
        return item;
    }
}