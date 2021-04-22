SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-3.0.0.tgz"
SRC_URI[md5sum] = "fa0698df6bf380c9ecb47ca4ba33b7f3"
SRC_URI[sha256sum] = "4dde806f2bce8fae83e195dcc5c244d09cfda7a67d56a5efade31a4def135ec3"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native
