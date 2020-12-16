SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.3.0.tgz"
SRC_URI[md5sum] = "2347896ec2280d567bf792c471127d8c"
SRC_URI[sha256sum] = "ee676d20de303359409176977216575da4c8e89f2660b274303c9195415542b1"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
