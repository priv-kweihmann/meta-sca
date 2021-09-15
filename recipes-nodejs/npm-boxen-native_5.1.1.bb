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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-5.1.1.tgz"
SRC_URI[md5sum] = "f22787fea117e2149bef33627e62413e"
SRC_URI[sha256sum] = "c12b809e16175b7b34b00303c4d637133ab709b2e37de354a39033b01f3ec149"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
