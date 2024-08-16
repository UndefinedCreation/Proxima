plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("xyz.jpenilla.run-paper") version "2.2.2"
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT")
    implementation(project(":core"))
    implementation(project(":implementation"))
    implementation(project(":v1_21:", "reobf"))
    compileOnly(project(":v1_21"))
}


tasks {
    runServer {
        dependsOn(shadowJar)
        minecraftVersion("1.21")
        jvmArgs("-Xmx2G")
    }
}