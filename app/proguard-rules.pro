# VoicePing SDK
-keep class com.smartwalkie.voicepingsdk.** { *; }
-keep interface com.smartwalkie.voicepingsdk.** { *; }
-keepclassmembers class com.smartwalkie.voicepingsdk.** { *; }

# MessagePack (Bundled in VoicePing AAR)
-keep class org.msgpack.** { *; }
-keep interface org.msgpack.** { *; }
-keepclassmembers class org.msgpack.** { *; }
-dontwarn org.msgpack.**

# Apache Harmony (used by msgpack)
-keep class org.apache.harmony.** { *; }
-keepclassmembers class org.apache.harmony.** { *; }
-dontwarn org.apache.harmony.**

# Preserve all annotations and attributes for reflection
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod,SourceFile,LineNumberTable

# Support for reflection used by msgpack
-keepclassmembers class * {
    @org.msgpack.annotation.* *;
}

# Hilt / Dagger
-keep class **_HiltModules* { *; }
-keep class **_Factory { *; }
-keep class **_MembersInjector { *; }
-keep class * extends dagger.hilt.internal.GeneratedComponent { *; }
-keep class * extends dagger.hilt.internal.GeneratedComponentManager { *; }

# ViewModels and Compose
-keep class * extends androidx.lifecycle.ViewModel { *; }
-keep class * extends androidx.lifecycle.AndroidViewModel { *; }
-keep class com.ttalk.app.** { *; }

# Retrofit / OkHttp / Gson
-keep class retrofit2.** { *; }
-keep class okhttp3.** { *; }
-keep class com.google.gson.** { *; }
-keepclassmembers class * {
    @com.google.gson.annotations.* *;
}
