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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-2.2.0.tgz"
SRC_URI[md5sum] = "5a191c3a99ecd18eb9eeeacea9236434"
SRC_URI[sha256sum] = "2d4a9490ba0b745e70d4e496cc019dfc3e92a8e467cd1f86fc67f922a9311aa4"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
