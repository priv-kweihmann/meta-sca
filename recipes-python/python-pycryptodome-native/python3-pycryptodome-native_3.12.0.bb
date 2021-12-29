SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "249e6a00bdc54c84cbd6c55cb8d78dd6"
SRC_URI[sha256sum] = "12c7343aec5a3b3df5c47265281b12b611f26ec9367b6129199d67da54b768c1"

inherit pypi
inherit setuptools3
inherit native
