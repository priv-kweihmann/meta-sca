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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.3.0.tgz"
SRC_URI[md5sum] = "d3abf7b8f95a91662b05b9535d495979"
SRC_URI[sha256sum] = "c64a4e8ef56e1bc6a42f8b30f41d248aeb30df65ffd6e97bf63325006fa4bfbb"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
