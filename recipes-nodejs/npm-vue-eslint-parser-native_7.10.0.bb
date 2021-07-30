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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.10.0.tgz"
SRC_URI[md5sum] = "d717096f4977008d2b5214b52523a6a4"
SRC_URI[sha256sum] = "d0b64fd0c0eadfd2a655fb2f6f92f0df93479419b8fcd4a8904c8e552c7b5ba8"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
