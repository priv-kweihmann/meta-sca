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
           npm-lodash-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.9.0.tgz"
SRC_URI[md5sum] = "c03bcef9fdae4d9ea5e58a17e2f966a7"
SRC_URI[sha256sum] = "99c86bfb59283da5177bea4685fd48e9b634b4a84ec9864663e03cd59bb55eca"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
