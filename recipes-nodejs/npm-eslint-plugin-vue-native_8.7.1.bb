SUMMARY = "NPM: eslint-plugin-vue"
DESCRIPTION = "Official ESLint plugin for Vue.js"
HOMEPAGE = "https://eslint.vuejs.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a65c5c19c672ee4cd52492495f1d16"

DEPENDS = "npm-eslint-utils-native \
           npm-natural-compare-native \
           npm-nth-check-native \
           npm-postcss-selector-parser-native \
           npm-semver-native \
           npm-vue-eslint-parser-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-vue/-/eslint-plugin-vue-8.7.1.tgz"
SRC_URI[md5sum] = "aad20b3af06e5f9feb80cc63da535238"
SRC_URI[sha256sum] = "2d82ac8cafc4008ee8e528be4ae22335f1f41cb9175f47ca16c497d42cfe3018"

NPM_PKGNAME = "eslint-plugin-vue"

inherit npmhelper
inherit native
