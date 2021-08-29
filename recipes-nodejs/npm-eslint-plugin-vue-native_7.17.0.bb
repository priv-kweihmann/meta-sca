SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.17.0.tgz"
SRC_URI[md5sum] = "9857175dd062d9841464b806d0e384ef"
SRC_URI[sha256sum] = "539733615ff7acb98b57f9d2e1e04191b6ef14eae81205e3f421942a3b83391f"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
