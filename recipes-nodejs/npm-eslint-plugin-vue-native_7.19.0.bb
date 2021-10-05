SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.19.0.tgz"
SRC_URI[md5sum] = "5530d51034d452c7fad1a912cc41d850"
SRC_URI[sha256sum] = "1a1fe4a9aaa51249892a0a1726a78dd6842af96b564d0eef6b7b99850e74f527"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
