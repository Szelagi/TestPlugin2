package pl.szelagi.test.main;

import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin startup logic enabled");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        event.getPlayer().kickPlayer("Serwer jest pełny");
//        System.out.println("Player Joined");
//        event.setJoinMessage("[+]" + event.getPlayer().getName());
    }
    @EventHandler
    public void onBlockPlaceEvent(BlockPlaceEvent event) {


        event.getBlock().getWorld().spawnEntity()

        event.getPlayer().setSilent(true);
        event.getBlock();
    }
}
