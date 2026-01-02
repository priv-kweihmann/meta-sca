SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=416a9fa49f36fac8c5fd8a52cc755a59"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "6435ee3a08f0cf59ff75b452eaaa6378"
SRC_URI[sha256sum] = "2960f5838bbcca4d7765c40478ec56f938e3f161946ff84f00c06d2b3a0ba9dd"

inherit pypi
inherit setuptools3
inherit_defer native
