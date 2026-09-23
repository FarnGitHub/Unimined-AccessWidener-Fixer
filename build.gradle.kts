plugins {
    `kotlin-dsl`
    `maven-publish`
    id("org.jetbrains.kotlin.jvm") version("2.4.0")
}

repositories {
    mavenCentral()
    maven("https://maven.wagyourtail.xyz/snapshots")
    maven("https://maven.minecraftforge.net/")
    maven("https://maven.fabricmc.net/")
    maven("https://maven.wagyourtail.xyz/releases")
    maven("https://maven.jemnetworks.com/releases")
    gradlePluginPortal()
}

dependencies {
    implementation("xyz.wagyourtail.unimined:unimined:1.4.2-SNAPSHOT") {
        //isTransitive = false
    }
    implementation("net.fabricmc:tiny-remapper:0.11.2") {
        isTransitive = false
    }
    implementation("com.squareup.okio:okio-jvm:3.7.0") {
        isTransitive = false
    }
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.10.1") {
        isTransitive = false
    }
    implementation("org.apache.commons:commons-compress:1.28.0") {
        isTransitive = false
    }
    implementation("xyz.wagyourtail.commons:commons-kt-jvm:1.0.2") {
        isTransitive = false
    }
    implementation("xyz.wagyourtail.unimined.mapping:unimined-mapping-library-jvm:1.2.2") {
        isTransitive = false
    }
    implementation("net.fabricmc:class-tweaker:0.2") {
        isTransitive = false
    }
    implementation("org.ow2.asm:asm:9.8") {
        isTransitive = false
    }
    implementation("org.ow2.asm:asm-commons:9.8") {
        isTransitive = false
    }
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.6.2") {
        isTransitive = false
    }
}

kotlin {
    jvmToolchain(8)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    repositories {
        maven {
        }
    }
}