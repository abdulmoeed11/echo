object Versions {
    const val core = "1.9.0"
    const val kotlin = "1.9.0"
    const val lifecycle = "2.3.1"
    const val activityCompose = "1.5.1"
    const val compose = "2022.10.00"
    const val junit = "4.13.2"
    const val espresso = "3.5.1"
    const val androidx = "1.6.0"
    const val material = "1.8.0"
    const val daggerHilt = "2.48.1"
    const val daggerHiltCompiler = "2.48.1"
    const val hiltAndroidCompiler = "2.48.1"
    const val hiltViewModel = "1.0.0-alpha03"
    const val hiltCompiler = "1.0.0"
    const val hiltNavigationCompose = "1.0.0-alpha03"
    const val navigation = "2.6.0"
    const val voyagerVersion = "1.0.0"
    const val composeCompilerExtensionVersion = "1.5.1"
    const val material3 = "1.2.0"
    const val materialAdaptive = "1.0.0"
    const val firebaseBom = "32.7.2"
    const val firebaseAuth = "22.3.1"
    const val viewModelCompose = "2.4.1"

}

object Deps{
    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx:${Versions.firebaseAuth}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics"
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val kotlinBom = "org.jetbrains.kotlin:kotlin-bom:${Versions.kotlin}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.compose}"
    const val ui = "androidx.compose.ui:ui"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:1.1.5"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val androidx = "androidx.appcompat:appcompat:${Versions.androidx}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
    const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:${Versions.daggerHiltCompiler}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val voyagerNavigator = "cafe.adriel.voyager:voyager-navigator:${Versions.voyagerVersion}"
    const val voyagerHilt = "cafe.adriel.voyager:voyager-hilt:${Versions.voyagerVersion}"
    const val voyagerTransitions = "cafe.adriel.voyager:voyager-transitions:${Versions.voyagerVersion}"
    const val materialAdaptive = "androidx.compose.material3:material3-adaptive:${Versions.materialAdaptive}-alpha06"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModelCompose}"
}

object SDKversion {
    const val minSdk = 28
    const val targetSdk = 34
    const val compileSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"
}