SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "1cf8f9d96de0940f9e56d1e395292a42"
SRC_URI[sha256sum] = "2c9607871d58c76354b697b42f5d57e1ada7d261c261efac224b664affdc5785"

inherit pypi
inherit setuptools3
inherit nativesdk
