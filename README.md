# Java rules 

This repo provides Java rules for the [please](https://please.build) build system.

# Basic usage
See `./example` in this repo for a working example. 

```python
# BUILD
# This adds the plugin to your project
github_repo(
    name = "java_rules",
    repo = "please-build/java-rules",
    revision = "<Some git tag, commit, or other reference>",
)

# src/main/java/build/please/foo/BUILD
# This defines a java library that can be depended on by other Java rules
java_library(
    name = "foo",
    srcs = ["Foo.java"],
    visibility = ["//src/test/java/build/please/..."]
)

# src/test/java/build/please/foo/BUILD
# A test for the above library. 
java_test(
    name = "foo_test",
    srcs = ["FooTest.java"],
    deps = [
        "//third_party/java:junit", 
        "//src/main/java/build/please/foo",
    ]
)

# src/main/java/build/please/foo/BUILD
# This produces a self-executing .jar 
java_binary(
    name = "app",
    main_class = "build.please.Main",
    srcs = ["Main.java"],
    deps = ["//src/main/java/build/please/foo"]
)

# third_party/java/BUILD
# These rules pull down third party dependencies from maven. 
maven_jar(
    name = "junit",
    hash = "59721f0805e223d84b90677887d9ff567dc534d7c502ca903c0c2b17f05c116a",
    id = "junit:junit:4.12",
    deps = [
        ":hamcrest",
    ],
)

maven_jar(
    name = "hamcrest",
    hash = "4877670629ab96f34f5f90ab283125fcd9acb7e683e66319a68be6eb2cca60de",
    id = "org.hamcrest:hamcrest-all:1.3",
)
```

Then add this to your `.plzconfig`:
```
#.plzconfig
[Parse]
PreloadSubincludes = @java_rules//build_defs:java
```
Alternatively if you don't want to use Java everywhere, you may add `subinclude("@java_rules//build_defs:java")` to each 
BUILD file that uses the Java rules.

## Toolchain
By default, Please will use the JDK on the path. Optionally, you may use `java_toolchain()` to manage your JDK:
```python
# third_party/java/BUILD
java_toolchain(
    name = "toolchain",
    jdk_url = "https://corretto.aws/downloads/resources/11.0.8.10.1/amazon-corretto-11.0.8.10.1-linux-x64.tar.gz",
)
```
This can then be configured to be used by adding the following config:

```
[Plugin "Java"]
Toolchain = //third_party/java:toolchain
```

# Configuration

TODO - see the `.plzconfig` in this repo for now