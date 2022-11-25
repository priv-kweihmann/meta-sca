SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "nativesdk-python3-zipp"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "56d34f2e854bb0f318baa9e47aba3439"
SRC_URI[sha256sum] = "d5059f9f1e8e41f80e9c56c2ee58811450c31984dfa625329ffd7c0dad88a73b"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-zipp"
