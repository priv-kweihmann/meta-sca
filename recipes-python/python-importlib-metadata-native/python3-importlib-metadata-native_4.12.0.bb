SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "cfcf29185e13439c76d09c94bc8d81f4"
SRC_URI[sha256sum] = "637245b8bab2b6502fcbc752cc4b7a6f6243bb02b31c5c26156ad103d3d45670"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-zipp"
