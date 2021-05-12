SUMMARY = "NPM: @eslint/eslintrc"
DESCRIPTION = "The legacy ESLintRC config file format for ESLint"
HOMEPAGE = "https://github.com/eslint/eslintrc#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f0f520c61625b7338d0a038d6bb8e34"

DEPENDS = "npm-ajv-native \
           npm-debug-native \
           npm-espree-native \
           npm-globals-native \
           npm-ignore-native \
           npm-import-fresh-native \
           npm-js-yaml-native \
           npm-minimatch-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.4.1.tgz"
SRC_URI[md5sum] = "1eacd651f25ff244a131ecfbf82dd8ed"
SRC_URI[sha256sum] = "c29b2fbff201cb588c0e7cb1d5f7690368d5073d51b67d9cf534efb05a787cc5"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
