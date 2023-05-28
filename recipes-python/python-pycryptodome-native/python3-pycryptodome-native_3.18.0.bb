SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "500651c3e5f6bc456f2a0c366318f21b"
SRC_URI[sha256sum] = "c9adee653fc882d98956e33ca2c1fb582e23a8af7ac82fee75bd6113c55a0413"

inherit pypi
inherit setuptools3
inherit native
