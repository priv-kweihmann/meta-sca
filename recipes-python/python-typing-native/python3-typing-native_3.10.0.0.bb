SUMMARY = "Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing"

SRC_URI[md5sum] = "d6dd450cfe0c8c6547eef09a0491775d"
SRC_URI[sha256sum] = "13b4ad211f54ddbf93e5901a9967b1e07720c1d1b78d596ac6a439641aa1b130"

inherit pypi
inherit setuptools3
inherit native
