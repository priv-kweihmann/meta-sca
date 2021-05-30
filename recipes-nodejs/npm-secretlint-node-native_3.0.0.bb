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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-3.0.0.tgz"
SRC_URI[md5sum] = "01b944df64a3322a43e8729f01754a04"
SRC_URI[sha256sum] = "db712ea991bc4b7b3136e5f68f50a4c3b4b8a9e35b0477e9a2f3d6a247304f70"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
