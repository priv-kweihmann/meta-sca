SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-7.5.0.tgz"
SRC_URI[md5sum] = "725d657181b5b9df8c47d60854ee5be9"
SRC_URI[sha256sum] = "33b0825d6298fa84c0e0a3559bb08c2d0e62cf40dc60683339cf2a15d244d1fb"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
