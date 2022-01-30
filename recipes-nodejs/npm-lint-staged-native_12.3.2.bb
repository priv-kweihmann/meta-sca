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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.3.2.tgz"
SRC_URI[md5sum] = "a79284bc7bdbcc38a88f2d666ab923b0"
SRC_URI[sha256sum] = "f9e14f6cc3e9aab33c7bc7f2b6a6c00ac692a08f14011dce48878d42c8e4772b"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
