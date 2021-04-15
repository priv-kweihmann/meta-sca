SUMMARY = "NPM: unist-util-modify-children"
DESCRIPTION = "unist utility to modify direct children of a parent"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-modify-children#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-array-iterate-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-modify-children/-/unist-util-modify-children-3.0.0.tgz"
SRC_URI[md5sum] = "a88cebee3fcc53250e819e689c705619"
SRC_URI[sha256sum] = "10cd43da768f3f8643012f44252aba47f74b46ec27180893bb219be76265fc0c"

NPM_PKGNAME = "unist-util-modify-children"

inherit npmhelper
inherit native
