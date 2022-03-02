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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-4.2.0.tgz"
SRC_URI[md5sum] = "4f45abef7baf78d90c18273855e21fbb"
SRC_URI[sha256sum] = "fda50a21882557bbefa87f07e332b7b1fa3e816ad41097e62cd209c72cb1acc9"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
