SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

PYPI_PACKAGE = "importlib_metadata"

DEPENDS += "${PYTHON_PN}-zipp-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "7e097faecf425c79bafef3ec271d57e5"
SRC_URI[sha256sum] = "cb6ee23b46173539939964df59d3d72c3e0c1b5d54b84f1d8a7e912fe43612db"
