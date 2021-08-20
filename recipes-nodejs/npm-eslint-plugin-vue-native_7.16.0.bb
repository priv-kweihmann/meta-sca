SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.16.0.tgz"
SRC_URI[md5sum] = "635aa3f28388fd1506086d2e1b734241"
SRC_URI[sha256sum] = "8ee0c2f2f19081e06a674b1bf3d4b32953803dc8963f4e25f724386edde6344b"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
