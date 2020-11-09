SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "1cc822c9a6716c44be8b86a9082816f7"
SRC_URI[sha256sum] = "4107de1fd612bf52953fd64dab7f94f11d2ab3548e1b761cbf8ebc87a2480912"

inherit pypi
inherit native
inherit setuptools3
