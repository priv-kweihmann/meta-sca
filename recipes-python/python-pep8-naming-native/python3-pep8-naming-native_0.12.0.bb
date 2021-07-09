SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "008633a46c4b16ae7492656cc5299cfc"
SRC_URI[sha256sum] = "1f9a3ecb2f3fd83240fd40afdd70acc89695c49c333413e49788f93b61827e12"

inherit pypi
inherit setuptools3
inherit native
