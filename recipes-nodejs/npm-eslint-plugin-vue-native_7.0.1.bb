SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.0.1.tgz"
SRC_URI[md5sum] = "5d10ddebee79f88e9e460505a31c87bf"
SRC_URI[sha256sum] = "3da650d22d8d1ce38d76f86356c3ded04065eee226c000d59668200d93cca957"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
