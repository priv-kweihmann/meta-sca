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
           npm-has-native \
           npm-is-core-module-native \
           npm-is-glob-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.25.2.tgz"
SRC_URI[md5sum] = "5d5dc45843095c8520a2720d712d31df"
SRC_URI[sha256sum] = "e99f8f184d0ae4431b617fd1079c9a7e2443f5cfc015b83a96fb0b4a0a6ecccb"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
