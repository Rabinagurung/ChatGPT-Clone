plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    //enable the plugin
    id("com.google.devtools.ksp")

}

android {
    namespace = "com.example.chatgpt"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chatgpt"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // Add them as build config fields
        buildConfigField("String", "API_KEY", project.findProperty("API_KEY").toString())
        buildConfigField("String", "BASE_URL", project.findProperty("BASE_URL").toString())


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    val lifecycle_version = "2.7.0"

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")

    //Convert the JSON data to kotlin
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    //Annotations
    implementation("androidx.core:core-ktx:1.12.0")

    //View Modal

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    //Live data
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}