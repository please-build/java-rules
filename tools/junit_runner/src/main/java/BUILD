subinclude("//build_defs:java")

java_library(
    name = "lib",
    srcs = glob(["build/please/**.java"]),
    visibility = ["//tools/junit_runner/..."],
    deps = ["//third_party/java:jacoco_shaded", "//third_party/java:junit"],
)
