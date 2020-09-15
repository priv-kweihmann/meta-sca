SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.3.0.tgz"
SRC_URI[md5sum] = "9ed250ccf139e3a1fc876b90e34940d0"
SRC_URI[sha256sum] = "883336c3b0094a83f646fb7246200926fe729dcd517c2b91ccb1fb46c2f1cb69"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
