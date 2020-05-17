SUMMARY = "NPM: unist-util-modify-children"
DESCRIPTION = "utility to modify direct children of a parent"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-modify-children#readme"

DEPENDS = "npm-array-iterate-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/unist-util-modify-children/-/unist-util-modify-children-1.1.6.tgz"
SRC_URI[md5sum] = "39eaa35a294e026b043469c470c56cb2"
SRC_URI[sha256sum] = "bb25e61d7beaf43d213a8d88aba6c75f434d071b0698a2da5146e0b76d704e93"

NPM_PKGNAME = "unist-util-modify-children"

inherit npmhelper
inherit native
