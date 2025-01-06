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

SRC_URI[sha256sum] = "71522656f0abace1d072b9e5481a48f07c138e00f079c38c8f883823f9c26bd7"

S = "${UNPACKDIR}/importlib_metadata-${PV}"

RDEPENDS:${PN} += "python3-zipp-native"
