package com.undefined.proxima.v1_21.extensions

import net.minecraft.core.particles.ParticleOptions
import net.minecraft.core.particles.ParticleType
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket
import org.bukkit.Particle
import org.bukkit.craftbukkit.CraftParticle
import org.bukkit.entity.Player


object ParticleExtension {

    fun <D> sendParticlePacket(
        player: Player,
        type: Particle,
        x: Double,
        y: Double,
        z: Double,
        xOffset: Double,
        yOffset: Double,
        zOffset: Double,
        speed: Double,
        count: Int,
        longDistance: Boolean,
        data: D?) {
        val packet = ClientboundLevelParticlesPacket(
            CraftParticle.createParticleParam(type, data),
            longDistance,
            x,
            y,
            z,
            xOffset.toFloat(),
            yOffset.toFloat(),
            zOffset.toFloat(),
            speed.toFloat(),
            count
        )
        player.sendPacket(packet)
    }
}