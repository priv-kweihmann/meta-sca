SUMMARY = "NPM: unist-util-find-all-after"
DESCRIPTION = "unist utility to find nodes after another node"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-find-all-after#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-find-all-after/-/unist-util-find-all-after-4.0.0.tgz"
SRC_URI[md5sum] = "de05283731b27cf58c077501acdbe7fc"
SRC_URI[sha256sum] = "032b2e5e66da0b14285ddd4023ae94060ca2961465d7d7220f874597432e18a4"

NPM_PKGNAME = "unist-util-find-all-after"

inherit npmhelper
inherit native
