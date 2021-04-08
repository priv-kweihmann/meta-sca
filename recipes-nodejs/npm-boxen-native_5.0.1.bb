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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-5.0.1.tgz"
SRC_URI[md5sum] = "275cbcd9d025cf308d46a00c9266861d"
SRC_URI[sha256sum] = "f332911d19f3544ecca9c3ac332cfc457f5d64b1e91a0a62a8fc7379a96b8b3d"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
