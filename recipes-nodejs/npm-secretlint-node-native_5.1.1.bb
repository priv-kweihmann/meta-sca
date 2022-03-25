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

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-5.1.1.tgz"
SRC_URI[md5sum] = "61a853b2257f462f0914e490b944d853"
SRC_URI[sha256sum] = "7ca96334bc2ae360fb869435777d59d73a2d601c8f78758fdc4f4fd8a19bcc17"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit native
