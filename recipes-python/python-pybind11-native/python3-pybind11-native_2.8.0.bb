SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "609afc401499547fc26a575d4414a513"
SRC_URI[sha256sum] = "58e866369d184fdefb468377773a8bc707267a553039198b15309679bbc0a3f6"

inherit pypi
inherit setuptools3
inherit native
