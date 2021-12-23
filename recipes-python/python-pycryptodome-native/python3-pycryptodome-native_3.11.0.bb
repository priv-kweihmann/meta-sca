SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=accfa6aeaceb3ba96676edf18e78302c"

PYPI_PACKAGE = "pycryptodome"

SRC_URI[md5sum] = "abd7988207ecbfa50a704e6b06f7b76e"
SRC_URI[sha256sum] = "428096bbf7a77e207f418dfd4d7c284df8ade81d2dc80f010e92753a3e406ad0"

inherit pypi
inherit setuptools3
inherit native
