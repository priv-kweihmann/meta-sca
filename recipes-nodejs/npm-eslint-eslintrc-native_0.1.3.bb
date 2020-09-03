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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.1.3.tgz"
SRC_URI[md5sum] = "c28bdd78089213ba1a6d38c2ed8ae70a"
SRC_URI[sha256sum] = "7b0aa3b9f2f87bd73b4424dd81ddb5b8d44ea9c90d102830485e425b75fd3438"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
