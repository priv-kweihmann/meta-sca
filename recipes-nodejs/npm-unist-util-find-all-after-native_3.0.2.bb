SUMMARY = "NPM: unist-util-find-all-after"
DESCRIPTION = "unist utility to find nodes after another node"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-find-all-after#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-find-all-after/-/unist-util-find-all-after-3.0.2.tgz"
SRC_URI[md5sum] = "66cf37e20f99fd2b40010740fb297df4"
SRC_URI[sha256sum] = "8aa9b26b536c088dc8e0fa66d9fbf74b4745b419ea9b29e1ed35a10dbba48507"

NPM_PKGNAME = "unist-util-find-all-after"

inherit npmhelper
inherit native
