package com.undefined.proxima.implementation.factories.particle

import com.undefined.proxima.v1_21.extensions.ParticleExtension
import org.bukkit.Particle
import org.bukkit.entity.Player

class ParticleFactory1_21: ParticleFactory {
    override fun <D> spawnParticle(
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
        data: D?
    ) = ParticleExtension.sendParticlePacket(
            player,
            type,
            x,
            y,
            z,
            xOffset,
            yOffset,
            zOffset,
            speed,
            count,
            longDistance,
            data
        )
}