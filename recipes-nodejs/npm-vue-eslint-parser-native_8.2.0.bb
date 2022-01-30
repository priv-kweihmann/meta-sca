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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-8.2.0.tgz"
SRC_URI[md5sum] = "a6c3b2c93c88d8f846427a6156e07022"
SRC_URI[sha256sum] = "b7840c415f86da3bdbe4edbe01c208c667814fc481ab098c809b7ec2f48508dc"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
