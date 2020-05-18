SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-align-native \
           npm-camelcase-native \
           npm-chalk-native \
           npm-cli-boxes-native \
           npm-string-width-native \
           npm-term-size-native \
           npm-type-fest-native \
           npm-widest-line-native"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-3.2.0.tgz"
SRC_URI[md5sum] = "9852b4e5da04803d95efc1141bff2c8d"
SRC_URI[sha256sum] = "6b3e987ee7ccd5c8a3044709a9e391f86edf06708579a04aea274e106cbc9b30"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
