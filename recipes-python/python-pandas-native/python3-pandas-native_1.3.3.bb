SUMMARY = "pandas library for high-performance data analysis tools"
HOMEPAGE = "http://pandas.pydata.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f23c5c092b74d245d48eeef72bc3fd2"

DEPENDS += "\
    python3-cython-native \
    python3-numpy-native \
    python3-python-dateutil-native \
    python3-pytz-native \
"

PYPI_PACKAGE = "pandas"

SRC_URI[sha256sum] = "272c8cb14aa9793eada6b1ebe81994616e647b5892a370c7135efb2924b701df"

inherit pypi
inherit setuptools3
inherit native
