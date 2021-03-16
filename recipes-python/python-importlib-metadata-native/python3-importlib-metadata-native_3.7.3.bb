SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "0a3328f6783be2c9086835a4762fb2c8"
SRC_URI[sha256sum] = "742add720a20d0467df2f444ae41704000f50e1234f46174b51f9c6031a1bd71"

inherit pypi
inherit setuptools3
inherit native
