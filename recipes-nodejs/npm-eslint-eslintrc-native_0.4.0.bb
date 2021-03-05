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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-0.4.0.tgz"
SRC_URI[md5sum] = "030622090b57910178c50094667bcd35"
SRC_URI[sha256sum] = "ef7c4a73877469c3be3c8f2d965aa08c094e157fc1b86e325f6c82cadf92d072"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
