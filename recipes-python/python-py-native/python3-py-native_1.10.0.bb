SUMMARY = "Library with cross-python path, ini-parsing, io, code, log facilities"
HOMEPAGE = "http://py.readthedocs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "py"

SRC_URI[md5sum] = "5f108bfe00d5468cbdb8071051f86a55"
SRC_URI[sha256sum] = "21b81bda15b66ef5e1a777a21c4dcd9c20ad3efd0b3f817e7a809035269e1bd3"

inherit pypi
inherit setuptools3
inherit native
