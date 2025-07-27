SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=416a9fa49f36fac8c5fd8a52cc755a59"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "0fbb2fb9ec1182d030c7501893fe55b1"
SRC_URI[sha256sum] = "817f302088400a1402bf2f8631fdb21cf5a2666888e0d6a7d5a3ad556212e9da"

inherit pypi
inherit setuptools3
inherit_defer native
