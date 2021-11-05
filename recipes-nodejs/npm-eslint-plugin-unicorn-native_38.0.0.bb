SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-template-visitor-native \
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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-38.0.0.tgz"
SRC_URI[md5sum] = "8c562d0d8ed8a2d838215f4c64e68133"
SRC_URI[sha256sum] = "b251e456f3197bc59f4570642e4dc0af59f3b03177899a140a09d1190065d73c"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
