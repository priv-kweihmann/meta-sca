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
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-20.0.0.tgz"
SRC_URI[md5sum] = "9c07d6f539bbaa95fc63a23265794a64"
SRC_URI[sha256sum] = "f3af6b3726022aeb6f9a1a0dbf130bc5871c113497207e43f0d33b3382362045"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
