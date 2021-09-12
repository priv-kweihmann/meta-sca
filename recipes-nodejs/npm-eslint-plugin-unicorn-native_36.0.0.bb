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
           npm-is-builtin-module-native \
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-36.0.0.tgz"
SRC_URI[md5sum] = "ba3f73a7b4d3d834025773c98d7e5ae6"
SRC_URI[sha256sum] = "0a35246dc834e6fdafbf08d3250f4d591e58f70247b0d988134ac3e29b84433d"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
