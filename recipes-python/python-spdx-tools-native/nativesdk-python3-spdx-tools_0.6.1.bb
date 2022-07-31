SUMMARY = "SPDX parser and tools"
HOMEPAGE = "https://github.com/spdx/tools-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc7f21ccff0f672f2a7cd6f412ae627d"

DEPENDS += "\
    nativesdk-python3-click \
    nativesdk-python3-ply \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rdflib \
    nativesdk-python3-six \
    nativesdk-python3-xmltodict \
"

PYPI_PACKAGE = "spdx-tools"

SRC_URI[md5sum] = "b2cf5b6ae46f0a1c5ac60ffc88097d3a"
SRC_URI[sha256sum] = "9a1aaae051771e865705dd2fd374c3f73d0ad595c1056548466997551cbd7a81"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-click \
    nativesdk-python3-ply \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rdflib \
    nativesdk-python3-six \
    nativesdk-python3-xmltodict \
"
