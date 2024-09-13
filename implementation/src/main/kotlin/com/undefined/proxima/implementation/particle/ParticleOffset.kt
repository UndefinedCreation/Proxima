package com.undefined.proxima.implementation.particle

import org.bukkit.Location

class ParticleOffset(
    val x: Double,
    val y: Double,
    val z: Double
) {

    fun addToLocation(location: Location): Location = location.add(x,y,z)

}