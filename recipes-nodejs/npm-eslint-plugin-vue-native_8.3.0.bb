SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.3.0.tgz"
SRC_URI[md5sum] = "91a7ea4dac68b49aac0633061b633674"
SRC_URI[sha256sum] = "00a96bc5fd3a83f1d21ba0bbd290d3dd2250115df1d0e62c7f4758b677f9ba03"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
