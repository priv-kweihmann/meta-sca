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

SRC_URI = "https://registry.npmjs.org/yargs/-/yargs-17.4.0.tgz"
SRC_URI[md5sum] = "c88bbcb8adf048954c0b932f65c7e6df"
SRC_URI[sha256sum] = "9cdb9f4b727e4419f721a0a0f231c772549357893e1d9a70cb4987da6a173838"

NPM_PKGNAME = "yargs"

inherit npmhelper
inherit native
