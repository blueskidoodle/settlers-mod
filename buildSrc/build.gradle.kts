plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.2.0"
    id("io.spring.dependency-management") version "1.1.7"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://maven.kikugie.dev/snapshots")
}

dependencies {
    fun plugin(id: String, version: String) = "$id:$id.gradle.plugin:$version"
    implementation("dev.kikugie:stonecutter:0.7")
}