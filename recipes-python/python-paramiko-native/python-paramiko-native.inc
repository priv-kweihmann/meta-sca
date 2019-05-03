SUMMARY = "The leading native Python SSHv2 protocol library"
DESCRIPTION = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "paramiko"

inherit pypi

inherit native
