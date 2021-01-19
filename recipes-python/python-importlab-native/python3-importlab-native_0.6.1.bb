
SUMMARY = "A library to calculate python dependency graphs."
HOMEPAGE = "https://github.com/google/importlab"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-networkx-native python3-six-native"

PYPI_PACKAGE = "importlab"

SRC_URI[md5sum] = "029fa8226d400ca4ea619916665dfdfa"
SRC_URI[sha256sum] = "056503329df1ba8f6291a4b548042aa18620ad91d39388ba58044f0fd44ff83e"

inherit pypi
inherit setuptools3
inherit native
