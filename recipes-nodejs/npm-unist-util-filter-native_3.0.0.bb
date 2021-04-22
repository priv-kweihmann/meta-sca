SUMMARY = "NPM: unist-util-filter"
DESCRIPTION = "unist utility to create a new tree with nodes that pass a filter"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-filter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a320e5b1aa9084c9b52db096dc5eee7f"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-filter/-/unist-util-filter-3.0.0.tgz"
SRC_URI[md5sum] = "2e699ab9a2e82d86b482fa8d144fb14a"
SRC_URI[sha256sum] = "152fcbe2845ceae7d462b10de62b2f55de220a9dee3d9a68a04c68d12852e3c6"

NPM_PKGNAME = "unist-util-filter"

inherit npmhelper
inherit native
