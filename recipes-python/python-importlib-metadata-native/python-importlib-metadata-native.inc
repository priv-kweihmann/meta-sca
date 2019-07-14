SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

PYPI_PACKAGE = "importlib_metadata"

DEPENDS += "${PYTHON_PN}-zipp-native"

inherit pypi
inherit native
