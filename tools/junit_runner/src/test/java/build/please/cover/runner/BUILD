subinclude("//build_defs:java")

java_test(
    name = "please_coverage_runner_test",
    srcs = [
        "PleaseCoverageRunnerTest.java",
    ],
    deps = [
        "//third_party/java:jacoco_shaded",
        "//tools/junit_runner/src/main/java:lib",
        "//tools/junit_runner/src/test/java/build/please/cover/runner/testdata",
        "//tools/junit_runner/src/test/java/build/please/test/runner:test_runner",
        "//third_party/java:junit",
    ],
)

java_test(
    name = "instrumenting_class_loader_test",
    srcs = [
        "InstrumentingClassLoaderTest.java",
    ],
    deps = [
        "//third_party/java:jacoco_shaded",
        "//tools/junit_runner/src/main/java:lib",
        "//tools/junit_runner/src/test/java/build/please/cover/runner/testdata",
        "//third_party/java:junit",
    ],
)
