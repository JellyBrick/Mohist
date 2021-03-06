package com.destroystokyo.paper.network;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import org.bukkit.entity.Player;
import org.bukkit.util.CachedServerIcon;

import javax.annotation.Nullable;

class PaperServerListPingEventImpl extends PaperServerListPingEvent
{
    private final MinecraftServer server;

    PaperServerListPingEventImpl(final MinecraftServer server, final StatusClient client, final int protocolVersion, @Nullable final CachedServerIcon icon) {
        super(client, server.getMOTD(), server.getCurrentPlayerCount(), server.getMaxPlayers(), server.getServerModName() + ' ' + server.getMinecraftVersion(), protocolVersion, icon);
        this.server = server;
    }

    @Override
    protected final Object[] getOnlinePlayers() {
        return this.server.getPlayerList().playerEntityList.toArray();
    }

    @Override
    protected final Player getBukkitPlayer(final Object player) {
        return ((EntityPlayerMP)player).getBukkitEntity();
    }
}
