plugins {
    application
    kotlin("jvm") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":core"))
    implementation(project(":web"))
}

application {
    mainClass.set("io.github.carson.MainKt")
}

tasks {
    shadowJar {
        archiveFileName.set("Rubrum-${project.version}.jar")
    }
}
