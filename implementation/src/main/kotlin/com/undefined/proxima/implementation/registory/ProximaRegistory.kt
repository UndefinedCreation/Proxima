package com.undefined.proxima.implementation.registory

import com.undefined.proxima.implementation.Proxima
import com.undefined.proxima.implementation.enums.GameVersion
import com.undefined.proxima.implementation.registory.particle.ParticleRegistory
import com.undefined.proxima.implementation.registory.particle.ParticleRegistory1_21

class ProximaRegistory {

    companion object {
        lateinit var particleRegistory: ParticleRegistory
    }

    init {
        particleRegistory = when(Proxima.gameVersion) {
            GameVersion.V1_21 -> ParticleRegistory1_21()
            GameVersion.V1_21_1 -> ParticleRegistory1_21() // Need to be changed to 1.21.1 when done
        }
    }


}