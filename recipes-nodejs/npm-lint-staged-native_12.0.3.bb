SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"

DEFAULT_PREFERENCE = "-1"
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
           npm-object-inspect-native \
           npm-string-argv-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.0.3.tgz"
SRC_URI[md5sum] = "cbbddfa5fc9411f44e1eb84cc231c7e5"
SRC_URI[sha256sum] = "4253055e8dcec2c71f14f0fe716a63bad436d92aa6be0406674e6f417b22dabb"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
