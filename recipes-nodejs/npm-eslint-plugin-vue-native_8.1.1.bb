SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.1.1.tgz"
SRC_URI[md5sum] = "f9705cb0fea4b27cdf8dbe871555c433"
SRC_URI[sha256sum] = "4ed1c956e8659c84386b48ad321c83786d1ff143a1f3fb280113e743a4b9d9a7"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
