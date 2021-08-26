SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "6d81fa902b3360c04ad2324a0de6b607"
SRC_URI[sha256sum] = "1be82867064622fe56c7046bb5280063949f56c0abcdfc3cd33875efd4fc5498"

inherit pypi
inherit setuptools3
inherit native
