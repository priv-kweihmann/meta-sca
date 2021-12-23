SUMMARY = "NPM: eslint-import-resolver-node"
DESCRIPTION = "Node default behavior import resolution plugin for eslint-plugin-import."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/eslint-import-resolver-node/-/eslint-import-resolver-node-0.3.6.tgz"
SRC_URI[md5sum] = "bf0a201e44f3e437813f10b97923f452"
SRC_URI[sha256sum] = "bab63db860b260d59ef3e6d370655565e912dc81088e1d9d064214c05bb5c836"

NPM_PKGNAME = "eslint-import-resolver-node"

inherit npmhelper
inherit native
