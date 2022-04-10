SUMMARY = "NPM: yargs"
DESCRIPTION = "yargs the modern, pirate-themed, successor to optimist."
HOMEPAGE = "https://yargs.js.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec88e65c7bb01732069f3ad6b09ac90d"

DEPENDS = "npm-cliui-native \
           npm-escalade-native \
           npm-get-caller-file-native \
           npm-require-directory-native \
           npm-string-width-native \
           npm-y18n-native \
           npm-yargs-parser-native"

SRC_URI = "https://registry.npmjs.org/yargs/-/yargs-17.4.1.tgz"
SRC_URI[md5sum] = "e7df2ffed7af9fba4cd093a9407f18b8"
SRC_URI[sha256sum] = "84d3ec8e449c4b6f3bdcdf30e2744702a126dee681e85212cbcdab655f107a3c"

NPM_PKGNAME = "yargs"

inherit npmhelper
inherit native
