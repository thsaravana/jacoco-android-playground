# jacoco-android-playground
Playground Android project to test [jacoco-report](https://github.com/Madrapps/jacoco-report) github action

### Running Code Coverage at Module level
- The `app` module has multiple product flavors, and so it has 8 variants of coverage. To run code 
  coverage for "prod" flavor with `env` dimension and "normal" flavor with `api` dimension for "debug" 
  build type, run `./gradlew prodNormalDebugCoverage`
- The `math` and `text` modules has only buildTypes, and so to get the coverage, run 
  `./gradlew debugCoverage`.
- You could run the `.gradlew coverAllVariants` to generate code coverage reports for all variants 
  supported in the app.
  
### Running Code Coverage for entire project
- Choose the variants for each module that you want to run code coverage.
- Add them to the `variants` array in `project.gradle`.
- Either run the individual `Coverage` task for each variant, or just run `./gradlew coverAllVariants`.
- Run `./gradlew allDebugCoverage`.
- The unified report will be generated under `${rootDir}/build/reports/jacoco/`

For the full article on this read this [blog](https://thsaravana.github.io/blog/jacoco-single-coverage-for-multi-module/).
