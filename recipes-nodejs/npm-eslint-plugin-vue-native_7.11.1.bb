SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.11.1.tgz"
SRC_URI[md5sum] = "ab69422d1ca84bf6d9d57989ee168351"
SRC_URI[sha256sum] = "bd6450f87cb99253836f205c764cfbde484b2a0f28f97cb48f217c96c6eccb39"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
