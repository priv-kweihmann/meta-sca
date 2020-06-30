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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.22.0.tgz"
SRC_URI[md5sum] = "f6dd6f1364c6690d180288caad3f959c"
SRC_URI[sha256sum] = "dacac95959d61f1e494250fb6a524aadbeae94ceac8e2d3fc3bce1fb4c70ce4d"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
