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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.1.1.tgz"
SRC_URI[md5sum] = "4a719b7c33aec9d37102b807813f1406"
SRC_URI[sha256sum] = "47945e591e717afaece10613f37c7238cebc6e62d93e0feda1269079348a4b77"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
