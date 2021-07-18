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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.4.3.tgz"
SRC_URI[md5sum] = "8d65a4ac3915aa81942fd81f9b4e4ba7"
SRC_URI[sha256sum] = "cf3039759f52c8a37d828f7160a1770057305be0a672e00c20da5433a8c9a822"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
