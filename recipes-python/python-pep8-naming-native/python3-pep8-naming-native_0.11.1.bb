SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "ea6210edf88c72d0909cd5221f579267"
SRC_URI[sha256sum] = "a1dd47dd243adfe8a83616e27cf03164960b507530f155db94e10b36a6cd6724"

inherit pypi
inherit setuptools3
inherit native
