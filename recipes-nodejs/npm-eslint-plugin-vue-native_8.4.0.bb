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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.4.0.tgz"
SRC_URI[md5sum] = "8362cfa27c17ec1609bc743b653a3e4e"
SRC_URI[sha256sum] = "c3a2f7757ccca4462d8cb6559f5729887e67763ef94b8beadb3a3c8fd5b5a7c3"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
