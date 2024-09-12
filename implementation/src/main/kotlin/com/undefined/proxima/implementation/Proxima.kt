package com.undefined.proxima.implementation

import com.undefined.proxima.implementation.enums.GameVersion
import org.bukkit.Bukkit

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


    }

}