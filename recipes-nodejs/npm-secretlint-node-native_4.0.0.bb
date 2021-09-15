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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-4.0.0.tgz"
SRC_URI[md5sum] = "d04ca2d7ec9583cdea39c22b5c5c125c"
SRC_URI[sha256sum] = "21551d672baf8e82a1e305177ca0a1e01ce34b913599e50157f127be8159098b"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
