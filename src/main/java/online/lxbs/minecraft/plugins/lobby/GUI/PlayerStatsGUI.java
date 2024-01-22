package online.lxbs.minecraft.plugins.lobby.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static online.lxbs.minecraft.plugins.lobby.tools.ItemStack.getItem;

public class PlayerStatsGUI {

    public static Inventory getPlayerStatsGUI(Player player) {
        String invName = "Player statistics";
        Inventory inv = Bukkit.createInventory(player, 9 * 3, invName);

        inv.setItem(11, getItem(new ItemStack(Material.GRASS_BLOCK), "&dBuild Server", "&aLevel: ", "&aAchievements: "));
        inv.setItem(13, getItem(new ItemStack(Material.MAGENTA_BED), "&dBed Wars", "&aLevel: ", "&aAchievements: "));
        inv.setItem(15, getItem(new ItemStack(Material.FISHING_ROD), "&dPiratecraft", "&aLevel: ", "&aAchievements: "));

        return inv;
    }
}
