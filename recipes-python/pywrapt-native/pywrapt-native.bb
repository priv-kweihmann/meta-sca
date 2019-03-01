SUMMARY = "wrapt"
DESCRIPTION = "Provides a transparent object proxy for Python"
HOMEPAGE = "http://wrapt.readthedocs.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfc019b57affbe1d7a32e3d34e83db4"

PV = "1.11.1"

SRC_URI[md5sum] = "9f21acd7c0a57bf3057715c4665db3c7"
SRC_URI[sha256sum] = "4aea003270831cceb8a90ff27c4031da6ead7ec1886023b80ce0dfe0adf61533"

PYPI_PACKAGE = "wrapt"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/wrapt"

inherit native
