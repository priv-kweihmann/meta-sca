SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.15.1.tgz"
SRC_URI[md5sum] = "1378bff294c1510ca984c2ccd884fb2a"
SRC_URI[sha256sum] = "c61ca0e7cee8a876505cc2edea13bacb2c6a7b4314984db63de11681362aba66"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
