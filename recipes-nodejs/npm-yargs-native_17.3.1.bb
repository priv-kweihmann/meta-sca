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

SRC_URI = "https://registry.npmjs.org/yargs/-/yargs-17.3.1.tgz"
SRC_URI[md5sum] = "059c50cf75a81d7a13d5fdae48b93697"
SRC_URI[sha256sum] = "167b90f61fe91be8b4093451578aed7dfb79b35765d03e5e2dfdf3f3ccd8e0f9"

NPM_PKGNAME = "yargs"

inherit npmhelper
inherit native
