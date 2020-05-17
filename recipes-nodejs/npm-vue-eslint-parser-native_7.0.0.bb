SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/mysticatea/vue-eslint-parser#readme"

DEPENDS = "npm-debug-native npm-eslint-scope-native npm-eslint-visitor-keys-native npm-espree-native npm-esquery-native npm-lodash-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.0.0.tgz"
SRC_URI[md5sum] = "1c8813f4638150cc7cba5b6af7750b27"
SRC_URI[sha256sum] = "67932cb96e51251d4946567af434a063e0ddcde1f184b35b770b9a67747fae2b"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
