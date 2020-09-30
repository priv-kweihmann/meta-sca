SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.0.0.tgz"
SRC_URI[md5sum] = "001eb4f7d3ccc781545ca4b400690698"
SRC_URI[sha256sum] = "790557410298df577aa384e7f6e950742ab35a50ee93e17d034d755f892234e0"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
