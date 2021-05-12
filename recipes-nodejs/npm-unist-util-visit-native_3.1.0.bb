SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-3.1.0.tgz"
SRC_URI[md5sum] = "210244ff1f01ce5604f99116ff4efee1"
SRC_URI[sha256sum] = "0f0b8eee6ae970b0cb1fbd5c8d3c99f4f906c9941724e630862c837c5ced6fe2"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native
