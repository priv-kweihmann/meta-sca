SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "a9f47fdcf8b5872211d1c802be0b1aba"
SRC_URI[sha256sum] = "40f8e57af6fcaa7eb5d727707125f90f8daa0993f28a9981a232d40c85dbbcb0"

inherit pypi
inherit setuptools3
inherit native
