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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-30.0.0.tgz"
SRC_URI[md5sum] = "cc8e7202969816905b292ea7cbc6ffc7"
SRC_URI[sha256sum] = "1c16a588e3e0adac78a17c4a54b3cd9c4a57faa5f81bd957ff19b8fcd3db423a"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit native
