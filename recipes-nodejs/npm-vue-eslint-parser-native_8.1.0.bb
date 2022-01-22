SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/vuejs/vue-eslint-parser#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

DEPENDS = "npm-debug-native \
           npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-lodash-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-8.1.0.tgz"
SRC_URI[md5sum] = "3975c7f9583edd235951e88c8a67c184"
SRC_URI[sha256sum] = "5e8d9dc80bbdff92f183c7820ca228ee9aeda029a338ba64b6d94809d0eb5fc9"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
