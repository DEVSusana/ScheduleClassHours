

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.room)
    alias(libs.plugins.ksp)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }


    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    sourceSets.all {
        languageSettings.optIn("kotlin.experimental.ExperimentalObjCName")
    }
    sourceSets.commonMain {
        kotlin.srcDir("build/generated/ksp/metadata")
    }

    sourceSets {

        androidMain.dependencies {
            //Compose
            implementation(libs.compose.ui)
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)
            //Server
            implementation(libs.ktor.client.okhttp)
            //Coroutines
            implementation(libs.kotlinx.coroutines.android)
            //Dependencies injection
            implementation(libs.koin.android)

            implementation(libs.androidx.room.paging)
        }
        commonMain.dependencies {
            //compose
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            //Server
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.negotiation)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.serialization)
            //Coroutines
            implementation(libs.kotlinx.coroutines.core)
            //Json
            implementation(libs.kotlin.json.serialization)
            //Dependencies injection Koin
            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.compose)
            api(libs.koin.core)
            //Other
            implementation(libs.kotlinx.datetime)
            implementation(libs.androidx.paging.common)
            implementation(libs.androidx.room.runtime)
            implementation(libs.sqlite.bundled)
            implementation(libs.okio)
            implementation(libs.coil.compose)
            implementation(libs.coil.compose.ktor)


        }
        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
    task("testClasses")
}

android {
    namespace = "com.susanadev.scheduleclasshours"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "com.susanadev.scheduleclasshours"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
    dependencies {
        debugImplementation(compose.uiTooling)
    }
}

room {
    schemaDirectory("$projectDir/schemas")
}
dependencies {
    implementation(libs.androidx.viewmodel.compose)
    implementation(libs.navigation.compose)
    implementation(libs.androidx.lifecycle.viewmodel.android)
    implementation(libs.androidx.adapters)
    add("kspCommonMainMetadata", libs.androidx.room.compiler)
}


tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
    if (name != "kspCommonMainKotlinMetadata" ) {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}

