SUMMARY = "NPM: unist-util-filter"
DESCRIPTION = "unist utility to create a new tree with nodes that pass a filter"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-filter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a320e5b1aa9084c9b52db096dc5eee7f"

DEPENDS = "npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-filter/-/unist-util-filter-2.0.3.tgz"
SRC_URI[md5sum] = "32c1ceee083f279be3af6a2c9ac6e7f0"
SRC_URI[sha256sum] = "c8d20db6fbfe9368b50894758ffdaebc6f849076291578ec13545edd46041b76"

NPM_PKGNAME = "unist-util-filter"

inherit npmhelper
inherit native
