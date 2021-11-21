SUMMARY = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"

DEFAULT_PREFERENCE = "-1"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

PYPI_PACKAGE = "paramiko"

SRC_URI[md5sum] = "da4ef4d991dfb7a52dd9b501d02645d7"
SRC_URI[sha256sum] = "e673b10ee0f1c80d46182d3af7751d033d9b573dd7054d2d0aa46be186c3c1d2"

inherit pypi
inherit setuptools3
inherit native
