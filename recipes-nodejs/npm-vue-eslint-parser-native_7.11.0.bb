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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.11.0.tgz"
SRC_URI[md5sum] = "b1a951397bdfbd831f2182fa052bfef3"
SRC_URI[sha256sum] = "f5d4bc1367a908a9098282a428d428d7934e2ef1ac5fbbc405da9ecc1e3cd453"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
