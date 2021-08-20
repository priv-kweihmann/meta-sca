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

SRC_URI[sha256sum] = "cbcb84d63867af3411fa063af3de64902665bb5b3d40b25b2059e40603594e87"

inherit pypi
inherit setuptools3
inherit native
