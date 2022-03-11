SUMMARY = "NPM: @secretlint/node"
DESCRIPTION = "Secretlint client library for Node.js"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/node/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-p-map-native \
           npm-secretlint-config-loader-native \
           npm-secretlint-core-native \
           npm-secretlint-formatter-native \
           npm-secretlint-profiler-native \
           npm-secretlint-source-creator-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-5.1.0.tgz"
SRC_URI[md5sum] = "ae9e74b5e95d6f877a6a95c874795985"
SRC_URI[sha256sum] = "24103df6b09fc382c2a41c7c304cb0109d8e05903ac72f1693506f4b4c5bf05d"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
