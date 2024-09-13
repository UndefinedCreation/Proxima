package com.undefined.proxima.implementation.particle

import com.undefined.proxima.implementation.registory.ProximaRegistory
import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.entity.Player


fun <D> Player.spawnProximaParticle(
    type: Particle,
    x: Double,
    y: Double,
    z: Double,
    xOffset: Double = 0.0,
    yOffset: Double = 0.0,
    zOffset: Double = 0.0,
    speed: Double = 1.0,
    count: Int = 1,
    longDistance: Boolean = false,
    data: D? = null
) = ProximaRegistory.particleRegistory.spawnParticle(
    this,
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

fun Player.spawnProximaParticle(
    type: Particle,
    x: Double,
    y: Double,
    z: Double,
    xOffset: Double = 0.0,
    yOffset: Double = 0.0,
    zOffset: Double = 0.0,
    speed: Double = 1.0,
    count: Int = 1,
    longDistance: Boolean = false,
) = ProximaRegistory.particleRegistory.spawnParticle(
    this,
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
    null
)

fun <D> Player.spawnProximaParticle(
    type: Particle,
    location: Location,
    xOffset: Double = 0.0,
    yOffset: Double = 0.0,
    zOffset: Double = 0.0,
    speed: Double = 1.0,
    count: Int = 1,
    longDistance: Boolean = false,
    data: D? = null
) = ProximaRegistory.particleRegistory.spawnParticle(
    this,
    type,
    location.x,
    location.y,
    location.z,
    xOffset,
    yOffset,
    zOffset,
    speed,
    count,
    longDistance,
    data
)

fun Player.spawnProximaParticle(
    type: Particle,
    location: Location,
    xOffset: Double = 0.0,
    yOffset: Double = 0.0,
    zOffset: Double = 0.0,
    speed: Double = 1.0,
    count: Int = 1,
    longDistance: Boolean = false,
) = ProximaRegistory.particleRegistory.spawnParticle(
    this,
    type,
    location.x,
    location.y,
    location.z,
    xOffset,
    yOffset,
    zOffset,
    speed,
    count,
    longDistance,
    null
)
