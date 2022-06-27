SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "5d81ee8d6f1a8aa52e5ad218386775d6"
SRC_URI[sha256sum] = "9135dddad504592bcc18b0d2d95ce86c3a5ea87ec6447ef25cfedea12d6018b8"

inherit pypi
inherit setuptools3
inherit native
