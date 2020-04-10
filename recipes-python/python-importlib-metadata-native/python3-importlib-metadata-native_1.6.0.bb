SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "${PYTHON_PN}-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "fd86e462c5786aac615ad50b45dd98f3"
SRC_URI[sha256sum] = "34513a8a0c4962bc66d35b359558fd8a5e10cd472d37aec5f66858addef32c1e"

inherit pypi
inherit native
inherit setuptools3
