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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.2.tgz"
SRC_URI[md5sum] = "a74a95b0fd831b6046767cc0daf4b7a5"
SRC_URI[sha256sum] = "d694464dcb4dc6696689d1da7d05d91be4e26b44ce6c237bd52ba5222934914d"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
