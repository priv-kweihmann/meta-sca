SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-utils-native \
           npm-esquery-native \
           npm-indent-string-native \
           npm-is-builtin-module-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-safe-regex-native \
           npm-semver-native \
           npm-strip-indent-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-40.1.0.tgz"
SRC_URI[md5sum] = "a918a240d7c53e39fa5ae9190960bc2d"
SRC_URI[sha256sum] = "708599beb222e200a10f7ea62246db28841ced99de255f5424d5d9bd8999ea9d"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
