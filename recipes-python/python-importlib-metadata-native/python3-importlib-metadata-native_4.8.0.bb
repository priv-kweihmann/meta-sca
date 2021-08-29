SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "0c4d8d59e17b4c62a3c109b533f1835d"
SRC_URI[sha256sum] = "c23af2799037d2928713861886ec5a95aaa4421ec62e63b8eac63eba0779bf73"

inherit pypi
inherit setuptools3
inherit native
