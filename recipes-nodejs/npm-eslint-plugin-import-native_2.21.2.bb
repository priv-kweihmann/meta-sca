SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flat-native \
           npm-contains-path-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-eslint-import-resolver-node-native \
           npm-eslint-module-utils-native \
           npm-has-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-read-pkg-up-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.21.2.tgz"
SRC_URI[md5sum] = "e630ab1168a13cce09b42227bc27a4d7"
SRC_URI[sha256sum] = "e4ffc0942b2081173627adcef94e1f57748bf4573b2fc3681f456f4e9d9c618e"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
