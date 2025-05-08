SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://pypi.org/project/importlib-metadata/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-setuptools-scm-native"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "importlib_metadata"

SRC_URI[sha256sum] = "d13b81ad223b890aa16c5471f2ac3056cf76c5f10f82d6f9292f0b415f389000"

S = "${UNPACKDIR}/importlib_metadata-${PV}"

RDEPENDS:${PN} += "python3-zipp-native"
