SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-5.0.0.tgz"
SRC_URI[md5sum] = "7b6673cd4d3bcd4e2eb69954214052a0"
SRC_URI[sha256sum] = "b9fdbf0af1011d59c140fb11f09b39ff678c13cc861c6800c206899c9adfbcae"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native
