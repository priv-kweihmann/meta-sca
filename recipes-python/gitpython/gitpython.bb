SUMMARY = "GitPython is a python library used to interact with Git repositories."
DESCRIPTION = "GitPython is a python library used to interact with Git repositories."
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

PV = "2.1.11"

SRC_URI[md5sum] = "cee43a39a1468084d49d1c49fb675204"
SRC_URI[sha256sum] = "8237dc5bfd6f1366abeee5624111b9d6879393d84745a507de0fda86043b65a8"

DEPENDS += "python3-native"
RDEPENDS_${PN} += "ddt gitdb"

PYPI_PACKAGE = "GitPython"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/GitPython"

BBCLASSEXTEND = "native nativesdk"