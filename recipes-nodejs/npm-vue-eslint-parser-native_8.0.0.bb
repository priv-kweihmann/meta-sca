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

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-8.0.0.tgz"
SRC_URI[md5sum] = "108eefdadd0353e365fcde56c7d7a1d3"
SRC_URI[sha256sum] = "986fdad52986f80e5c064b460492fb28a6324e5546bae41f9d43babb3dc2e4df"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit native
