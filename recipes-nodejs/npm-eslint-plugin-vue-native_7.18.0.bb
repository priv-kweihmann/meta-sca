SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.18.0.tgz"
SRC_URI[md5sum] = "829734fe252b917ba393217a73a0c38f"
SRC_URI[sha256sum] = "2ccd7b47b867344731c2551c4a783a15ceb6b53a14a61aef592b02cd7544fd48"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
