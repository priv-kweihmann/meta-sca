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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.2.2.tgz"
SRC_URI[md5sum] = "36233bd203c97c4b02fc9f23ae6d637d"
SRC_URI[sha256sum] = "2335d1bbf8020883eab19c4ac1a027618b7eb5a77160a2cd6b0a7bd1fceb88f9"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
