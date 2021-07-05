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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.7.2.tgz"
SRC_URI[md5sum] = "81070151db7fed6267adddb3ee1ec18d"
SRC_URI[sha256sum] = "081f7816b04c67feb69be4df0fcfcf973e070e1b83e7faccc2b249b001fba7ff"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
