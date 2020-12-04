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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.2.0.tgz"
SRC_URI[md5sum] = "dcd0c3958bba7571e37a1bc88c32f912"
SRC_URI[sha256sum] = "a6d434a61f408bf1c6686031c433a64d2654ceb4e61f66d6a4281c257bbf1f0d"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
