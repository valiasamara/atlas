plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.22" apply false
}

android {
    namespace = "com.example.atlas"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"

    }

    defaultConfig {
        applicationId = "com.example.atlas"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

// Apply Google Services Plugin correctly
apply(plugin = "com.google.gms.google-services")

dependencies {
    implementation("com.google.ar.sceneform:core:1.8.0")
    implementation("com.google.ar:core:1.8.0")
    implementation("com.google.android.material:material:1.4.0") // Material Design
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    implementation("androidx.navigation:navigation-compose:2.7.5")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")

}
