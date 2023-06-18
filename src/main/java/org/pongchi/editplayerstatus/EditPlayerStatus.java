package org.pongchi.editplayerstatus;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EditPlayerStatus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        addEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void addEvents() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new PlayerJoinEvent(), this);
    }
}