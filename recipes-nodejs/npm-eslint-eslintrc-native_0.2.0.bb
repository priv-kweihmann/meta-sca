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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.2.0.tgz"
SRC_URI[md5sum] = "5de798dfc231be63ab49f84818f4c319"
SRC_URI[sha256sum] = "d818a5ae88be0c924e9f535af899533e37f012acac0e59a4c38c094447105d99"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
