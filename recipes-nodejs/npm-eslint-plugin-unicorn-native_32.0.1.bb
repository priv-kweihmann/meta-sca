SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-template-visitor-native \
           npm-eslint-utils-native \
           npm-import-modules-native \
           npm-is-builtin-module-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-32.0.1.tgz"
SRC_URI[md5sum] = "c02e2973234ccc493fa8025ce7043292"
SRC_URI[sha256sum] = "647fbed36cb679f45386c1672fc2559c4ded3e86b6f6364b27d6564d16eec481"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
