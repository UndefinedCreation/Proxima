package com.undefined.proxima.implementation.particle

import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.entity.Player

open class ParticleComponent(
    private val particle: Particle
) {

    private val components: HashMap<ParticleComponent, ParticleOffset?> = hashMapOf()

    fun addParticleComponent(
        particleComponent: ParticleComponent,
        particleOffset: ParticleOffset? = null
    ) {
        components[particleComponent] = particleOffset
    }

    fun spawn(player: Player, location: Location) {
        spawnSingle(player, location)
        components.entries.forEach {
            it.key.spawn(
                player,
                it.value?.addToLocation(location.clone()) ?: location)
        }
    }

    private fun spawnSingle(player: Player, location: Location) {
        player.spawnProximaParticle(particle, location)
    }

}