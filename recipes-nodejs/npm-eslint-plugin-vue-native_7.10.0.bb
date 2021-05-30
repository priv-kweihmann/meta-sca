SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.10.0.tgz"
SRC_URI[md5sum] = "2de95fd3605d87084e19740b6a0f9fab"
SRC_URI[sha256sum] = "3b3a3734d055b5821b7fe384b4c448bfe07b7224b9c1eb96b997bb6d2b5fed1a"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
