plugins {
    groovy
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation("io.ktor:ktor-server-core:2.0.0-beta-1")
    implementation("com.squareup:kotlinpoet:1.10.2"){
        exclude(module = "kotlin-reflect")
    }
}

