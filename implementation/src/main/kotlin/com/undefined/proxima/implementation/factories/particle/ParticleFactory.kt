package com.undefined.proxima.implementation.factories.particle

import org.bukkit.Particle
import org.bukkit.entity.Player

interface ParticleFactory {

    fun <D> spawnParticle(
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
    )

}