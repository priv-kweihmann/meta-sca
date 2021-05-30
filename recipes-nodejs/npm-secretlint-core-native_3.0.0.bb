SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-3.0.0.tgz"
SRC_URI[md5sum] = "ae7ac751205cbed9a78fcb26cfc6d1df"
SRC_URI[sha256sum] = "3e9184f15513e75f474865a1c54f01733fa33431eda5e2acc083d6ccfdd81d29"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
