SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/vuejs/vue-eslint-parser#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

DEPENDS = "npm-debug-native \
           npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-lodash-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-8.3.0.tgz"
SRC_URI[md5sum] = "e710351e697dea286cf26d9f393d0e62"
SRC_URI[sha256sum] = "940d373d89fdb27163e8909bc7ecdd87d4edaa127a2aa5e75b0dac0e5254d61e"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
