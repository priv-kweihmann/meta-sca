SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ci-info-native \
           npm-clean-regexp-native \
           npm-eslint-ast-utils-native \
           npm-eslint-template-visitor-native \
           npm-eslint-utils-native \
           npm-import-modules-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-24.0.0.tgz"
SRC_URI[md5sum] = "2efca27396d6d21989079393e5300f0e"
SRC_URI[sha256sum] = "49a9138e57b585a5b535348e454ae0cdb32b2481ab8e0fdd866fe56cbaddef48"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
