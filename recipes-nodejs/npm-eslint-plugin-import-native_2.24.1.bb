SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flat-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-eslint-import-resolver-node-native \
           npm-eslint-module-utils-native \
           npm-find-up-native \
           npm-has-native \
           npm-is-core-module-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-pkg-up-native \
           npm-read-pkg-up-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.24.1.tgz"
SRC_URI[md5sum] = "720742ff753bb2ed1d3e61a48a338235"
SRC_URI[sha256sum] = "6761530cfb5c2dbf3eeca9c41823d3d3b78daafa2f648a8e236632f25596067a"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
