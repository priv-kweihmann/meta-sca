SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "\
    python3-pyparsing-native \
    python3-setuptools-scm-native \
    python3-six-native \
"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "e713c1939f294fd729af4a7be40dd141"
SRC_URI[sha256sum] = "dd47c42927d89ab911e606518907cc2d3a1f38bbd026385970643f9c5b8ecfeb"

inherit pypi
inherit setuptools3
inherit native
