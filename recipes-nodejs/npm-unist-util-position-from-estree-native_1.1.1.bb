SUMMARY = "NPM: unist-util-position-from-estree"
DESCRIPTION = "unist utility to get a position from an estree node"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-position-from-estree#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-position-from-estree/-/unist-util-position-from-estree-1.1.1.tgz"
SRC_URI[md5sum] = "700b56392da6aaae06b2958c05d8f72b"
SRC_URI[sha256sum] = "fccbb80f66c50250a40b6c1cf1ad822ce01b2f736fba8da63b821245e241789c"

NPM_PKGNAME = "unist-util-position-from-estree"

inherit npmhelper
inherit native
