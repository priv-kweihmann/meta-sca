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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-37.0.1.tgz"
SRC_URI[md5sum] = "514bcf185a548a91892b46ba32c63615"
SRC_URI[sha256sum] = "c376afb42709e61195f91bb649c89986727c58857fbbfb2cacfe2405740ea997"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
