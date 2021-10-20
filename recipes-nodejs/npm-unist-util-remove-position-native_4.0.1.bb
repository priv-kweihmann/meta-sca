SUMMARY = "NPM: unist-util-remove-position"
DESCRIPTION = "unist utility to remove positions from a tree"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-remove-position#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/unist-util-remove-position/-/unist-util-remove-position-4.0.1.tgz"
SRC_URI[md5sum] = "f7f22bf3cf2efef0a2ef192c973b78cb"
SRC_URI[sha256sum] = "8feca98000600a21e61e72ff265450b6b6e3a4b5ed51460c510f28044e85b5ce"

NPM_PKGNAME = "unist-util-remove-position"

inherit npmhelper
inherit native
