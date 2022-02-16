SUMMARY = "pandas library for high-performance data analysis tools"
HOMEPAGE = "http://pandas.pydata.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f23c5c092b74d245d48eeef72bc3fd2"

DEPENDS += "\
    python3-cython-native \
    python3-numpy-native \
    python3-python-dateutil-native \
    python3-pytz-native \
"

PYPI_PACKAGE = "pandas"

SRC_URI[sha256sum] = "8db93ec98ac7cb5f8ac1420c10f5e3c43533153f253fe7fb6d891cf5aa2b80d2"

inherit pypi
inherit setuptools3
inherit native
