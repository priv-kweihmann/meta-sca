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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-5.2.0.tgz"
SRC_URI[md5sum] = "31eb98106d5a58e74bd3825357ba10a2"
SRC_URI[sha256sum] = "8fe44bfcee0e3c2d1aec40e318b2f2d5eea77ec16db168b3b930b451fa862340"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
