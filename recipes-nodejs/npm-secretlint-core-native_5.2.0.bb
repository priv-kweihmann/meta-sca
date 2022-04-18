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

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-5.2.0.tgz"
SRC_URI[md5sum] = "048210a39b4beb8d55d4ede4e8444835"
SRC_URI[sha256sum] = "68e822f369b32e486e8eba0e53ec1141adaed2a2cb150611c18686fc7e45c2f7"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
