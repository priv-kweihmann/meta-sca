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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-41.0.0.tgz"
SRC_URI[md5sum] = "4c9bbd688315c11aacb8f2468ac01252"
SRC_URI[sha256sum] = "33cbc3180771f7e91ae8c17074755b5020be7e9f280e486c9a2e743b141cf1f2"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
