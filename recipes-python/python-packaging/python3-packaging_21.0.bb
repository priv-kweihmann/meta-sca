SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "python3-setuptools-scm-native"
DEPENDS_class-native += "\
    python3-pyparsing-native \
    python3-six-native \
"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "240ba5823ed31051a1254e74c9d18d55"
SRC_URI[sha256sum] = "7dc96269f53a4ccec5c0670940a4281106dd0bb343f47b7471f779df49c2fbe7"

inherit pypi
inherit setuptools3

RDEPENDS_${PN}_class-target += "\
    python3-pyparsing \
    python3-six \
"

BBCLASSEXTEND = "native"
