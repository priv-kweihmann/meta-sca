SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.8.0.tgz"
SRC_URI[md5sum] = "d6b90600a133cc9c05e0b796d33f9cea"
SRC_URI[sha256sum] = "6393e9dab3af5cca1beb4040f48be49b61d5b4cf6a47c19b9bd8bee9ad319c4e"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
