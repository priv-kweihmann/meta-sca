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
           npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.20.2.tgz"
SRC_URI[md5sum] = "718153e8481c22657fbab250154db0fd"
SRC_URI[sha256sum] = "4a2c473c9a44180604c501ade18634fbcbdbd29f1aaf0ef7bf1ce38bb0def147"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
