SUMMARY = "NPM: unist-util-filter"
DESCRIPTION = "Create a new Unist tree with all nodes that pass the test implemented by the provided function"
HOMEPAGE = "https://github.com/eush77/unist-util-filter"

DEPENDS = "npm-flatmap-native npm-unist-util-is-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a320e5b1aa9084c9b52db096dc5eee7f"

SRC_URI = "https://registry.npmjs.org/unist-util-filter/-/unist-util-filter-0.2.1.tgz"
SRC_URI[md5sum] = "e6fc255c215945947d3a5692be12d0ae"
SRC_URI[sha256sum] = "46427d50bcb26125496b2e68a2f77ec76faaf601facc51f46b7d50148229dccf"

NPM_PKGNAME = "unist-util-filter"

inherit npmhelper
inherit native
