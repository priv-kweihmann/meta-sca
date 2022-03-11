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

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-5.1.0.tgz"
SRC_URI[md5sum] = "f93647b6195dfdeb495afc0ad05f7383"
SRC_URI[sha256sum] = "db4b1d225fbe4d0817196ffcb3699dc689a29ccab00bd9baa4c83f94324e6d00"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
