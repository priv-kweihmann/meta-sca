SUMMARY = "Naming Convention checker for Python"

HOMEPAGE = "https://github.com/PyCQA/pep8-naming"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

PYPI_PACKAGE = "pep8-naming"

DEPENDS += "${PYTHON_PN}-flake8-polyfill-native"

inherit pypi
inherit native
