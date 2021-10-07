SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.19.1.tgz"
SRC_URI[md5sum] = "ee5807b95e839d0b7074c42eb3e8d6eb"
SRC_URI[sha256sum] = "98a02b59d67e2b3348fc0c6eb14794c5c2cf615132b95b8f12385d7a939a5d9c"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
