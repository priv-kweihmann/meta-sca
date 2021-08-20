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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.0.tgz"
SRC_URI[md5sum] = "51767264d3a0b2501f175b24a99bdb58"
SRC_URI[sha256sum] = "5767489bf06d0113dd6d16477af9a58097341f3a322ffd28b3b0e2bbac3e9f4e"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
