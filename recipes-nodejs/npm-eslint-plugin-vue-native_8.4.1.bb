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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.4.1.tgz"
SRC_URI[md5sum] = "85702103eaae1dec6dc7bd86464baf60"
SRC_URI[sha256sum] = "a17f89ebe6bff3fdf454000813b7b830590fe2e10c72b5f9538158007387c2da"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
