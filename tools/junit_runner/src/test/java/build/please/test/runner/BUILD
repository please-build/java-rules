subinclude("//build_defs:java")

java_test(
    name = "please_test_runner_test",
    srcs = ["PleaseTestRunnerTest.java"],
    deps = [
        ":test_runner",
        "//tools/junit_runner",
        "//tools/junit_runner/src/test/java/build/please/test/runner/testdata",
        "//third_party/java:junit",
    ],
)

java_library(
    name = "test_runner",
    srcs = [
        "AlwaysAcceptingPleaseTestRunner.java",
    ],
    test_only = True,
    visibility = [
        "//tools/junit_runner/src/test/java/build/please/cover/runner/...",
    ],
    deps = [
        "//tools/junit_runner",
    ],
)
