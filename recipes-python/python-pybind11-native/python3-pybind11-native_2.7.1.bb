SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "b955fa9250c1ca2f2a50a71ad82f91ea"
SRC_URI[sha256sum] = "8950aac5e5f4d505f7a0f067c5cb3893dcf098ff29cedfcb4ccf1e9e44d0bd9a"

inherit pypi
inherit setuptools3
inherit native
