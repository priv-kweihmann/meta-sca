SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "7d66b1a55f864e8a4f775c390256070c"
SRC_URI[sha256sum] = "46d315a669a59b660def6c5ca4e128f6fa975ec4abce6019a43d92084ad1bf89"

inherit pypi
inherit setuptools3
inherit native
