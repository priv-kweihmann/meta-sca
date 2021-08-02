SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "b7ca010c487cacca0611dc99c6d27b22"
SRC_URI[sha256sum] = "0645585859e9a6689c523927a5032f2ba5919f1f7d0e84bd4533312320de1ff9"

inherit pypi
inherit setuptools3
inherit native
