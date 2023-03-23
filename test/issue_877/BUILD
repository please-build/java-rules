# Tests for Java Library including resources

subinclude("///e2e//build_defs:e2e", "///java//build_defs:java")

java_library(
    name = "issue_877",
    srcs = [
        "MyClass.java",
    ],
    resources = [
        "some.txt",
        # TODO(macripps): Add this once we work out better quoting support (see build_env.go).
        # "file with space.txt",
    ],
    # Ensure resources end up at root of jar
    resources_root = "test/issue_877",
)

java_binary(
    name = "issue_877_main",
    main_class = "MyClass",
    deps = [
        ":issue_877",
    ],
)

plz_e2e_test(
    name = "issue_877_test",
    cmd = "unzip -l test/issue_877/issue_877.jar",
    data = [
        ":issue_877",
    ],
    expect_output_contains = "some.txt",
    labels = [
        "java",
    ],
)
