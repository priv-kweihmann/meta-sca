SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d907de309286ace60c424a81666867d"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy_object_proxy"

SRC_URI[md5sum] = "377bc90dbba53769cb1fc652d97dc533"
SRC_URI[sha256sum] = "ce34046cb021d69c72d05ddb83821ecfd4d2d0a5d43a93c5cd01c9e34779cf14"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
