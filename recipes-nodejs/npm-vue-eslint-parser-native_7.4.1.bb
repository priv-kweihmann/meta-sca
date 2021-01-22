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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.4.1.tgz"
SRC_URI[md5sum] = "47f753dacaf6caad96f3a3731d4b2c3d"
SRC_URI[sha256sum] = "d8833d13c5e4fd8721c37c24e8d2f2dd181e9f4f21261c0e38de456eb08830d8"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
