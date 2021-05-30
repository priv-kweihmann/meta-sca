SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import"

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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.23.4.tgz"
SRC_URI[md5sum] = "8716f45e3718ff801df38a2a43caaf82"
SRC_URI[sha256sum] = "fbb96844635813f997b70da03f84b90a24503c5e44936a3778976c35cda27b0d"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
