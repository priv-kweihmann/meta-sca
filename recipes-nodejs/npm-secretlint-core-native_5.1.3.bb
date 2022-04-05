SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-5.1.3.tgz"
SRC_URI[md5sum] = "dbdcc09cf9e1b3a1eee7b3afb35847d7"
SRC_URI[sha256sum] = "5e8a0933463b72f9f7d5b5333eb0b3657f617afb2c0f669364f4f70f1e985ba4"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
