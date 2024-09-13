package com.undefined.proxima.implementation

import com.undefined.proxima.implementation.enums.GameVersion
import com.undefined.proxima.implementation.particle.spawnProximaParticle
import com.undefined.proxima.implementation.registory.ProximaRegistory
import org.bukkit.Bukkit
import org.bukkit.Particle
import org.bukkit.Particle.DustOptions
import org.bukkit.entity.Player

class Proxima {

    companion object {
        lateinit var gameVersion: GameVersion
    }

    init {
        // API START UP

        when(Bukkit.getVersion().split("-")[0]) {
            "1.21" -> gameVersion = GameVersion.V1_21
            "1.21.1" -> gameVersion = GameVersion.V1_21_1
        }
        // Version factory manager
        ProximaRegistory()

    }

}