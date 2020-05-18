SUMMARY = "NPM: unist-util-modify-children"
DESCRIPTION = "unist utility to modify direct children of a parent"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-modify-children#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-array-iterate-native"

SRC_URI = "https://registry.npmjs.org/unist-util-modify-children/-/unist-util-modify-children-2.0.0.tgz"
SRC_URI[md5sum] = "eee04818d2a367198cd2a2bb68326b92"
SRC_URI[sha256sum] = "baaa58044596740c47e604d63ded99fdf8bac7628149b7e6980dae82154e7004"

NPM_PKGNAME = "unist-util-modify-children"

inherit npmhelper
inherit native
