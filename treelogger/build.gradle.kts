plugins {
    id("java")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
    withJavadocJar()
}

group = "com.github.AlterJuice"
version = "1.0.2"

//
//dependencies {
//    // Add any external dependencies your library needs
//    implementation(kotlin("stdlib-jdk8"))
//}

kotlin {
    jvmToolchain(11)
}
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
