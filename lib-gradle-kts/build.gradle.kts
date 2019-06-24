plugins {
    java
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}