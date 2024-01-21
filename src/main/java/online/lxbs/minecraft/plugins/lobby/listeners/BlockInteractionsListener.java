package online.lxbs.minecraft.plugins.lobby.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockInteractionsListener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            event.setCancelled(true);
        } else {
            return;
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            event.setCancelled(true);
        } else {
            return;
        }
    }

    @EventHandler
    public void onItemDrop(BlockDropItemEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            event.setCancelled(true);
        } else {
            return;
        }
    }

    @EventHandler
    public void onTrapdoorInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("TRAPDOOR")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onFencegateInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("FENCE_GATE")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBookshelveInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("BOOKSHELF")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onButtonInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("BUTTON")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("SIGN")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onPotInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("POT")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onCandlesInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("CANDLES")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBerriesInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("BERRIES")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onLecternsInteract(PlayerInteractEvent event) {
        GameMode gameMode = event.getPlayer().getGameMode();
        if (!(gameMode == GameMode.CREATIVE)) {
            if (event.getClickedBlock() != null
                    && event.getClickedBlock().getType().name().endsWith("LECTERN")) {
                event.setCancelled(true);
            }
        }
    }
}
