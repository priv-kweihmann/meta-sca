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
           npm-lodash-native \
           npm-pluralize-native \
           npm-read-pkg-up-native \
           npm-regexp-tree-native \
           npm-reserved-words-native \
           npm-safe-regex-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-28.0.1.tgz"
SRC_URI[md5sum] = "5efdbed930800afce6e8eff948649aaa"
SRC_URI[sha256sum] = "bd91569da4d0c88b98fb4fc4ee16a10e0a64870119cb40067f299d2379a465fd"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
