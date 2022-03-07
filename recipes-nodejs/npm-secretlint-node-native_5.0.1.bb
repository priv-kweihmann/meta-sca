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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-5.0.1.tgz"
SRC_URI[md5sum] = "f1c0ed8ba2349d61c587b5c8ef842226"
SRC_URI[sha256sum] = "cf348a2c88d915285bbfc36b5a45f44bda9fcd5b2a4b5f451157311508ec5020"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
