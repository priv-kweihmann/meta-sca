SUMMARY = "NPM: unist-util-stringify-position"
DESCRIPTION = "unist utility to serialize a node, position, or point as a human readable location"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-stringify-position#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-stringify-position/-/unist-util-stringify-position-3.0.2.tgz"
SRC_URI[md5sum] = "5b5d2714d57bfb03b86ae89016011738"
SRC_URI[sha256sum] = "fc6f0ee6785193a6cf788d17f3b8080be6e50f9b2694e30e8817bddc4e08e493"

NPM_PKGNAME = "unist-util-stringify-position"

inherit npmhelper
inherit native
