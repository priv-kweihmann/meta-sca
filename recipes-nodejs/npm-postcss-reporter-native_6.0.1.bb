SUMMARY = "NPM: postcss-reporter"
DESCRIPTION = "Log PostCSS messages in the console"
HOMEPAGE = "https://github.com/postcss/postcss-reporter#readme"

DEPENDS = "npm-chalk-native npm-lodash-native npm-log-symbols-native npm-postcss-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faf65be8f439b913bb5e892b7684a729"

SRC_URI = "https://registry.npmjs.org/postcss-reporter/-/postcss-reporter-6.0.1.tgz"
SRC_URI[md5sum] = "f1fce142b1931c85134d4ec370f53ff7"
SRC_URI[sha256sum] = "851b9e8fa811473f1d47c6577def037f98314c5f034147540654d3c50c3e3b9d"

NPM_PKGNAME = "postcss-reporter"

inherit npmhelper
inherit native
