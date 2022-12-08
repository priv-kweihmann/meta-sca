SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "e11ed8c51a05c1c43c47ae4319c0e603"
SRC_URI[sha256sum] = "0e45d2d852a66ecfb904f090c3f87dc0dfb89a499570abad8590f10d9cffb350"

inherit pypi
inherit setuptools3
inherit native
