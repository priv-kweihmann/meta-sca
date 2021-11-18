SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "python3-setuptools-scm-native"
DEPENDS:class-native += "\
    python3-pyparsing-native \
    python3-six-native \
"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "e713c1939f294fd729af4a7be40dd141"
SRC_URI[sha256sum] = "dd47c42927d89ab911e606518907cc2d3a1f38bbd026385970643f9c5b8ecfeb"

inherit pypi
inherit setuptools3

RDEPENDS:${PN}:class-target += "\
    python3-pyparsing \
    python3-six \
"

BBCLASSEXTEND = "native"
