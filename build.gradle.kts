plugins {
    `java-library`
    java
    kotlin("jvm") version "1.9.22"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

apply(plugin = "maven-publish")
val versionVar = "0.5.81"
val groupIdVar = "com.undefined"
val artifactIdVar = "api"

version = groupIdVar

allprojects {
    apply(plugin = "java")
    apply(plugin = "java-library")

    group = groupIdVar
    version = versionVar

    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }

    dependencies {
        implementation("org.json:json:20231013")
        implementation("com.googlecode.json-simple:json-simple:1.1.1")
    }

}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation(project(":v1_21:", "reobf"))
    implementation(project(":core"))
    implementation(project(":implementation"))
}

tasks {
    assemble {
        dependsOn(shadowJar)
    }

    shadowJar {
        archiveFileName.set("${this.project.name}-shadow.jar")
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "21"
    }
}

kotlin {
    jvmToolchain(21)
}