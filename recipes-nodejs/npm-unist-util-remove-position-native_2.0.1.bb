SUMMARY = "NPM: unist-util-remove-position"
DESCRIPTION = "unist utility to remove positions from a tree"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-remove-position#readme"

DEPENDS = "npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/unist-util-remove-position/-/unist-util-remove-position-2.0.1.tgz"
SRC_URI[md5sum] = "109d3bef153aedfe22677fe4e85d29bf"
SRC_URI[sha256sum] = "dc8a3b7cccb77508450a8d29cb9c3cd691db16146c8ff169b059bb252ea8a2c8"

NPM_PKGNAME = "unist-util-remove-position"

inherit npmhelper
inherit native
