SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-template-visitor-native \
           npm-eslint-utils-native \
           npm-eslint-visitor-keys-native \
           npm-import-modules-native \
           npm-is-builtin-module-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-31.0.0.tgz"
SRC_URI[md5sum] = "515327871d4bf391ef28ff734381a3db"
SRC_URI[sha256sum] = "621c14a63ea88a0855795be538ca18b34652bdedb45cd7f0754414c4509e475a"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
