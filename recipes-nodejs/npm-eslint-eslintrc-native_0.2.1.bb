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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.2.1.tgz"
SRC_URI[md5sum] = "c0fede504b370539e85f01b791bae54f"
SRC_URI[sha256sum] = "85f2663f11846b28afc059f698ad2202e39c9df1277147e1bbe7ee6ebfc7eb7e"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
