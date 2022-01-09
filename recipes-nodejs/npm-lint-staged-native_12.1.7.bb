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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.1.7.tgz"
SRC_URI[md5sum] = "70430b3bd57d05eed6e8fa87bae391a9"
SRC_URI[sha256sum] = "f8ffe4263da3de10a955f87747fc2e09ad791da57e4cecd209284a02a188ba26"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
