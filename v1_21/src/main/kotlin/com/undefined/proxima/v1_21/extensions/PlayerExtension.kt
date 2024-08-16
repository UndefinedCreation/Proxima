package com.undefined.proxima.v1_21.extensions

import com.undefined.proxima.core.reflection.getFieldValue
import com.undefined.proxima.v1_21.Mappings
import net.minecraft.network.Connection
import net.minecraft.network.protocol.Packet
import net.minecraft.network.protocol.game.ServerboundSwingPacket
import net.minecraft.server.network.ServerCommonPacketListenerImpl
import org.bukkit.craftbukkit.entity.CraftPlayer
import org.bukkit.entity.Player

fun Player.craftPlayer(): CraftPlayer = this as CraftPlayer
fun Player.serverPlayer() = craftPlayer().handle
fun Player.connection(): ServerCommonPacketListenerImpl = this.serverPlayer().getFieldValue(Mappings.ServerPlayer.CONNECTION)
fun ServerCommonPacketListenerImpl.channelConnection(): Connection = this.getFieldValue(Mappings.ServerCommonPacketListenerImpl.CONNECTION)

fun Player.sendPacket(packet: Packet<*>) = this.connection().sendPacket(packet)
fun Player.sendPackets(vararg packets: Packet<*>) = packets.forEach { packet -> this.sendPacket(packet) }
fun Player.sendPackets(packets: Collection<Packet<*>>) = packets.forEach { packet -> this.sendPacket(packet) }
fun Collection<Player>.sendPacket(packet: Packet<*>) = this.forEach { it.sendPacket(packet) }
fun Collection<Player>.sendPackets(vararg packet: Packet<*>) = this.forEach { it.sendPackets(packet.toList()) }
fun Collection<Player>.sendPackets(packet: Collection<Packet<*>>) = this.forEach { it.sendPackets(packet) }

fun Player.textures(): Pair<String, String> {
    val gameProfile = this.serverPlayer().gameProfile
    val property = gameProfile.properties["textures"].iterator().next()
    val texture = property.value as String
    val signature = property.signature as String
    return Pair(texture, signature)
}

fun isRemapped(): Boolean = ServerboundSwingPacket::class.java.name == "net.minecraft.network.protocol.game.ServerboundSwingPacket"