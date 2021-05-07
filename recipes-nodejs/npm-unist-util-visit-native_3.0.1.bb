SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-3.0.1.tgz"
SRC_URI[md5sum] = "a380fb45efb9b10ecc475c0bcf72dddd"
SRC_URI[sha256sum] = "91ac5c8fad3fd33f5043df4502e0c9ae2d58577ec7267b5bfb501cfc6b0e25cb"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native
