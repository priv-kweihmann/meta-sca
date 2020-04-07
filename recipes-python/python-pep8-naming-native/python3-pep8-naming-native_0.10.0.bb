SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "${PYTHON_PN}-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "e6b280cb698c2f0d7660329201fc7120"
SRC_URI[sha256sum] = "f3b4a5f9dd72b991bf7d8e2a341d2e1aa3a884a769b5aaac4f56825c1763bf3a"

inherit pypi
inherit native
inherit setuptools3
