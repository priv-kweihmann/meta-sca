SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

PYPI_PACKAGE = "packaging"

DEPENDS += "${PYTHON_PN}-six-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "867ce70984dc7b89bbbc3cac2a72b171"
SRC_URI[sha256sum] = "28b924174df7a2fa32c1953825ff29c61e2f5e082343165438812f00d3a7fc47"
