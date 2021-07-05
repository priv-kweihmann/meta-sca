SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-3.3.0.tgz"
SRC_URI[md5sum] = "fb48b4a551c2bb47d1701aab98430a9b"
SRC_URI[sha256sum] = "45dd4b48118ef88fa62482e2d3702c3da75712f46fc88f8732e093edee71f65f"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
