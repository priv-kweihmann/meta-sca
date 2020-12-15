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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.3.0.tgz"
SRC_URI[md5sum] = "01c31be3b1e4ee534941a60e72957584"
SRC_URI[sha256sum] = "86b9f71beaee1679131fdd5f685c8dae4522175b2e26804beb427fb70981b428"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
