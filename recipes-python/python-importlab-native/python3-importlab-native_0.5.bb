
SUMMARY = "A library to calculate python dependency graphs."
DESCRIPTION = "A library to calculate python dependency graphs."
HOMEPAGE = "https://github.com/google/importlab"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PYPI_PACKAGE = "importlab"

DEPENDS += "${PYTHON_PN}-networkx-native ${PYTHON_PN}-six-native"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "7728c60a215d8446e7884b0f6b99579a"
SRC_URI[sha256sum] = "ab3a0bf77a326de577e3c7f643ec304f83fed93cb1056638560d832413d6e736"

