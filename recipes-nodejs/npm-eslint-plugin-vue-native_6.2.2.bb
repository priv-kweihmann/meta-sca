SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

DEPENDS = "npm-natural-compare-native npm-semver-native npm-vue-eslint-parser-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-6.2.2.tgz"
SRC_URI[md5sum] = "c885ad83ba3848cb407d51ec42f3c73b"
SRC_URI[sha256sum] = "d4934a521b044d7d597432cff5b2736fe465bd3cb7b08a09da04837abec0ec89"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
