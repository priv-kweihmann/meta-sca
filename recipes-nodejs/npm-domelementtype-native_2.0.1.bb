SUMMARY = "NPM: domelementtype"
DESCRIPTION = "all the types of nodes in htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domelementtype#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

SRC_URI = "https://registry.npmjs.org/domelementtype/-/domelementtype-2.0.1.tgz"
SRC_URI[md5sum] = "e19a21d0536b4dc8db2db27cbdc32208"
SRC_URI[sha256sum] = "188467bd84271e64a3f6c5648cf300ae79ca60488cd484e151bb53778130612f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "domelementtype"

inherit npmhelper
inherit native
