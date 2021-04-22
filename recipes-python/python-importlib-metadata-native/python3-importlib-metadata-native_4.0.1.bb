SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "de8753734db41db35d763475b3cf56be"
SRC_URI[sha256sum] = "8c501196e49fb9df5df43833bdb1e4328f64847763ec8a50703148b73784d581"

inherit pypi
inherit setuptools3
inherit native
