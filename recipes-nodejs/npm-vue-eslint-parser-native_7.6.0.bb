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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.6.0.tgz"
SRC_URI[md5sum] = "291bba4420d871465a0ea84994c5497d"
SRC_URI[sha256sum] = "39f6f075f9886ff5b120081e4496f1fca468fee14d38b5325641f65d386e8cf0"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
