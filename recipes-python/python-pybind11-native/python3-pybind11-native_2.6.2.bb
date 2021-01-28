SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "964c40d79b13f26edc088b262ff4fc38"
SRC_URI[sha256sum] = "d0e0aed9279656f21501243b707eb6e3b951e89e10c3271dedf3ae41c365e5ed"

inherit pypi
inherit native
inherit setuptools3
