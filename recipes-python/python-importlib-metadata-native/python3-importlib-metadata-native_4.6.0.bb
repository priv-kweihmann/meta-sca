SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "4264d30c3f8a251dfd3ee2a47bad6dd8"
SRC_URI[sha256sum] = "4a5611fea3768d3d967c447ab4e93f567d95db92225b43b7b238dbfb855d70bb"

inherit pypi
inherit setuptools3
inherit native
