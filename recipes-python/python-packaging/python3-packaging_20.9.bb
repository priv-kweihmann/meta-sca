SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "python3-setuptools-scm-native"
DEPENDS_class-native += "\
    python3-pyparsing \
    python3-six-native \
"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "5377308b3ba89f2d78c05e7f485be65d"
SRC_URI[sha256sum] = "5b327ac1320dc863dca72f4514ecc086f31186744b84a230374cc1fd776feae5"

inherit pypi
inherit setuptools3
inherit sca-nosca

RDEPENDS_${PN}_class-target += "\
    python3-pyparsing \
    python3-six \
"

BBCLASSEXTEND = "native"
