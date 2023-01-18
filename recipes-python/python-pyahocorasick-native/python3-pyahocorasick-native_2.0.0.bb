SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=416a9fa49f36fac8c5fd8a52cc755a59"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "32d4eb1053c0c84a47b1bd3b77c8797c"
SRC_URI[sha256sum] = "2985cac6d99c0e9165617fe154b4db0b50c4c2819791c2ad5f0aac0c6a6e58c5"

inherit pypi
inherit setuptools3
inherit native
