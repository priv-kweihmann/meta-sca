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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-6.0.0.tgz"
SRC_URI[md5sum] = "269eec5ef02aa81620d75d0b9c6c63a7"
SRC_URI[sha256sum] = "383b469cd4854ddc73551d036257a52914cf96232a9318a7466f3813d875de22"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
