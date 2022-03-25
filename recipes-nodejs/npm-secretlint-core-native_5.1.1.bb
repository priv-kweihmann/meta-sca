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

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-5.1.1.tgz"
SRC_URI[md5sum] = "7f81f9ba702204948ffbf2edcb78deee"
SRC_URI[sha256sum] = "ebf922dd026a12a76c909c7de655980cb6ba3f687bca67aced3e8580507aba11"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
