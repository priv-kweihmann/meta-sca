SUMMARY = "NPM: @eslint/eslintrc"
DESCRIPTION = "The legacy ESLintRC config file format for ESLint"
HOMEPAGE = "https://github.com/eslint/eslintrc#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.1.0.tgz"
SRC_URI[md5sum] = "9b51f2bee48b6b268d3c548f0e8a83d0"
SRC_URI[sha256sum] = "f8f1310eb6c267c15df44df2331c24cdcafa4f56861ad1a9a4f6280b26356438"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
