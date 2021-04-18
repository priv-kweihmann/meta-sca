SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.6.0.tgz"
SRC_URI[md5sum] = "572ba5819babf4c2893b37e423a9d9bb"
SRC_URI[sha256sum] = "c10eae0bc8752a87e0fb5158f31df71ce69dd4622492bd5ece38446c7b1e184c"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
