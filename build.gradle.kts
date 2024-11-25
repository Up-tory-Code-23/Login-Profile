buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Gradle Plugin 추가
        classpath("com.google.gms:google-services:4.3.15") // 최신 버전
    }
}
plugins {
    alias(libs.plugins.google.gms.google.services) apply false
}