package com.massivecraft.factions.zcore.persist;

import cn.nukkit.Player;
import cn.nukkit.Server;

import java.util.List;

public class PlayerEntity extends Entity {
    public Player getPlayer() {
        return Server.getInstance().getPlayerExact(this.getId());
    }

    public boolean isOnline() {
        return this.getPlayer() != null;
    }

    // make sure target player should be able to detect that this player is online
    public boolean isOnlineAndVisibleTo(Player player) {
        Player target = this.getPlayer();
        return target != null && player.canSee(target);
    }

    public boolean isOffline() {
        return !isOnline();
    }

    // -------------------------------------------- //
    // Message Sending Helpers
    // -------------------------------------------- //

    public void sendMessage(String msg) {
        Player player = this.getPlayer();
        if (player == null) return;
        player.sendMessage(msg);
    }

    public void sendMessage(List<String> msgs) {
        for (String msg : msgs) {
            this.sendMessage(msg);
        }
    }

}
