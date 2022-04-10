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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.6.0.tgz"
SRC_URI[md5sum] = "c83faa9692cf974098a2ecf71a27c075"
SRC_URI[sha256sum] = "7cfeba7d42b527f5de5b776acf4107a8b35a9e460e475bb34c8ff6d1231628c2"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
