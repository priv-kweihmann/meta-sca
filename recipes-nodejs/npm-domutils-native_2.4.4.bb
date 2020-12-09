SUMMARY = "NPM: domutils"
DESCRIPTION = "Utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domutils#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-dom-serializer-native \
           npm-domelementtype-native \
           npm-domhandler-native"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-2.4.4.tgz"
SRC_URI[md5sum] = "9423295517f0cb05a2be5b9081aa0bff"
SRC_URI[sha256sum] = "71348117f0f8c8bc96f089abab230c98ccc7e862dd46139b09752e5e22f052cd"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
