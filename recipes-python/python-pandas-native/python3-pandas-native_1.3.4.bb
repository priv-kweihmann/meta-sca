SUMMARY = "pandas library for high-performance data analysis tools"
HOMEPAGE = "http://pandas.pydata.org/"
DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f23c5c092b74d245d48eeef72bc3fd2"

DEPENDS += "\
    python3-cython-native \
    python3-numpy-native \
    python3-python-dateutil-native \
    python3-pytz-native \
"

PYPI_PACKAGE = "pandas"

SRC_URI[sha256sum] = "a2aa18d3f0b7d538e21932f637fbfe8518d085238b429e4790a35e1e44a96ffc"

inherit pypi
inherit setuptools3
inherit native
