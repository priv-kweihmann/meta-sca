SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "ASN.1 types and codecs"
HOMEPAGE = "https://github.com/etingof/pyasn1"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a14482d15c2249de3b6f0e8a47e021fd"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pyasn1"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "f3c0cfbf882a20811be5ad5a41f74b82"
SRC_URI[sha256sum] = "da2420fe13a9452d8ae97a0e478adde1dee153b11ba832a95b223a2ba01c10f7"
