SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "${PYTHON_PN}-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "38f795ac13abc923acfd3da06263eb8f"
SRC_URI[sha256sum] = "0505dd08068cfec00f53a74a0ad927676d7757da81b7436a6eefe4c7cf75c545"

inherit pypi
inherit native
inherit setuptools3
