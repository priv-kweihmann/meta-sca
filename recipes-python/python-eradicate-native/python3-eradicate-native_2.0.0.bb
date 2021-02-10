SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate;beginline=3;endline=23;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

SRC_URI[md5sum] = "77d267ed74b40faa3526609f6be636b5"
SRC_URI[sha256sum] = "27434596f2c5314cc9b31410c93d8f7e8885747399773cd088d3adea647a60c8"

inherit pypi
inherit setuptools3
inherit native
