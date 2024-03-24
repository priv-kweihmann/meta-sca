SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=416a9fa49f36fac8c5fd8a52cc755a59"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "4c4e820880e359b3cf86bb63a67f00f5"
SRC_URI[sha256sum] = "4df4845c1149e9fa4aa33f0f0aa35f5a42957a43a3d6e447c9b44e679e2672ea"

inherit pypi
inherit setuptools3
inherit native
