SUMMARY = "NPM: unist-util-remove-position"
DESCRIPTION = "unist utility to remove positions from a tree"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-remove-position#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/unist-util-remove-position/-/unist-util-remove-position-3.0.0.tgz"
SRC_URI[md5sum] = "1aa666ea8927b72a66809c79530a094b"
SRC_URI[sha256sum] = "ad60a6eded11824bd6d974f5317ea37ad5f5cc9a8fd298ce80d190cfdb5a4e6f"

NPM_PKGNAME = "unist-util-remove-position"

inherit npmhelper
inherit native
