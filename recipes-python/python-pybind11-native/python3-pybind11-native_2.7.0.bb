SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "98d05c74baa0259ec5cc423a1055de85"
SRC_URI[sha256sum] = "3e2a9a94396fbb27e75acf28d3de26e029576be1d4b38acc846ae08ef0eb3033"

inherit pypi
inherit setuptools3
inherit native
