SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b44479d65c486365b13a21124f3fe39"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-commander-native \
           npm-debug-native \
           npm-execa-native \
           npm-lilconfig-native \
           npm-listr2-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-object-inspect-native \
           npm-string-argv-native \
           npm-supports-color-native \
           npm-yaml-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.3.5.tgz"
SRC_URI[md5sum] = "8b20e8be746a4001a5c5ce0e710c95ca"
SRC_URI[sha256sum] = "7807d56c103aa8c82c3a5c9fc8382e4623d8a86c8f5c90d250242d40acc5c8b3"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
