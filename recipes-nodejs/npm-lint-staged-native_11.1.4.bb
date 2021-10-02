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

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.1.4.tgz"
SRC_URI[md5sum] = "079af08ba825291122c11b3e7084f158"
SRC_URI[sha256sum] = "9cd6c9c2878e69764ce63ab4612c787c57b30e2db296f8019657087f1f5e998c"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
