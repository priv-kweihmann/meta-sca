SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
HOMEPAGE = "https://gitlab.com/pycqa/flake8-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a34bc20b983e1104e2d50423b224b087"

PYPI_PACKAGE = "flake8-docstrings"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-pydocstyle-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "f77262658691809f6dbcd6ba9deb6a35"
SRC_URI[sha256sum] = "d8d72ccd5807c1ab9ff1466cb9bece0c4d94b8669e9bc4f472abc80dbc5d399e"
