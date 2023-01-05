SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d606e94f56c21c8e0cdde0b622dcdf57"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy-object-proxy"

SRC_URI[md5sum] = "1d135abc8b5963bc2829528ee9ab0f2b"
SRC_URI[sha256sum] = "659fb5809fa4629b8a1ac5106f669cfc7bef26fbb389dda53b3e010d1ac4ebae"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
