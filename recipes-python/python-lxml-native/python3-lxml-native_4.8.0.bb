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

SRC_URI[md5sum] = "ddb9f25a41ca5fb4f7d174a9d74bfa46"
SRC_URI[sha256sum] = "f63f62fc60e6228a4ca9abae28228f35e1bd3ce675013d1dfb828688d50c6e23"

inherit pkgconfig
inherit pypi
inherit setuptools3
inherit native
