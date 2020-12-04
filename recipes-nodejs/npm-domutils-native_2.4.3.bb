SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.4.3.tgz"
SRC_URI[md5sum] = "b99f14614c528e28d02573d031ff7778"
SRC_URI[sha256sum] = "64e28182f19f0c0bf461e8dfc9945367b8c3cdfcb2d95c0df40670947f8f3ba7"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
