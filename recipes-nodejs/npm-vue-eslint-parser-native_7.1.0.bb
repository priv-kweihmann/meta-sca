SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/mysticatea/vue-eslint-parser#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

DEPENDS = "npm-debug-native \
           npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.1.0.tgz"
SRC_URI[md5sum] = "cbeaea25c2e6e1f4b8bcab4bc73d8cf1"
SRC_URI[sha256sum] = "b1408268f5e187374dbee71253789f770f3848322ba9ef377ab44fd2b2505340"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
