SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.4.1.tgz"
SRC_URI[md5sum] = "c18f64f0f37c55a7e220fef33471b7d9"
SRC_URI[sha256sum] = "a491e16ae6d889b7b6e2036033ad2bf3c52597d70a9b2128d2f67fadf8f46a04"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
