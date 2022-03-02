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

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-4.2.0.tgz"
SRC_URI[md5sum] = "9b3aaeddbe9d5438c1622ba79344d027"
SRC_URI[sha256sum] = "9d83db953afec7e52a5340d31d60acc2b0b4b33a6429d551ba37841f7ac67db3"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
