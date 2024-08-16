package com.undefined.proxima.server

import com.undefined.proxima.v1_21.extensions.sendPacket
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {

    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun onAsyncChat(event: AsyncPlayerChatEvent) {
        if (!event.message.equals("test", true)) return
    }

}