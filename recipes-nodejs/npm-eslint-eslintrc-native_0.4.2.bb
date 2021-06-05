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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.4.2.tgz"
SRC_URI[md5sum] = "352c87270783802489c62be3252b0368"
SRC_URI[sha256sum] = "0e9d03f2758562942fe78f0a00d9925f40749fb0018abf01d38e4558cd7308f9"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
