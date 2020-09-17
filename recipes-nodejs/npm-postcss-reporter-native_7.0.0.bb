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

SRC_URI = "https://registry.npmjs.org/postcss-reporter/-/postcss-reporter-7.0.0.tgz"
SRC_URI[md5sum] = "c1278c2b034fed1a9888f15ef8f9a915"
SRC_URI[sha256sum] = "a890d7ec80f609019eea5d5696f5c8f62a76318b9c6e3c0d61a971bdf0964b66"

NPM_PKGNAME = "postcss-reporter"

inherit npmhelper
inherit native
