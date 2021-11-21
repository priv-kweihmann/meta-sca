SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-38.0.1.tgz"
SRC_URI[md5sum] = "3b3713ab1a7b5e1f17aa1c9227043226"
SRC_URI[sha256sum] = "4b8e049004b80c37f30d3926baf6afd9262d21625af542e127273efe50c880e5"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
