SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.12.1.tgz"
SRC_URI[md5sum] = "6b14195ad38c64c665b4db595e996daf"
SRC_URI[sha256sum] = "4efceaeb7b220a783a99af3b1d1de10ce15476af9c83f4c7d218c7110e13f009"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
