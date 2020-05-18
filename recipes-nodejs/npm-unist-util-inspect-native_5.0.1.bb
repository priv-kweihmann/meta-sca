SUMMARY = "NPM: unist-util-inspect"
DESCRIPTION = "unist utility to inspect nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-inspect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6bbaa59ebe7f7015186221d4c07c0e65"

DEPENDS = "npm-is-empty-native"

SRC_URI = "https://registry.npmjs.org/unist-util-inspect/-/unist-util-inspect-5.0.1.tgz"
SRC_URI[md5sum] = "f8425228acff09dfc512b9bf3e53f3a7"
SRC_URI[sha256sum] = "6c70d95cf4c03ccee1f24cc13e4b093af91d45668ba6241bbd81a2f3ab8604d3"

NPM_PKGNAME = "unist-util-inspect"

inherit npmhelper
inherit native
