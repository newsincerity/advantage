plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.dagger.hilt.android)
	alias(libs.plugins.kotlin.compose)
	alias(libs.plugins.kotlin.symbol.processing)
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

kotlin {
	compilerOptions {
		freeCompilerArgs.add("-Xcontext-parameters")
	}
}

dependencies {
	ksp(libs.dagger.hilt.compiler)
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.activity.compose)
	implementation(libs.androidx.compose.material.icons.extended)
	implementation(libs.androidx.compose.material3)
	implementation(libs.androidx.compose.material3.adaptive.navigation3)
	implementation(libs.androidx.compose.ui)
	implementation(libs.androidx.compose.ui.graphics)
	implementation(libs.androidx.compose.ui.tooling.preview)
	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.hilt.navigation.compose)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(libs.androidx.lifecycle.viewmodel.navigation3)
	implementation(libs.androidx.navigation3.runtime)
	implementation(libs.androidx.navigation3.ui)
	implementation(libs.dagger.hilt.android)
	debugImplementation(libs.androidx.compose.ui.tooling)
}
