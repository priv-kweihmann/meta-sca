SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.1.0.tgz"
SRC_URI[md5sum] = "6c5a3f99efffe1390194abf49f24b55b"
SRC_URI[sha256sum] = "2cec4f4e1b3a4d0bdaad161cf14fb408e5628bc1dd94bb9abe32f596d0398c85"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
