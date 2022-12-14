object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradle}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

object Deps{
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val lifecycle by lazy { "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}" }
    val room by lazy { "androidx.room:room-runtime:${Versions.room}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
    val gson by lazy { "com.google.code.gson:gson:${Versions.gson}" }
    val glide by lazy { "com.github.bumptech.glide:glide:${Versions.glide}" }
    val navigation by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}" }
    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltViewModel by lazy { "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltCompiler}" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}" }

}