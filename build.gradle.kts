plugins {
    java
    kotlin("jvm") version "1.3.40" apply false
    id("com.gradle.build-scan") version "2.1"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
}
