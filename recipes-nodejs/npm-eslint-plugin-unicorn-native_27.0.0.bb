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
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-27.0.0.tgz"
SRC_URI[md5sum] = "52ab72119ead9e7b5f25c2fe19b758d4"
SRC_URI[sha256sum] = "e56f70fe2e92ebf024f7b7c9f3787b7818a89dfa1ac1ace052972bbd43541020"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
