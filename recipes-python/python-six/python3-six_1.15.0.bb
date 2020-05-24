SUMMARY = "Python 2 and 3 compatibility library"
HOMEPAGE = "https://pypi.python.org/pypi/six/"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=43cfc9e4ac0e377acfb9b76f56b8415d"

SRC_URI[md5sum] = "9f90a0eaa0ea7747fda01ca79d21ebcb"
SRC_URI[sha256sum] = "30639c035cdb23534cd4aa2dd52c3bf48f06e5f4a941509c8bafd8ce11080259"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
