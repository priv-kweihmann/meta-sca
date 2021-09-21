SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b44479d65c486365b13a21124f3fe39"

DEPENDS = "npm-chalk-native \
           npm-cli-truncate-native \
           npm-commander-native \
           npm-cosmiconfig-native \
           npm-debug-native \
           npm-enquirer-native \
           npm-execa-native \
           npm-listr2-native \
           npm-log-symbols-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-please-upgrade-node-native \
           npm-string-argv-native \
           npm-stringify-object-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.1.2.tgz"
SRC_URI[md5sum] = "3641050e45103f54262fdd18ff899157"
SRC_URI[sha256sum] = "4f5c6d6db716579991588875e7e7b29d4da9ed67f93d981145a6e7c99d7adcb5"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
