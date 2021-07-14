SUMMARY = "pandas library for high-performance data analysis tools"
HOMEPAGE = "http://pandas.pydata.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f23c5c092b74d245d48eeef72bc3fd2"

DEPENDS += "\
    python3-numpy-native \
    python3-python-dateutil-native \
    python3-pytz-native \
"

SRC_URI[sha256sum] = "c554e6c9cf2d5ea1aba5979cc837b3649539ced0e18ece186f055450c86622e2"

inherit pypi
inherit setuptools3
inherit native
