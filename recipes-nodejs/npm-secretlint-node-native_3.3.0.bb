SUMMARY = "NPM: @secretlint/node"
DESCRIPTION = "Secretlint client library for Node.js"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/node/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-p-map-native \
           npm-secretlint-config-loader-native \
           npm-secretlint-core-native \
           npm-secretlint-formatter-native \
           npm-secretlint-profiler-native \
           npm-secretlint-source-creator-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-3.3.0.tgz"
SRC_URI[md5sum] = "1c5a2afb9cb2c5e138858387208f3350"
SRC_URI[sha256sum] = "2c93eea1b059874f040fd2ab9f1170b0ee3b979d8ea4a65084d82b00735ff8f8"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
