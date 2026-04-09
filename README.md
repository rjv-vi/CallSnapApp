# CallSnapApp phase 1 scaffold (fixed)

This package is a clean Kotlin + Jetpack Compose base meant to replace the HTML/PWA app step by step.

## What this fixes

- no markdown or extra text inside Kotlin files
- no duplicate `AppSettings`
- no old HTML/PWA assumptions in the starter files
- simple navigation + DataStore settings

## Important

If your current project already contains old files like:
- `Models.kt`
- `AppStorage.kt`
- old versions of `MainActivity.kt`, `MainViewModel.kt`, `AppNavHost.kt`, `AppSettings.kt`

remove or replace them before building, otherwise you can still get redeclaration and unresolved reference errors.
