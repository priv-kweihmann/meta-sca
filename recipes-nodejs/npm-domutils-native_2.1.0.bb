SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.1.0.tgz"
SRC_URI[md5sum] = "8f63d7aef68c4b795415a69e9e6d369e"
SRC_URI[sha256sum] = "c9ff03338e0b5463f1cbe7559a28618298ca5b812354e108fd8e3c64449e6892"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
