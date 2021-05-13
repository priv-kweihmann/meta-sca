SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-2.1.1.tgz"
SRC_URI[md5sum] = "dd0143aa4d1e8e4acc5c8dd1d4eba365"
SRC_URI[sha256sum] = "03a035f6e876043ab135f4ca3c33ddf063514fe6a41cbf8b1b332dbdc23a4208"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
