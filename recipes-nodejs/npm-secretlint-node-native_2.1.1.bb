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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-2.1.1.tgz"
SRC_URI[md5sum] = "42cf387d43a3cc5cfd99f84077d712b3"
SRC_URI[sha256sum] = "d5fb1b7a25e845142f1bbd7ea0de84ef16fa128f352ef6af0690ad260e97b825"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
