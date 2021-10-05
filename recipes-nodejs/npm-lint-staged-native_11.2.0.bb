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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.2.0.tgz"
SRC_URI[md5sum] = "33a8eb074b2e12fb2e19ef3343a32f9f"
SRC_URI[sha256sum] = "4d17b290f1a976177bd2660e7897a29f1d2b58eb073699505ce13d03a3ba0598"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
