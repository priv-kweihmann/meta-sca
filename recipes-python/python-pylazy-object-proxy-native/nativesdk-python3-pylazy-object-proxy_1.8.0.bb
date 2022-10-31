SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7d2e9d24c2b5bad57ca894da972e22e"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy-object-proxy"

SRC_URI[md5sum] = "05edbb9fb04cef94e186e525aa2fd897"
SRC_URI[sha256sum] = "c219a00245af0f6fa4e95901ed28044544f50152840c5b6a3e7b2568db34d156"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
