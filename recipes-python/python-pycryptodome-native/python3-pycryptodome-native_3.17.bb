SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=29242a70410a4eeff488a28164e7ab93"

PYPI_PACKAGE = "pycryptodome"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "4596bf2c6cc6b6f9305f7bae1780e0fc"
SRC_URI[sha256sum] = "bce2e2d8e82fcf972005652371a3e8731956a0c1fbb719cc897943b3695ad91b"

inherit pypi
inherit setuptools3
inherit native
