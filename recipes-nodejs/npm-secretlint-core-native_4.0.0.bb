SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-4.0.0.tgz"
SRC_URI[md5sum] = "d8e85dfafec82df2ea8a1d8629a3dc81"
SRC_URI[sha256sum] = "01f1f5de2f919e650bf3c259da61a9f955f755917ae6cad59120167b6127f232"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
