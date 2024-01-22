package online.lxbs.minecraft.plugins.lobby.listeners;

import online.lxbs.minecraft.plugins.lobby.GUI.MenuGUI;
import online.lxbs.minecraft.plugins.lobby.GUI.PlayerStatsGUI;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryInteractionListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        GameMode gameMode = player.getGameMode();

        if (!(gameMode == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
        if (event.getCurrentItem() == null) {
            return;
        }
        if (event.getCurrentItem().getType() == Material.PLAYER_HEAD) {
            player.openInventory(PlayerStatsGUI.getPlayerStatsGUI(player));
        }
        if (event.getCurrentItem().getType() == Material.COMPASS) {
            player.openInventory(MenuGUI.getMenuGUI(player));
        }
    }
}
