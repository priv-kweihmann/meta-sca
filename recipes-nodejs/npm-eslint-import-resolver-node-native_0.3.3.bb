SUMMARY = "NPM: eslint-import-resolver-node"
DESCRIPTION = "Node default behavior import resolution plugin for eslint-plugin-import."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import"

DEPENDS = "npm-debug-native npm-resolve-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

SRC_URI = "https://registry.npmjs.org/eslint-import-resolver-node/-/eslint-import-resolver-node-0.3.3.tgz"
SRC_URI[md5sum] = "73d4fca8fc496641b62f7f76deaba601"
SRC_URI[sha256sum] = "0895972c9169e5647d7df873278652f975bf6eaa55329f4166023d1aeacd032b"

NPM_PKGNAME = "eslint-import-resolver-node"

inherit npmhelper
inherit native
