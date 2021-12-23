SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"


PYPI_PACKAGE = "pybind11"

SRC_URI[md5sum] = "2fb29e67a2158f80d2038ba619847629"
SRC_URI[sha256sum] = "2ff4e50f171e3ae12b11c69e6ad49b05aa5e4b7eaa17b8148bee3cb3f0e4284b"

inherit pypi
inherit setuptools3
inherit native
