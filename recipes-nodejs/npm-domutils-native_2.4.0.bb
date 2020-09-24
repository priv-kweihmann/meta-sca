SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.4.0.tgz"
SRC_URI[md5sum] = "f64a2cfb9a4f7c9c7309121e4ba54c62"
SRC_URI[sha256sum] = "6e2f571fbd0cc5652d19b592cc85a5954149d63673307d0f3209a6b4f1439bf7"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
