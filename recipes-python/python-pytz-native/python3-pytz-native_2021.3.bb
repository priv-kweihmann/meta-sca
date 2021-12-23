SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "https://pythonhosted.org/pytz/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

PYPI_PACKAGE = "pytz"

SRC_URI[md5sum] = "d7b7060bbac4970afa2050c139c9fcb6"
SRC_URI[sha256sum] = "acad2d8b20a1af07d4e4c9d2e9285c5ed9104354062f275f3fcd88dcef4f1326"

inherit pypi
inherit setuptools3
inherit native
