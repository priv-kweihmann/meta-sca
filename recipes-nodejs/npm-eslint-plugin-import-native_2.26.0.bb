SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flat-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-eslint-import-resolver-node-native \
           npm-eslint-module-utils-native \
           npm-has-native \
           npm-is-core-module-native \
           npm-is-glob-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.26.0.tgz"
SRC_URI[md5sum] = "9f46ab62fb92c3f10d14890b32b7d0bb"
SRC_URI[sha256sum] = "bddeb1bd17cefa19c56b5e9cc861f667e0c82dcc35ee49aad27b1781f616753e"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
