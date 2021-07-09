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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-7.8.0.tgz"
SRC_URI[md5sum] = "d4ec91c8fafc12df47be632535e0f6d5"
SRC_URI[sha256sum] = "48eef5922c259c745c7219694335154b551fd630cc98c6a2c77df831cd8e484b"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
