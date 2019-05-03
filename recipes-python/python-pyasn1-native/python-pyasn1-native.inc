SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "ASN.1 types and codecs"
HOMEPAGE = "https://github.com/etingof/pyasn1"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a14482d15c2249de3b6f0e8a47e021fd"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pyasn1"

inherit pypi

inherit native
