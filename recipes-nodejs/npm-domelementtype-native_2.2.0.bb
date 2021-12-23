SUMMARY = "NPM: domelementtype"
DESCRIPTION = "all the types of nodes in htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domelementtype#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/domelementtype/-/domelementtype-2.2.0.tgz"
SRC_URI[md5sum] = "0b0cfc0a6c516861178eba23f8339cef"
SRC_URI[sha256sum] = "59960e0333618136074571647f0dd918adedc99346c72d8c04ef86d558317a5b"

NPM_PKGNAME = "domelementtype"

inherit npmhelper
inherit native
