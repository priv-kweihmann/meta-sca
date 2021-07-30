SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.15.0.tgz"
SRC_URI[md5sum] = "4c0898b2e59be19edfd7a9cf123363d8"
SRC_URI[sha256sum] = "98ae0710f2a77de53f6f790323ee0b9af367947cbd75c622dbe2e965780792e6"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
