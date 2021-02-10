SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=6dc0e2a13d2f25d6f123c434b761faba"

PYPI_PACKAGE = "pycryptodome"

SRC_URI[md5sum] = "0e3c2f54d3a023c5ffafde62421a2d1d"
SRC_URI[sha256sum] = "910e202a557e1131b1c1b3f17a63914d57aac55cf9fb9b51644962841c3995c4"

inherit pypi
inherit setuptools3
inherit native
