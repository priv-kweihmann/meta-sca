
SUMMARY = "A library to calculate python dependency graphs."
HOMEPAGE = "https://github.com/google/importlab"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-networkx-native python3-six-native"

PYPI_PACKAGE = "importlab"

SRC_URI[md5sum] = "80aff9cbdf96cce5fd4be621ae1f2d56"
SRC_URI[sha256sum] = "d855350d19dc10a17aabd2fe6f4b428ff1a936071f692fbf686a73694d26a51c"

inherit pypi
inherit setuptools3
inherit native
