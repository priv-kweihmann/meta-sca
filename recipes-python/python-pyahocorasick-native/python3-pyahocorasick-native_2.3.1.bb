SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=416a9fa49f36fac8c5fd8a52cc755a59"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "4f2627196bd843ceac43053ce583d707"
SRC_URI[sha256sum] = "9d0f6bb522237ed7f111ed59c9e8baea7d1e75813587b6773babd43bda35db9f"

inherit pypi
inherit setuptools3
inherit_defer native
