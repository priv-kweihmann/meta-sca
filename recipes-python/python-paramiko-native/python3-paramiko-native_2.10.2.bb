SUMMARY = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

PYPI_PACKAGE = "paramiko"

SRC_URI[md5sum] = "b660eb1e607832a01b7ef4008a2abeeb"
SRC_URI[sha256sum] = "ff47cc35dd4c4af507d2bdc9d7def9f7fa89977212b4f926e14ac486e930f03a"

inherit pypi
inherit setuptools3
inherit native
