SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

PYPI_PACKAGE = "pep8-naming"

DEPENDS += "${PYTHON_PN}-flake8-polyfill-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "1e2f55a2eebcb4bb6a04fe58a51708cd"
SRC_URI[sha256sum] = "01cb1dab2f3ce9045133d08449f1b6b93531dceacb9ef04f67087c11c723cea9"
