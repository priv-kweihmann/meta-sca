SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "22e3c5ca94b4ea55fb13db37123a87d6"
SRC_URI[sha256sum] = "95bacf9ff7d1b90bba537d3f5f6c834efe6bfbb1a0195cb3573f29e6716ef08d"

inherit pypi
inherit setuptools3
inherit native
