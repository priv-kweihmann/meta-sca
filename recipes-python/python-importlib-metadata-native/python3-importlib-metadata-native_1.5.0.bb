SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

DEPENDS += "${PYTHON_PN}-zipp-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "1ec9bfc71c20e8618eac4a267aee2ad1"
SRC_URI[sha256sum] = "06f5b3a99029c7134207dd882428a66992a9de2bef7c2b699b5641f9886c3302"
