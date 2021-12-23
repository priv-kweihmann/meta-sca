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

SRC_URI = "https://registry.npmjs.org/yargs/-/yargs-17.3.0.tgz"
SRC_URI[md5sum] = "82d1c1410a297bd7263d2f31eb58cf50"
SRC_URI[sha256sum] = "07ce4c2bc67f20b8693a1dc0007534b2945c7d2bb107b04e7c99f6a935fb1bbb"

NPM_PKGNAME = "yargs"

inherit npmhelper
inherit native
