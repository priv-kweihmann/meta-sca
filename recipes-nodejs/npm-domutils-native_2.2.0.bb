SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.2.0.tgz"
SRC_URI[md5sum] = "cf2de05181444f26ad3ad7db99dd36e4"
SRC_URI[sha256sum] = "ad914fa48877daebe534b4fec00b4ea70fc5346513dadb658587a32d1abbf473"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
