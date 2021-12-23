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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.25.3.tgz"
SRC_URI[md5sum] = "58170195326bbe374d2932489eb8d83b"
SRC_URI[sha256sum] = "b0194e71753fdd55796836b3532e252fd1f7999c6fb7a441160e0e83ffa0e4c6"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
