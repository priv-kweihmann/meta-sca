SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.6.0.tgz"
SRC_URI[md5sum] = "b1cdc3dc84935d742294f833beb3506b"
SRC_URI[sha256sum] = "b6adee8a4e09d9ef9fbe293e18adb7dcbd2c55b9af32cc79acf768d86f65da1a"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
