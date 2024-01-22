package online.lxbs.minecraft.plugins.lobby.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static online.lxbs.minecraft.plugins.lobby.tools.ItemStack.getItem;

public class MenuGUI {

    public static Inventory getMenuGUI(Player player) {
        String invName = "Game Selector";
        Inventory inv = Bukkit.createInventory(player, 9 * 3, invName);

        inv.setItem(11, getItem(new ItemStack(Material.GRASS_BLOCK), "&dBuild Server", "&aClick to join", "&aBuild with your friends"));
        inv.setItem(13, getItem(new ItemStack(Material.MAGENTA_BED), "&dBed Wars", "&aClick to join", "&aFight your friends in this Classic Minigame"));
        inv.setItem(15, getItem(new ItemStack(Material.FISHING_ROD), "&dPiratecraft", "&aClick to join", "&aSave your ship in this fun Original"));

        return inv;
    }
}