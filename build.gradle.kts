plugins {
    java
    `maven-publish`
    id("net.minecrell.plugin-yml.bukkit") version "0.6.1-SNAPSHOT"
}

group = "dev.plex"
version = "1.0"
description = "BukkitTelnet"

repositories {
    mavenCentral()
    maven {
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }

    maven {
        url = uri("https://nexus.telesphoreo.me/repository/plex-snapshots/")
    }

    maven {
        url = uri("https://nexus.telesphoreo.me/repository/totalfreedom/")
    }
    maven {
        url = uri("https://jitpack.io")
    }
}

bukkit {
    name = "BukkitTelnet"
    version = project.version.toString();
    description = "Telnet server for Minecraft"
    website = "https://plex.us.org"
    author = "Telesphoreo"
    main = "me.StevenLawson.BukkitTelnet"
    apiVersion = "1.13"
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    compileOnly("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT")
    compileOnly("dev.plex:server:1.1-SNAPSHOT")
    compileOnly("dev.plex:api:1.1-SNAPSHOT")
    library("org.apache.logging.log4j:log4j-core:2.17.2")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}