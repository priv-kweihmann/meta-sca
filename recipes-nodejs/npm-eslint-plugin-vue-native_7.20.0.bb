SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.20.0.tgz"
SRC_URI[md5sum] = "219ece2a3a526bf6ba7eea08807fddf0"
SRC_URI[sha256sum] = "1a3645349648ad91c8dcbcefb5eba59d636e1c3ac154b99b034abc936b8c3f4f"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
