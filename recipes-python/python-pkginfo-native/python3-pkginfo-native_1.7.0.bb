SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "d05db0ca821692f4da590ba5c5c8ef2d"
SRC_URI[sha256sum] = "029a70cb45c6171c329dfc890cde0879f8c52d6f3922794796e06f577bb03db4"

inherit pypi
inherit native
inherit setuptools3
