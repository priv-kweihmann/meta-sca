SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.5.1.tgz"
SRC_URI[md5sum] = "63e8ab19ae432d2ca6d120e4d16511c5"
SRC_URI[sha256sum] = "6b27f50b13623f833a5943cda2bf3506cb65a82e96d5b23cf575422a1f75a5a2"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
