SUMMARY = "Cryptographic library for Python"
HOMEPAGE = "https://github.com/Legrandin/pycryptodome/"

LICENSE = "BSD-2-Clause & Apache-2.0 & PD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=accfa6aeaceb3ba96676edf18e78302c"

PYPI_PACKAGE = "pycryptodome"

SRC_URI[md5sum] = "04765bec00306c1051988b672cdbaaea"
SRC_URI[sha256sum] = "3e2e3a06580c5f190df843cdb90ea28d61099cf4924334d5297a995de68e4673"

inherit pypi
inherit setuptools3
inherit native
