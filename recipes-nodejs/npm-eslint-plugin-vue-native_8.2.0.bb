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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.2.0.tgz"
SRC_URI[md5sum] = "cdb28fc6e8ad6491f45f293e9f763962"
SRC_URI[sha256sum] = "a252d82660775d5f9d174083343b31f0ab1383538ca0e5637966cecdb5041b63"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
