SUMMARY = "six"
DESCRIPTION = "Python 2 and 3 compatibility library"
HOMEPAGE = "https://github.com/benjaminp/six"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83e0f622bd5ac7d575dbd83d094d69b5"

PV = "1.12.0"

SRC_URI[md5sum] = "9ae5d1feed8c0215f4ae4adcd9207fcb"
SRC_URI[sha256sum] = "d16a0141ec1a18405cd4ce8b4613101da75da0e9a7aec5bdd4fa804d0e0eba73"

PYPI_PACKAGE = "six"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/six"

inherit native
