SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "${PYTHON_PN}-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5b6eee40b81fef9ae01a667b28950e01"
SRC_URI[sha256sum] = "d582eb5c35b2f16c78e365e0f89e369f36af38fdaad0146208aa973c693ba247"

inherit pypi
inherit native
inherit setuptools3
