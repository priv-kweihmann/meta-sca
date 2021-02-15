SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/vuejs/vue-eslint-parser#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

DEPENDS = "npm-debug-native \
           npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.5.0.tgz"
SRC_URI[md5sum] = "0153fd7848d632c6a37e73360a4e51d3"
SRC_URI[sha256sum] = "449151aa05237bcdaf6dbcad6a64f04ddbb6fa7dd112f3850260716418e9e488"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
