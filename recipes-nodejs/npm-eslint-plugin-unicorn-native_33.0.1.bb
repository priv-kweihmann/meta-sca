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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-33.0.1.tgz"
SRC_URI[md5sum] = "87c10bd4efee1202fa91aa692a569c6a"
SRC_URI[sha256sum] = "7a28a58af49417adfb9572dff87b5386ef429cb75e477493d455269434b52c02"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
