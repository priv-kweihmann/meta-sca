SUMMARY = "Powerful and Pythonic XML processing library combining libxml2/libxslt with the ElementTree API"
HOMEPAGE = "https://github.com/lxml/lxml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=e4c045ebad958ead4b48008f70838403"

DEPENDS += "\
            libxml2-native \
            libxslt-native \
            python3-cython-native \
           "

PYPI_PACKAGE = "lxml"

SRC_URI[md5sum] = "a1db76441a1cd5f4857b7b326c960791"
SRC_URI[sha256sum] = "520461c36727268a989790aef08884347cd41f2d8ae855489ccf40b50321d8d7"

inherit pkgconfig
inherit pypi
inherit setuptools3
inherit native
