SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "3af971610ae279c9f901f1605b8b9eee"
SRC_URI[sha256sum] = "b7e52a1f8dec14a75ea73e0891f3060099ca1d8e6a462a4dff11c3e119ea1b31"

inherit pypi
inherit setuptools3
inherit native
