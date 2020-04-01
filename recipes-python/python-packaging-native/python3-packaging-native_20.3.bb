SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "${PYTHON_PN}-six-native"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "19e0d1f82a9007b448650ccfeffd0a26"
SRC_URI[sha256sum] = "3c292b474fda1671ec57d46d739d072bfd495a4f51ad01a055121d81e952b7a3"

inherit pypi
inherit native
inherit setuptools3
