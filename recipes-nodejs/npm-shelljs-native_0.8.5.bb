SUMMARY = "NPM: shelljs"
DESCRIPTION = "Portable Unix shell commands for Node.js"
HOMEPAGE = "http://github.com/shelljs/shelljs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=984c31fdd47cf012f52739542dd857c4"

DEPENDS = "npm-glob-native \
           npm-interpret-native \
           npm-rechoir-native"

SRC_URI = "https://registry.npmjs.org/shelljs/-/shelljs-0.8.5.tgz"
SRC_URI[md5sum] = "ff3f1bc09a257edcf3de6d7ca5f69943"
SRC_URI[sha256sum] = "20167d458173bb6cb95d38503d6dfbdc20824dd3ca6a74ec6e573336a8c172bc"

NPM_PKGNAME = "shelljs"

inherit npmhelper
inherit native
