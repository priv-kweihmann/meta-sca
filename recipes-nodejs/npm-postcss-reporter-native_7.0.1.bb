SUMMARY = "NPM: postcss-reporter"
DESCRIPTION = "Log PostCSS messages in the console"
HOMEPAGE = "https://github.com/postcss/postcss-reporter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faf65be8f439b913bb5e892b7684a729"

DEPENDS = "npm-colorette-native \
           npm-lodash.difference-native \
           npm-lodash.forown-native \
           npm-lodash.get-native \
           npm-lodash.groupby-native \
           npm-lodash.sortby-native \
           npm-log-symbols-native"

SRC_URI = "https://registry.npmjs.org/postcss-reporter/-/postcss-reporter-7.0.1.tgz"
SRC_URI[md5sum] = "72c92ab3e504486ec9c07c87c6fda160"
SRC_URI[sha256sum] = "c22a5ff27489fbeb8a614b4f0715541c30d8da9654f3bba3d28183ddfd25cb2e"

NPM_PKGNAME = "postcss-reporter"

inherit npmhelper
inherit native
