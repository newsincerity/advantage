plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.kotlin.compose)
}

android {
	namespace = "ru.shindei.advantage.app"
	compileSdk {
		version = release(37)
	}
	defaultConfig {
		applicationId = "ru.shindei.advantage"
		minSdk = 23
		targetSdk = 37
		versionCode = 100
		versionName = "0.1.0 (Early Access)"
	}
	buildTypes {
		release {
			isMinifyEnabled = true
			isShrinkResources = true
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	buildFeatures {
		buildConfig = true
		compose = true
	}
	androidResources {
		generateLocaleConfig = true
	}
}

dependencies {
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.activity.compose)
	implementation(libs.androidx.compose.material.icons.extended)
	implementation(libs.androidx.compose.material3)
	implementation(libs.androidx.compose.ui)
	implementation(libs.androidx.compose.ui.graphics)
	implementation(libs.androidx.compose.ui.tooling.preview)
	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	debugImplementation(libs.androidx.compose.ui.tooling)
}
