SUMMARY = "wrapt"
DESCRIPTION = "Provides a transparent object proxy for Python"
HOMEPAGE = "http://wrapt.readthedocs.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfc019b57affbe1d7a32e3d34e83db4"

PYPI_PACKAGE = "wrapt"

inherit pypi

FILES_${PN} += "${datadir}/wrapt"

inherit native
