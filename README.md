# First Read View Binding

1. First, create a new project with a name "First Read". Or whatever we want to name the project.

2. After the project has been created, we need to enable view binding in a module, set the **viewBinding** build option to **true** in the *module-level build.gradle* file

```
android {
    ...
    buildFeatures {
        viewBinding true
    }
}
```

3. In this project, there is a **findViewById** example for comparison, [Check](https://github.com/fachruddinn/First-Read-View-Binding/commit/a52eaf6984b583dccc6ef6ca6025ed2b250718f4)

```
val title: TextView = findViewById(R.id.tv_title)
val subTitle: TextView = findViewById(R.id.tv_sub_title)
title.text = getString(R.string.reader)
subTitle.text = getString(R.string.reader_are_awesome)
```

4. When Using View Binding, only take 2 lines of code, [Check](https://github.com/fachruddinn/First-Read-View-Binding/commit/e9e407a707450e4d544f5eadad692669b2763012)

```
binding.tvTitle.text = getString(R.string.reader)
binding.tvSubTitle.text = getString(R.string.reader_are_awesome)
```

5. Then we can check the final code, [Final Result](https://github.com/fachruddinn/First-Read-View-Binding/blob/main/app/src/main/java/space/imanda/firstread/MainActivity.kt)

## Advantages of View Binding

Null safety.<br/>
Type safety.<br/>
No boilerplate code.<br/>
No impact on build time.<br/>
Supports both Kotlin and Java.<br/>

## Further Reading and Resources

[View Binding Android Documentation](https://developer.android.com/topic/libraries/view-binding)

[Kotlin Synthetic is Dead, Long Live ViewBinding (Kotlin Android Extensions Deprecated)](https://proandroiddev.com/kotlin-synthetic-is-dead-long-live-viewbinding-kotlin-android-extensions-deprecated-10a66204d5fc)

[Why Are Kotlin Synthetics Deprecated and What Are the Alternatives?](https://medium.com/better-programming/why-are-kotlin-synthetics-deprecated-and-what-are-the-alternatives-5c2b087dda1c)
