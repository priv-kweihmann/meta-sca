SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.13.0.tgz"
SRC_URI[md5sum] = "0ff75fc7ad6d5b119768d9dd6eb03f38"
SRC_URI[sha256sum] = "93180f8b626c67ea1e459198971b7b80f4c1d445e581266b3aa3fa79b48db78d"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
