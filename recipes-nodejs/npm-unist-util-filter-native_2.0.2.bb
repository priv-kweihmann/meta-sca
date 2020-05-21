SUMMARY = "NPM: unist-util-filter"
DESCRIPTION = "unist utility to create a new tree with nodes that pass a filter"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-filter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a320e5b1aa9084c9b52db096dc5eee7f"

DEPENDS = "npm-flatmap-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-filter/-/unist-util-filter-2.0.2.tgz"
SRC_URI[md5sum] = "8ffc60cde162b2d92c0c90a99d8f1b5c"
SRC_URI[sha256sum] = "ade7d131df8a416ee71dbb4f7a81278049761758d1cda63b5b46b70c113263d3"

NPM_PKGNAME = "unist-util-filter"

inherit npmhelper
inherit native
