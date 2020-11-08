SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"

DEPENDS = "boost"

SRC_URI = "git://github.com/pybind/pybind11.git"
SRCREV = "59a2ac2745d8a57ac94c6accced73620d59fb844"

S = "${WORKDIR}/git"

EXTRA_OECMAKE =  "-DPYBIND11_TEST=OFF"

inherit cmake
inherit setuptools3
inherit native

do_configure() {
    cmake_do_configure
}

do_compile() {
    distutils3_do_compile
    cmake_do_compile
}

do_install() {
    distutils3_do_install
    cmake_do_install
}
