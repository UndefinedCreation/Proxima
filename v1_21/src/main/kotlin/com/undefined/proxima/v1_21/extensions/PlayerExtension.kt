package com.undefined.proxima.v1_21.extensions

import com.undefined.proxima.core.reflection.getFieldValue
import com.undefined.proxima.v1_21.Mappings
import net.minecraft.server.network.ServerCommonPacketListenerImpl
import org.bukkit.craftbukkit.entity.CraftPlayer
import org.bukkit.entity.Player

fun Player.craftPlayer(): CraftPlayer = this as CraftPlayer
fun Player.serverPlayer() = craftPlayer().handle
fun Player.connection(): ServerCommonPacketListenerImpl = this.serverPlayer().getFieldValue(Mappings.ServerPlayer.CONNECTION)