SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.9.0.tgz"
SRC_URI[md5sum] = "70e065f1f6428aff427f3d1320c5f7cf"
SRC_URI[sha256sum] = "68d30b14170519e3c711e45bd071f38e98817c199cdcfa3bd7cf8e9e7ea7cacd"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
