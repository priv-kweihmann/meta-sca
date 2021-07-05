SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "fdcaf30ec824b518c9ec83f7684e82b5"
SRC_URI[sha256sum] = "079ada16b7fc30dfbb5d13399a5113110dab1aa7c2bc62f66af75f0b717c8cac"

inherit pypi
inherit setuptools3
inherit native
