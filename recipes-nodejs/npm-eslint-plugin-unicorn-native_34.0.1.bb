SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-template-visitor-native \
           npm-eslint-utils-native \
           npm-is-builtin-module-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-34.0.1.tgz"
SRC_URI[md5sum] = "96fabc6397e2661314243713cbdc3bb4"
SRC_URI[sha256sum] = "4d1eb321c9f6244e32b96bdef325dac54da8ef806b611d286d321083930a124b"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
