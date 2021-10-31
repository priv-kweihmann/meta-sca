SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.0.3.tgz"
SRC_URI[md5sum] = "daaf459f74dfc617d7eb778f58c63e55"
SRC_URI[sha256sum] = "4248ae46fcd109fd673ccebab5a530bd66acf48540f0e586aadd6a3d6c2bf08b"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
