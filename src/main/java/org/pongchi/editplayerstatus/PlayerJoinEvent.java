package org.pongchi.editplayerstatus;

import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        event.getPlayer().setHealthScale(40.0d);

        event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(100.0d);
        event.getPlayer().setHealth(10.0d);

        event.getPlayer().sendMessage("[설정] 최대 체력을 100.0 으로 설정하였습니다.");
    }
}
