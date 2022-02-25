SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.5.0.tgz"
SRC_URI[md5sum] = "624f525aed30478bda19fa1676e19639"
SRC_URI[sha256sum] = "55b054ba7daebeaa7a84e955f51e11c126bebd5413fd4ebc3128122af4c54213"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
