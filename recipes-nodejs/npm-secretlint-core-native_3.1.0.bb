SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-3.1.0.tgz"
SRC_URI[md5sum] = "50c1c8f7d87ff41c1b745a30567d627e"
SRC_URI[sha256sum] = "8d8721797cca6146ee2140626c834af88bd5c3812677358d37bf8e2fc6b8e0ce"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
