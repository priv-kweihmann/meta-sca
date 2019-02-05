SUMMARY = "lazy-object-proxy"
DESCRIPTION = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec680df42d8ad56427a83308817658cc"

PV = "1.3.1"

SRC_URI[md5sum] = "e128152b76eb5b9ba759504936139fd0"
SRC_URI[sha256sum] = "eb91be369f945f10d3a49f5f9be8b3d0b93a4c2be8f8a5b83b0571b8123e0a7a"

RDEPENDS_${PN} += "python3-native"
PYPI_PACKAGE = "lazy-object-proxy"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/lazy-object-proxy"

BBCLASSEXTEND = "native nativesdk"
