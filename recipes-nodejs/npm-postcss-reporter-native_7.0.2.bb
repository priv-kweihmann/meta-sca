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
           npm-lodash.sortby-native"

SRC_URI = "https://registry.npmjs.org/postcss-reporter/-/postcss-reporter-7.0.2.tgz"
SRC_URI[md5sum] = "8de2ea1ae7aa4b5e4a9efb9ef093799c"
SRC_URI[sha256sum] = "f7b224e135fea5b56e6f71a7f2ea09f428011408a2d03cb617226af5b5afcc60"

NPM_PKGNAME = "postcss-reporter"

inherit npmhelper
inherit native
