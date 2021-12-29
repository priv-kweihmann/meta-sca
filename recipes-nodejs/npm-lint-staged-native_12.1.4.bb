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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.1.4.tgz"
SRC_URI[md5sum] = "ff0cbace04664387430b9516c7eb1cae"
SRC_URI[sha256sum] = "e9a0697eeff3b44f725a2e862da99a8cba5c186e130e77d9edf7fe96bf110b62"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
