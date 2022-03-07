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

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-5.0.1.tgz"
SRC_URI[md5sum] = "fdb516646ef5153e81cc132c76c418ba"
SRC_URI[sha256sum] = "8104e8b064ecf6f490f48002d8679b1bf8436d81e9ad92f07bbcfd01ffc55d19"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
