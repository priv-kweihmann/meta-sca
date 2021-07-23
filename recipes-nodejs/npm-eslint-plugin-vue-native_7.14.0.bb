SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.14.0.tgz"
SRC_URI[md5sum] = "8a8a3f586be369f94a3c79d74976cd07"
SRC_URI[sha256sum] = "a3ad7a601550bd982799a3acbcb9a2a218d20a47bec627208201428bd278500a"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
