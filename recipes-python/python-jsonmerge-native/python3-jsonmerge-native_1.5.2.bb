SUMMARY = "Merge a series of JSON documents."
DESCRIPTION = "Merge a series of JSON documents."
HOMEPAGE = "https://github.com/eliben/pyelftools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad5eedb545d358ca87e878d399293f1"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "jsonmerge"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "adf870b2464d40e1db280946236a9083"
SRC_URI[sha256sum] = "c05229545d55c1bbfdb3fa11c7f8a1c9868c713af209059ac48e7d86fa9c6a1f"
