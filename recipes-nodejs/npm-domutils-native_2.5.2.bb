SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.5.2.tgz"
SRC_URI[md5sum] = "8c3d4aadab6a998dce28eddf0a9f8014"
SRC_URI[sha256sum] = "370d35c78a2d36321647c3e98fa52de0adb475b479992f85d6822365e804cacb"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
