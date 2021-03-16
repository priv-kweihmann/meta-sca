SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "b6d333b5ef185b73b54ec0e9292d7d9e"
SRC_URI[sha256sum] = "c389c1d06bf7904078ca03399a4816f974a1d590090fecea0c63ec26ebaf1cef"

inherit pypi
inherit setuptools3
inherit native
