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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-3.1.0.tgz"
SRC_URI[md5sum] = "76ff1bbf685c73925a2b0a35621a0bb6"
SRC_URI[sha256sum] = "39e031f16a5fb559ecc9e4ed66ff3a6a87eb7f21bb2b19753399f7005b34fad2"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
