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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-3.2.0.tgz"
SRC_URI[md5sum] = "1b8776c379ea21f8e264145749bbaaea"
SRC_URI[sha256sum] = "2a03f66c90c5a79bcaefc25593dc485ed5cf75eefc6a5aeee37eb13f46be45d7"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
