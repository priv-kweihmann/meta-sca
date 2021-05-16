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
           npm-find-up-native \
           npm-has-native \
           npm-is-core-module-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-pkg-up-native \
           npm-read-pkg-up-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.23.2.tgz"
SRC_URI[md5sum] = "4b3457c45cbbfee117eda8f5bdaf0073"
SRC_URI[sha256sum] = "99728a06ccfe56db0aa8420748a4775103becf43ed403878e05c8ab47851796b"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
