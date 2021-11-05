SUMMARY = "NPM: yargs"
DESCRIPTION = "yargs the modern, pirate-themed, successor to optimist."
HOMEPAGE = "https://yargs.js.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec88e65c7bb01732069f3ad6b09ac90d"

DEPENDS = "npm-cliui-native \
           npm-escalade-native \
           npm-get-caller-file-native \
           npm-require-directory-native \
           npm-string-width-native \
           npm-y18n-native \
           npm-yargs-parser-native"

SRC_URI = "https://registry.npmjs.org/yargs/-/yargs-17.2.1.tgz"
SRC_URI[md5sum] = "9debd17773480e9f92f59e26d41f5a92"
SRC_URI[sha256sum] = "6d26dad5c9071663d7fec0289ec2a52d2ebdfe8f4a216f32d1fa7945a9dd0a59"

NPM_PKGNAME = "yargs"

inherit npmhelper
inherit native
