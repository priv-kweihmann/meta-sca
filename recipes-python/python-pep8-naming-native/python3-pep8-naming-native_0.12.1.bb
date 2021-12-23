SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "ae51f4c3791c189961970f0a2d7b13ab"
SRC_URI[sha256sum] = "bb2455947757d162aa4cad55dba4ce029005cd1692f2899a21d51d8630ca7841"

inherit pypi
inherit setuptools3
inherit native
