SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.4.2.tgz"
SRC_URI[md5sum] = "b1059456631899fd1564ef9288e7f61d"
SRC_URI[sha256sum] = "a720a174ee726dec91d84d37febe4df6d000d7fd30bee8b40be595213f8879ad"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
