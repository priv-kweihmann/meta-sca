SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.1.0.tgz"
SRC_URI[md5sum] = "95234766b79d78078fe141afb88bf88a"
SRC_URI[sha256sum] = "069695345579a7c0faf183a289908fa738de95a38706e7d2cc9714696eeab960"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
