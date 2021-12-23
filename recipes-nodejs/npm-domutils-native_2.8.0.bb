SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.8.0.tgz"
SRC_URI[md5sum] = "3abb16692001d8800d95081e1ee0ec2d"
SRC_URI[sha256sum] = "8c08fcc47d4accca940de3b2498b512c0ea93a5188b6c8f989b72a1d23b5644e"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
