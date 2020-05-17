SUMMARY = "NPM: unist-util-find-all-after"
DESCRIPTION = "unist utility to find nodes after another node"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-find-all-after#readme"

DEPENDS = "npm-unist-util-is-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/unist-util-find-all-after/-/unist-util-find-all-after-3.0.1.tgz"
SRC_URI[md5sum] = "c4ab68ff64a00b607edfbe7c035e0082"
SRC_URI[sha256sum] = "02250ab268efb35a7678c79673bae273e54b84a0d9a1038028656f4b1d8909f2"

NPM_PKGNAME = "unist-util-find-all-after"

inherit npmhelper
inherit native
