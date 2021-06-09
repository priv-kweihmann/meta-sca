SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.7.0.tgz"
SRC_URI[md5sum] = "df9daf2d38e4c9164b2c0cbb4c97ad76"
SRC_URI[sha256sum] = "9b2ab232b36d188654fe0d114cb436c56f8772d86953dc141766ac9a90e855f9"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
