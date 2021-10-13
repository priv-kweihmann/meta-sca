SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b44479d65c486365b13a21124f3fe39"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-commander-native \
           npm-cosmiconfig-native \
           npm-debug-native \
           npm-enquirer-native \
           npm-execa-native \
           npm-listr2-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-please-upgrade-node-native \
           npm-string-argv-native \
           npm-stringify-object-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.2.3.tgz"
SRC_URI[md5sum] = "1ecccf4156cc65dc8c1f36088dea5ac5"
SRC_URI[sha256sum] = "a53fae28c577bc6569194c5859225d7cc11939f9bea2754d43e63b35db4a77f9"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
