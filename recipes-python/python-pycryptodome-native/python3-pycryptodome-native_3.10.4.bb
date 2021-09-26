SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=accfa6aeaceb3ba96676edf18e78302c"

PYPI_PACKAGE = "pycryptodome"

SRC_URI[md5sum] = "99928e9159797372d7ee9d4a04bdad6e"
SRC_URI[sha256sum] = "40083b0d7f277452c7f2dd4841801f058cc12a74c219ee4110d65774c6a58bef"

inherit pypi
inherit setuptools3
inherit native
