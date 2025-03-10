plugins {
    id("java")
    id("maven-publish")
    kotlin("jvm")
}
java {
    withSourcesJar()
    withJavadocJar()
}

group = "com.github.AlterJuice"
version = "v1.0.7"

publishing {
    publications {
        create<MavenPublication>("release") {
            from(components["java"])
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
        }
    }
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(11)
}