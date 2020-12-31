SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.4.0.tgz"
SRC_URI[md5sum] = "05c97697784db7c06b9beec2e0b7c573"
SRC_URI[sha256sum] = "8080e8848ef35586fce856d9484123d823a78e501c85a8185a9b4e5ef8687e64"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
