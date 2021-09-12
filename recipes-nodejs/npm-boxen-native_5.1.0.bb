SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-align-native \
           npm-camelcase-native \
           npm-chalk-native \
           npm-cli-boxes-native \
           npm-string-width-native \
           npm-type-fest-native \
           npm-widest-line-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-5.1.0.tgz"
SRC_URI[md5sum] = "e73a61ecd11782f954fe7d968f80907d"
SRC_URI[sha256sum] = "4688a8e35ca4c0720d8864d4811b072c4db283906fc88e87d024a8e451cdebca"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
