SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.4.1.tgz"
SRC_URI[md5sum] = "b0b7b722939f61c34e068c10bccac7de"
SRC_URI[sha256sum] = "d97b712bde524f2e4c4e32d1039e031b511801f3f8d099fe1057c3837b8b0c6c"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
