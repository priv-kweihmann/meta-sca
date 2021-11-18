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
           npm-execa-native \
           npm-listr2-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-object-inspect-native \
           npm-string-argv-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.0.2.tgz"
SRC_URI[md5sum] = "f8ea95dd6245844451c5b1b44fa217ae"
SRC_URI[sha256sum] = "10f2fe1c14b0f032df8ec86611c071fa74e21cf8226d2e74efeb6751fa484add"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
