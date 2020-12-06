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
           npm-lodash-native \
           npm-minimatch-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.2.2.tgz"
SRC_URI[md5sum] = "c5a177d0b03d37636fe88a4302488c9d"
SRC_URI[sha256sum] = "6ecd65efaf0e116c3ca8798dbad29ad64eb249c01bb471b5be18af547df24431"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
