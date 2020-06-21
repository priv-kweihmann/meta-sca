SUMMARY = "NPM: eslint-import-resolver-node"
DESCRIPTION = "Node default behavior import resolution plugin for eslint-plugin-import."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/eslint-import-resolver-node/-/eslint-import-resolver-node-0.3.4.tgz"
SRC_URI[md5sum] = "3dabef5db4176c1c162de774e720aa4d"
SRC_URI[sha256sum] = "f88f3b6d0b03bd7863463e59e113d8938e97f3df746d5e1e847cfeb0c3ac973d"

NPM_PKGNAME = "eslint-import-resolver-node"

inherit npmhelper
inherit native
