SUMMARY = "wrapt"
DESCRIPTION = "Provides a transparent object proxy for Python"
HOMEPAGE = "http://wrapt.readthedocs.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56540ad83482f9346ef40591d7c74d39"

PV = "1.10.0"

SRC_URI[md5sum] = "b8f0f803ed74689666e2bf0d083f3800"
SRC_URI[sha256sum] = "ec7cf2f32bbf91c9f910fe26a93a87c3cf35d08b36a5f1d4d5860f58067bbfc7"

RDEPENDS_${PN} += "python3-native"
PYPI_PACKAGE = "wrapt"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/wrapt"

BBCLASSEXTEND = "native nativesdk"
