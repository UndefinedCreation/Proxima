package com.undefined.proxima.implementation.factories

import com.undefined.proxima.implementation.Proxima
import com.undefined.proxima.implementation.enums.GameVersion
import com.undefined.proxima.implementation.factories.particle.ParticleFactory
import com.undefined.proxima.implementation.factories.particle.ParticleFactory1_21

class FactoryManager {

    companion object {
        lateinit var particleFactory: ParticleFactory
    }

    init {
        particleFactory = when(Proxima.gameVersion) {
            GameVersion.V1_21 -> ParticleFactory1_21()
            GameVersion.V1_21_1 -> ParticleFactory1_21() // Need to be changed to 1.21.1 when done
        }
    }


}