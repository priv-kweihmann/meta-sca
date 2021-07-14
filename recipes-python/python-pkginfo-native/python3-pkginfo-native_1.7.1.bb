SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "9f437b69c1f0dd8333968dce61e64e49"
SRC_URI[sha256sum] = "e7432f81d08adec7297633191bbf0bd47faf13cd8724c3a13250e51d542635bd"

inherit pypi
inherit setuptools3
inherit native
