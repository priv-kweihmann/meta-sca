SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "Python binding to the Networking and Cryptography (NaCl) library"
HOMEPAGE = "https://github.com/pyca/pynacl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8cc789b082b3d97e1ccc5261f8594d3f"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

DEPENDS += "${PYTHON_PN}-cffi-native"

PYPI_PACKAGE = "PyNaCl"

inherit pypi

inherit native
