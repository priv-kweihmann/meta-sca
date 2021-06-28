SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

DEPENDS += "\
            python3-chardet-native \
            python3-six-native \
           "

PYPI_PACKAGE = "python-debian"

SRC_URI[md5sum] = "fe56139d363e8bd1aefb65393542cd86"
SRC_URI[sha256sum] = "385dfb965eca75164d256486c7cf9bae772d24144249fd18b9d15d3cffb70eea"

inherit pypi
inherit setuptools3
inherit native
