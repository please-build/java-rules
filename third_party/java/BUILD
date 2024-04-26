subinclude("//build_defs:java")

package(default_visibility = ["PUBLIC"])

_corretto_version = "11.0.23.9.1"

java_toolchain(
    name = "toolchain",
    hashes = [
        "008fae961dfd0df99cbc888a0279561458fe830797646234efe7daed8e512040", # linux
        "da2bd4fd790efce6a75eb81180734806dc5dd6d050da02242d9f8017ccaafaa1", # macosx
    ],
    jdk_url = {
        "linux": f"https://corretto.aws/downloads/resources/{_corretto_version}/amazon-corretto-{_corretto_version}-linux-x64.tar.gz",
        "darwin": f"https://corretto.aws/downloads/resources/{_corretto_version}/amazon-corretto-{_corretto_version}-macosx-x64.tar.gz",
    },
)

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

maven_jar(
    name = "gson",
    hash = "53bc5fe7644db908e6071d6c8b59059acadce7fc14217933d7251994e8673104",
    id = "com.google.code.gson:gson:2.8.4",
)

# These are shipped as components of Please, but for easier management the code lives in
# https://github.com/thought-machine/please-java
# As a result the versions are no longer directly connected to the ones in this repo.
maven_jar(
    name = "junit_runner",
    hashes = ["2b4af73adbba86f8c8a16def4d369682ba7de83147cfac09da549aba1ddf5f80"],
    id = "build.please:junit-runner:13.4.0",
    deps = [
        ":hamcrest",
        ":jacoco_shaded",
        ":junit",
    ],
)

maven_jar(
    name = "jacoco_shaded",
    hashes = ["9927bc9184d434c8ed0ed7ba46257df36e31dbd6bd224845d7a02d9e0894da4c"],
    id = "build.please:jacoco-shaded:0.8.4",
)

maven_jar(
    name = "logback-classic",
    hash = "98c3f18f5d0d642cd5f327cc724566cd19649626c7d88f70143bd704c94157d5",
    id = "ch.qos.logback:logback-classic:1.1.3",
    test_only = True,  # Only used in one test.
    deps = [
        ":logback-core",
        ":slf4j-api",
    ],
)

maven_jar(
    name = "logback-core",
    hash = "47c0fd342995d3315b8faccacc324b2a76143b27c430d4b2d6a29eabc31f5c14",
    id = "ch.qos.logback:logback-core:1.1.3",
    test_only = True,
)

maven_jar(
    name = "slf4j-api",
    hash = "3863e27005740d4d1289bf87b113efea115e9a22408a7d623be8004991232bfe",
    id = "org.slf4j:slf4j-api:1.7.10",
    test_only = True,
)
