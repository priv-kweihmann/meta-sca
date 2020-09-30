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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.22.1.tgz"
SRC_URI[md5sum] = "44d0ba6478fa94a5d112ca76461707bd"
SRC_URI[sha256sum] = "c9dffc12c3af44223ce4b9cfc0ccda02326e74e1c9beedbabe99dabe40b7b4d2"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
