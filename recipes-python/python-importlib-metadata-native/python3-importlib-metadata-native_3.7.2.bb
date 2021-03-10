SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "0ae7791c06dae8d0d4393fece2896cd2"
SRC_URI[sha256sum] = "18d5ff601069f98d5d605b6a4b50c18a34811d655c55548adc833e687289acde"

inherit pypi
inherit setuptools3
inherit native
