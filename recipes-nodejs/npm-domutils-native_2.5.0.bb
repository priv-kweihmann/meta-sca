SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.5.0.tgz"
SRC_URI[md5sum] = "9e6786998cbe51399aa40b1d74e8942b"
SRC_URI[sha256sum] = "8f93b84abcfa35793c879b1bec004010195279dd2333ad8f1212f20c30cee887"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
