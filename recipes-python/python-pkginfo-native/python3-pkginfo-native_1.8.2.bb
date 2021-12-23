SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "3845080e56c0a0fc877adc50cf4465dc"
SRC_URI[sha256sum] = "542e0d0b6750e2e21c20179803e40ab50598d8066d51097a0e382cba9eb02bff"

inherit pypi
inherit setuptools3
inherit native
