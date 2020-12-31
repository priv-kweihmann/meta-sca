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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-5.0.0.tgz"
SRC_URI[md5sum] = "f6155ef46637ff6df367dd05e8f87944"
SRC_URI[sha256sum] = "5f6624dccb4bf8eeb78205747492a74ba01d3f985ae21bf78c03275091faa0da"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
