SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "${PYTHON_PN}-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "a87bddde53f805b87e2c9af54c4e057d"
SRC_URI[sha256sum] = "a33d38177056321a167decd6ba70b890856ba5025f0a8eca6a3eda607da93caf"

inherit pypi
inherit native
inherit setuptools3
