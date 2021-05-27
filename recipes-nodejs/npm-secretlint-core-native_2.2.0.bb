SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-2.2.0.tgz"
SRC_URI[md5sum] = "b1873173d27fbc6977da779fb9ee4397"
SRC_URI[sha256sum] = "32a712d31f4166f44d5d7dacd4b03699edca6883b162b4a5abfcbcb4f879391f"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
