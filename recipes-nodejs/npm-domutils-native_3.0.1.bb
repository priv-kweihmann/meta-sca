SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-3.0.1.tgz"
SRC_URI[md5sum] = "6cfe13ea9e8d7b6a027bebdbe872d01b"
SRC_URI[sha256sum] = "1129d0c7da6e11109f3fbe8d92afc94b8dfa4cc9ef09641c80aa68bff4bdb31b"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
