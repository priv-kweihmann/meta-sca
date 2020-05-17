SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import"

DEPENDS = "npm-array-includes-native npm-contains-path-native npm-debug-native npm-doctrine-native npm-eslint-import-resolver-node-native npm-eslint-module-utils-native npm-has-native npm-minimatch-native npm-object.values-native npm-read-pkg-up-native npm-resolve-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.18.2.tgz"
SRC_URI[md5sum] = "f3eb38e2290cd1c39bf3ba0a79ea097b"
SRC_URI[sha256sum] = "b0f02b672855f6118bcc13171b990444d9bb078e036e9f7cd34be6af0ccabb73"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
