SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.2.0.tgz"
SRC_URI[md5sum] = "d9e4bfe97d27ad1a788455a2705b2747"
SRC_URI[sha256sum] = "4104a001ed3e0acb91673d1478890826760cf3475b5dd90b40b864e9212830da"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
