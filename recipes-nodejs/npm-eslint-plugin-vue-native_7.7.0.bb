SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.7.0.tgz"
SRC_URI[md5sum] = "800626bde87fe8bd05c701c36c548e7d"
SRC_URI[sha256sum] = "af633436de3e82298e0bb7a76545a844d53880b2cba66f23a2f3fb7e9e256b19"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
