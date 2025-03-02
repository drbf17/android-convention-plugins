# Convention Plugins for Android

This project defines a set of convention plugins for Android projects, aimed at standardizing and simplifying common build configurations. The plugins are designed to be additive and composable, allowing modules to pick and choose the configurations they need.

## Plugins

### `androidApplicationJacoco`

This plugin sets up JaCoCo code coverage for Android application projects. It configures the necessary tasks and dependencies to generate code coverage reports for unit tests.

### Reporting tasks

JacocoDebugCodeCoverage - Execute ui and unit tests, generate and combine Jacoco coverage report
JacocoReleaseCodeCoverage - Execute ui and unit tests, generate and combine Jacoco coverage report


### `androidLibraryJacoco`

This plugin sets up JaCoCo code coverage for Android library projects. Similar to the `androidApplicationJacoco` plugin, it configures tasks and dependencies to generate code coverage reports for unit tests.

### Reporting tasks

JacocoDebugCodeCoverage - Execute ui and unit tests, generate and combine Jacoco coverage report
JacocoReleaseCodeCoverage - Execute ui and unit tests, generate and combine Jacoco coverage report

## Usage

Apply the desired plugin in your module's `build.gradle.kts`:



