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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.3.tgz"
SRC_URI[md5sum] = "9d33e65c133d3d2f2a40f2fdeeae739c"
SRC_URI[sha256sum] = "9b4979e32f5ad8b7d53fd925270f5ca174745087650ec6525473e1768d4dca66"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
